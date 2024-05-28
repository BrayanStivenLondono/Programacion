package clases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;//cargar (selet )
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Festival {
	private ArrayList<Conciertos> listaConciertos;
	private ArrayList<Personal> listaPersonal;
	private Connection conexion;

	public Festival() {
		this.listaConciertos = new ArrayList<Conciertos>();
		this.listaPersonal = new ArrayList<Personal>();
	}

	
	public ArrayList<Conciertos> getListaConciertos() {
		return listaConciertos;
	}

	public void setListaConciertos(ArrayList<Conciertos> listaConciertos) {
		this.listaConciertos = listaConciertos;
	}

	public ArrayList<Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(ArrayList<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	
	// ALTA ARTISTA
	public void altaArtista(String dni, String nombre, String estiloMusica, String cache) {
		listaPersonal.add(new Artista(dni, nombre, estiloMusica, Float.valueOf(cache)));
		Collections.sort(listaPersonal);
	}

	// ALTA ASISTENTE
	public void altaAsistente(String dni, String nombre, String fechaNacimiento, String nacionalidad) {
		listaPersonal.add(new Asistente(
				dni, 
				nombre, 
				fechaNacimiento, 
				nacionalidad));
		Collections.sort(listaPersonal);
	}

	// ALTA CONCIERTO
	public void altaConcierto(String codigo, String nombre, String horaInicio, String dniArtista) {
		if (compruebaConcierto(codigo) == false && compruebaArtista(dniArtista)) {
			listaConciertos.add(new Conciertos(
					codigo, 
					nombre, 
					horaInicio, 
					devuelveArtista(dniArtista)));
			Collections.sort(listaConciertos);
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}

	// REGISTRAR ASISTENTES EN CONCIERTO
	public void registrarAsistenteConcierto(String codigoConcierto, String dniAsistente) {
		if (compruebaConcierto(codigoConcierto) && compruebaAsistente(dniAsistente)) {
			devuelveConcierto(codigoConcierto).getAsistentes().add(devuelveAsistente(dniAsistente));
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}

	// LISTAR ARTISTAS
	public void listarArtistas() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Artista) {
				System.out.println(personal);
			}
		}
	}

	// LISTAR ASISTENTES
	public void listarAsistentes() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Asistente) {
				System.out.println(personal);
			}
		}
	}

	// LISTAR CONCIERTOS
	public void listarConciertos() {
		for (Conciertos con : listaConciertos) {
			System.out.println(con);
		}
	}

	// GUARDAR DATOS FICHERO
	@SuppressWarnings("resource")
	public void guardarDatos() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(new File("src/datos.dat")));
			escritor.writeObject(listaConciertos);
			escritor.writeObject(listaPersonal);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// CONECTAR BASE DATOS
	public void conectarBBDD() throws SQLException {
		String servidor = "jdbc:mysql://localhost:3306/festival3ev";
		Connection conexion = DriverManager.getConnection(servidor,"root","");
	
	}

	// GUARDAR ARTISTAS BASE DATOS
	public void guardarArtistasBBDD(String dni, String nombre, String estilo, String cache) throws SQLException {
		String query = "insert into artistas (dni, nombre, estilo, cache) values (?,?,?,?)";
		
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Personal personal : listaPersonal) {
			if (personal instanceof Artista) {
				sentencia.setString(1, personal.getDni());
				sentencia.setString(2, personal.getNombre());
				sentencia.setString(3, ((Artista) personal).getEstilo());
				sentencia.setDouble(4, ((Artista) personal).getCache());
				sentencia.execute();
			}
		}
	}
	
	public void guardarAsistenteBBDD(String dni, String nombre, String fechaNacimiento, String nacionalidad) throws SQLException {
		String query = "insert into asistentes (dni, nombre, fechaNacimiento, nacionalidad) values (?,?,?,?);";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Personal personal : listaPersonal) {
			if (personal instanceof Asistente) {
				sentencia.setString(1, personal.getDni());
				sentencia.setString(2, personal.getNombre());
				sentencia.execute();
			}
		}
	}

	// CARGAR ARTISTAS DE BASE DATOS (selecionar)
	public void cargarArtistasBBDD() throws SQLException {
		String query = "select * from artistas";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		
		while (resultado.next()) {
			System.out.println( resultado.getString(2)+", "+
								resultado.getString(3)+", "+
								resultado.getString(4)+", "+
								resultado.getDouble(5));
		}
	}

	// CARGAR ASISTENTES DE BASE DATOS
	public void cargarAsistentesBBDD() throws SQLException {
		String query = "select * from asistentes";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		
		while (resultado.next()) {
			System.out.println( resultado.getString(2)+", "+
								resultado.getString(3)+", "+
								resultado.getString(4)+", "+
								resultado.getString(5));
		}
	}

	// comprobaciones

	// compruebaConcierto
	public boolean compruebaConcierto(String codigo) {
		boolean existe = false;
		for (Conciertos concierto : listaConciertos) {
			if (concierto.getCodigo().equals(codigo)) {
				existe = true;
			}
		}
		return existe;
	}

	// compruebaArtista
	public boolean compruebaArtista(String dni) {
		boolean existe = false;
		for (Personal personal : listaPersonal) {
			if (personal instanceof Artista) {
				if (personal.getDni().equalsIgnoreCase(dni)) {
					existe = true;
				}
			}
		}
		return existe;
	}

	// compruebaAsistente
	public boolean compruebaAsistente(String dni) {
		boolean existe = false;
		for (Personal personal : listaPersonal) {
			if (personal instanceof Asistente) {
				if (personal.getDni().equalsIgnoreCase(dni)) {
					existe = true;
				}
			}
		}
		return existe;
	}

	// devuelveArtista
	public Artista devuelveArtista(String dni) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Artista) {
				if (personal.getDni().equalsIgnoreCase(dni)) {
					return (Artista) personal;
				}
			}
		}
		return null;
	}

	// devuelveAsistente
	public Asistente devuelveAsistente(String dni) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Asistente) {
				if (personal.getDni().equalsIgnoreCase(dni)) {
					return (Asistente) personal;
				}
			}
		}
		return null;
	}

	// devuelveConciertos
	public Conciertos devuelveConcierto(String codigo) {
		for (Conciertos concierto : listaConciertos) {
			if (concierto.getCodigo().equalsIgnoreCase(codigo)) {
				return concierto;
			}
		}
		return null;
	}

}
