package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Juego implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Connection conexion;
	private ArrayList<Personaje> listaPersonajes;
	private ArrayList<Partida> listaPartidas;
	
	public Juego() {
		listaPersonajes = new ArrayList<Personaje>();
		listaPartidas = new ArrayList<Partida>();
		
	}

	public ArrayList<Personaje> getListaPersonajes() {
		return listaPersonajes;
	}

	public void setListaPersonajes(ArrayList<Personaje> listaPersonajes) {
		this.listaPersonajes = listaPersonajes;
	}

	public ArrayList<Partida> getListaPartidas() {
		return listaPartidas;
	}

	public void setListaPartidas(ArrayList<Partida> listaPartidas) {
		this.listaPartidas = listaPartidas;
	}
	
	public void altaCj(int id, String nombre, String fechaNacimiento) {
		listaPersonajes.add(new Cj(id, nombre, fechaNacimiento));
		Collections.sort(listaPersonajes);
	}
	
	public void altaRelleno(int id, String nombre, int cantidad_dinero) {
		listaPersonajes.add(new Relleno(id, nombre, cantidad_dinero));
		Collections.sort(listaPersonajes);
	}
	
	public void altaPartida(String nombre, int recompensa, String nombreCj) {
		if (!comprobarPartida(nombre) && comprobarCj(nombreCj)) {
			listaPartidas.add(new Partida(nombreCj, recompensa, devuelveCj(nombreCj)));
		}
	}
	
	public void registrarRellenoPartida(String nombreRelleno,  String nombrePartida) {
		if (comprobarRelleno(nombreRelleno) && comprobarPartida(nombrePartida)) {
			devuelvePartida(nombrePartida).getListaRelleno().add(devuelveRelleno(nombreRelleno));
		}
	}
	
	public void conectarBase() throws SQLException {
        String servidor = "jdbc:mysql://localhost:3306/juego";
        conexion = DriverManager.getConnection(servidor, "root", "");
    }

    public void guardarCj() throws SQLException {
        String query = "INSERT INTO cj (id, nombre, fecha_nacimiento) VALUES (?,?,?)";
        PreparedStatement sentencia = conexion.prepareStatement(query);

        for (Personaje personaje : listaPersonajes) {
            if (personaje instanceof Cj) {
                sentencia.setInt(1, personaje.getId());
                sentencia.setString(2, personaje.getNombre());
                sentencia.setDate(3, ((Cj) personaje).getFechaNacimiento());
                sentencia.executeUpdate();
            }
        }
    }

    public void guardarRelleno() throws SQLException {
    	String query = "INSERT INTO relleno (id, nombre, cantidad_dinero) VALUES (?,?,?)";
    	PreparedStatement sentencia = conexion.prepareStatement(query);
    	
    	for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Relleno) {
				sentencia.setInt(1, personaje.getId());
				sentencia.setString(2, personaje.getNombre());
				sentencia.setInt(3, ((Relleno) personaje).getCantidad_dinero());
				sentencia.executeUpdate();
			}
		}
    			
    }

    public void cargarCj() throws SQLException {
        String query = "SELECT * FROM cj";
        PreparedStatement sentencia = conexion.prepareStatement(query);
        ResultSet resultado = sentencia.executeQuery();
        
        while (resultado.next()) {
            System.out.println(resultado.getInt(1)+", "+resultado.getString(2)+", "+resultado.getDate(3));
        }
    }

    public void cargarRelleno() throws SQLException {
    	String query = "SELECT * FROM relleno";
    	PreparedStatement sentencia = conexion.prepareStatement(query);
    	ResultSet resultado = sentencia.executeQuery();
    	
    	while (resultado.next()) {
    		System.out.println(
    				resultado.getInt(1)+" ,"+
    				resultado.getString(2)+", "+
    				resultado.getInt(3));
    	}
    }

	public void eliminarCj (int id) throws SQLException {
		String query = "DELETE from cj WHERE id =?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setInt(1, id);
		sentencia.execute();
	}
	
	//select
	public void actualizarNombreCj(int id, String nombre) throws SQLException {
		String query = "UPDATE cj SET nombre=? WHERE id=?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, nombre);
		sentencia.setInt(2, id);
		sentencia.execute();
	
	}
	
	public void cargarCjEspecifico (int id) throws SQLException {
		String query = "SELECT * FROM cj WHERE id =?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setInt(1, id);
		ResultSet resultado = sentencia.executeQuery();
		
		while (resultado.next()) {
			System.out.println(resultado.getInt(1)+", "+resultado.getString(2)+", "+resultado.getDate(3));
		}
		
	}
	
	public void eliminarRelleno(String nombre) throws SQLException {
		String query = "DELETE FROM relleno WHERE nombre =?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, nombre);
		sentencia.execute();
	}
	
<<<<<<< HEAD
=======
	
	//fichero secuenciles
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
	public void guardarDatos() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(new File("datos.dat")));
			escritor.writeObject(listaPartidas);
			escritor.writeObject(listaPersonajes);
			escritor.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void guardarNombreCj() {
		try (RandomAccessFile f = new RandomAccessFile("Nombre.txt", "rw")){
			for (Personaje personaje : listaPersonajes) {
				if (personaje instanceof Cj) {
<<<<<<< HEAD
					f.seek(f.length());
					f.writeUTF(personaje.getNombre());
				}
			}
			f.close();
=======
					f.writeUTF(personaje.getNombre());
				}
			}
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarDatosConRaf() {
<<<<<<< HEAD
		try {
			RandomAccessFile f = new RandomAccessFile("datos.dat", "rw");
			
			f.seek(f.length());
			
			for (Partida partida : listaPartidas) {
				f.writeUTF(partida.getNombre());
			}
			
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public void mostarDatosConRaf() {
		String nombre;
		try {
			RandomAccessFile f = new RandomAccessFile("datos.dat", "rw");
			nombre = f.readUTF();
			System.out.println("Nombre "+nombre);
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void vectorDJs() {
		String[] vectorNombres = new String[listaPersonajes.size()];
		
		for (int i = 0; i < listaPersonajes.size(); i++) {
			Personaje p = listaPersonajes.get(i);
			if (p instanceof Cj) {
				vectorNombres[i] = p.getNombre();
			}
			
		}
		
		int[] vectorId = new int [listaPersonajes.size()];
		
		for (int i = 0; i < listaPersonajes.size(); i++) {
			Personaje p = listaPersonajes.get(i);
			if (p instanceof Cj) {
				vectorId[i] = p.getId();
			}
		}
		
		for (int i = 0; i < listaPersonajes.size(); i++) {
			System.out.println("["+vectorNombres[i]+"]"+"["+vectorId[i]+"]");
		}
	}
=======
		try (RandomAccessFile f = new RandomAccessFile("datos.dat", "rw")) {
            // Guardar lista de partidas
			//Partida(nombre, recompensa, cj)
			
            f.writeInt(listaPartidas.size());
            
            for (Partida partida : listaPartidas) {
                f.writeUTF(partida.getNombre());
                f.writeInt(partida.getRecompensa());
                
               Cj cj = partida.getCj();
                f.writeInt(cj.getId());
                f.writeUTF(cj.getNombre());
                f.writeLong(cj.getFechaNacimiento().getTime());
                
                f.writeInt(partida.getListaRelleno().size());
            }

            //PERSONAJES
            // Guardar lista de personajes
            f.writeInt(listaPersonajes.size());
            
            for (Personaje personaje : listaPersonajes) {
              if (personaje instanceof Cj) {
				f.writeInt(personaje.getId());
				f.writeUTF(personaje.getNombre());
				f.writeLong(((Cj) personaje).getFechaNacimiento().getTime());
				}
              
              if (personaje instanceof Relleno) {
				f.writeInt(personaje.getId());
				f.writeUTF(personaje.getNombre());
				f.writeInt(((Relleno) personaje).getCantidad_dinero());
				}
            }
            
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
	
	//secuenciales
	@SuppressWarnings({ "unchecked"})
	public void cargarDatos() {
		try {
			ObjectInputStream lector = new ObjectInputStream(new FileInputStream("datos.dat"));
			listaPartidas = (ArrayList<Partida>) lector.readObject();
			listaPersonajes = (ArrayList<Personaje>) lector.readObject();
			
			lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void listarCj() {
		for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Cj) {
				System.out.println(personaje);
			}
		}
	}
	
	public void listarRelleno() {
		for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Relleno) {
				System.out.println(personaje);
			}
		}
	}
	
	public void listarPartidas() {
		for (Partida partida : listaPartidas) {
			System.out.println(partida);
		}
	}
	
	public boolean comprobarPartida(String nombrePartida) {
		for (Partida partida : listaPartidas) {
			if (partida.getNombre().equalsIgnoreCase(nombrePartida)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarCj(String nombreCj) {
		for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Cj) {
				if (personaje.getNombre().equalsIgnoreCase(nombreCj)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean comprobarRelleno(String nombreRelleno) {
		for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Relleno) {
				if (personaje.getNombre().equalsIgnoreCase(nombreRelleno)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Cj devuelveCj(String nombreCj) {
		for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Cj) {
				if (personaje.getNombre().equalsIgnoreCase(nombreCj)) {
					return (Cj) personaje;
				}
			}
		}
		return null;
	}
	
	public Partida devuelvePartida(String nombrePartida) {
		for (Partida partida : listaPartidas) {
			if (partida.getNombre().equalsIgnoreCase(nombrePartida)) {
				return partida;
			}
		}
		return null;
	}
	
	public Relleno devuelveRelleno(String nombreRelleno) {
		for (Personaje personaje : listaPersonajes) {
			if (personaje instanceof Relleno) {
				if (personaje.getNombre().equalsIgnoreCase(nombreRelleno)) {
					return (Relleno) personaje;
				}
			}
		}
		return null;
	}
}
