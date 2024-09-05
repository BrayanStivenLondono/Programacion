package clases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class LaCasaDePapel {
	private ArrayList<Robo> robos;
	private ArrayList<Protagonista> protagonistas;
	private Connection conexion;
	
	public LaCasaDePapel() {
		robos = new ArrayList<Robo>();
		protagonistas = new ArrayList<Protagonista>();
	}

	public ArrayList<Robo> getRobo() {
		return robos;
	}

	public void setRobo(ArrayList<Robo> robo) {
		this.robos = robo;
	}

	public ArrayList<Protagonista> getProtagonistas() {
		return protagonistas;
	}

	public void setProtagonistas(ArrayList<Protagonista> protagonistas) {
		this.protagonistas = protagonistas;
	}
	
	public void altaLadron(String nombre, String nombreSerie, String rol, boolean antecedente) {
		protagonistas.add(new Ladron(nombre, nombreSerie, rol, antecedente));
		Collections.sort(protagonistas);
	}
	
	public void altaInpectora(String nombre, String nombreSerie, int anyosCargo) {
		protagonistas.add(new Inspectora(nombre, nombreSerie, anyosCargo));
		Collections.sort(protagonistas);
	}
	
	public void altaRobo(String nombreBanco, String nombreInspectora) {
			robos.add(new Robo(nombreBanco, devulverInspectora(nombreInspectora)));
			Collections.sort(robos);
	}
	
	public void introducirLadronesRobo(String nombreLadron, String nombreBanco) {
		if (comprobarLadron(nombreLadron) && comprobarRobo(nombreBanco)) {
			devulverRobo(nombreBanco).getListaProtagonistas().add(devulverladron(nombreLadron));	
			
		}
	}
	
	public void conectarBBDD() {
		try {
			String servidor = "jdbc:mysql://localhost:3306/LaCasaDePapel";
			conexion = DriverManager.getConnection( servidor, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarLadronesBBDD() {
		try {
			String query = "INSERT INTO ladrones (nombre, nombreSerie, rol) VALUES (?,?,?)";
			PreparedStatement sentencia = conexion.prepareStatement(query);
			for (Protagonista prota : protagonistas) {
				if (prota instanceof Ladron) {
					sentencia.setString(1, prota.getNombre());
					sentencia.setString(2, prota.getNombreSerie());
					sentencia.setString(3, ((Ladron) prota).getRol());
					sentencia.execute();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void mostrarLadronesBBDD() {
		String query = "SELECT * FROM ladrones";
		try {
			PreparedStatement sentencia = conexion.prepareStatement(query);
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				System.out.println(resultado.getInt(1)+", "+
								   resultado.getString(2)+", "+
								   resultado.getString(3)+", "+
								   resultado.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void modificarAntecentesLadronesBBDD(String nombreSerie, boolean antecedente) {
		String query = "UPDATE ladrones SET antecedentes =? WHERE nombreSerie =?";
		try {
			PreparedStatement sentencia = conexion.prepareStatement(query);
			sentencia.setBoolean(1, antecedente);
			sentencia.setString(2, nombreSerie);
			sentencia.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void guardarLadronesFichero() {
		try {
			RandomAccessFile f = new RandomAccessFile("datos.txt", "rw");
			for (Protagonista prota : protagonistas) {
				if (prota instanceof Ladron) {
					f.seek(f.length());
					
					f.writeUTF(prota.getNombre());
				}
			}
			
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void matrizLadrones() {
		String[][] protagonistas = {
	            {"Pedro Alonso", "Berlín"},
	            {"Jaime Lorente", "Denver"},
	            {"Álvaro Morte", "El Profesor"},
	            {"Itziar Ituño", "Inspectora"},
	            {"Paco Tous", "Moscú"},
	            {"Alba Flores", "Nairobi"},
	            {"Miguel Herrán", "Río"},
	            {"Úrsula Corberó", "Tokyo"}
	        };
		
		for (int i = 0; i < protagonistas.length; i++) {
            System.out.println("[" + protagonistas[i][0] + "] [" + protagonistas[i][1] + "]");
        }
	}
	
	public void matrizDirecta() {
        String[][] matrizProta = new String[2][protagonistas.size()];

        for (int i = 0; i < protagonistas.size(); i++) {
            Protagonista prota = protagonistas.get(i);
            matrizProta[0][i] = prota.getNombre();
            matrizProta[1][i] = prota.getNombreSerie();
        }
        
        for (int i = 0; i < protagonistas.size(); i++) {
            System.out.print("["+matrizProta[0][i]+"] ");
            System.out.println("["+matrizProta[1][i]+"] "); 
        }
	}
	
	public boolean comprobarInspectora(String nombreSerie) {
		for (Protagonista prota : protagonistas) {
			if (prota instanceof Inspectora) {
				if (prota.getNombreSerie().equalsIgnoreCase(nombreSerie)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean comprobarLadron(String nombreSerie) {
		for (Protagonista prota : protagonistas) {
			if (prota instanceof Ladron) {
				if (prota.getNombreSerie().equalsIgnoreCase(nombreSerie)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean comprobarRobo(String nombreBanco) {
		for (Robo robo : robos) {
			if (robo.getNombreBanco().equalsIgnoreCase(nombreBanco)) {
				return true;
			}
		}
		return false;
	}
	
	public Inspectora devulverInspectora(String nombreSerie) {
		for (Protagonista prota : protagonistas) {
			if (prota instanceof Inspectora) {
				if (prota.getNombre().equalsIgnoreCase(nombreSerie)) {
					return (Inspectora) prota;
					}
				}
			}
		return null;
	}
	
	public Ladron devulverladron(String nombreSerie) {
		for (Protagonista prota : protagonistas) {
			if (prota instanceof Ladron) {
				if (prota.getNombreSerie().equalsIgnoreCase(nombreSerie)) {
					return (Ladron) prota;
					}
				}
			}
		return null;
	}
	
	public Robo devulverRobo(String nombreBanco) {
		for (Robo robo : robos) {
			if (robo.getNombreBanco().equalsIgnoreCase(nombreBanco)) {
				return robo;
			}
		}
		return null;
	}
	
	public void listarLadrones() {
		for (Protagonista prota : protagonistas) {
			if (prota instanceof Ladron) {
				System.out.println(prota);
			}
		}
	}
	
	public void listarInspectora() {
		for (Protagonista prota : protagonistas) {
			if (prota instanceof Inspectora) {
				System.out.println(prota);
			}
		}
	}
	
	public void listarRobos() {
		for (Robo robo : robos) {
			System.out.println(robo);
		}
	}
}