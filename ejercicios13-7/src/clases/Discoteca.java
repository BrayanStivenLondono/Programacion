package clases;

import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Discoteca {
	private Connection conexion;
	private ArrayList<Entrada> listaEntradas;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Personal> listaPersonal;

	public Discoteca() {
		listaEntradas = new ArrayList<Entrada>();
		listaClientes = new ArrayList<Cliente>();
		listaPersonal = new ArrayList<Personal>();
	}

	public ArrayList<Entrada> getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(ArrayList<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(ArrayList<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}
	
	public void altaDJ(String  dni, String nombre, double sueldo, String tipoMusica) {
		listaPersonal.add(new DJ(dni, nombre, sueldo, tipoMusica));
		Collections.sort(listaPersonal);
	}
	
	public void altaCamarero(String nombre, String dni, String genero) {
		listaPersonal.add(new Camarero(nombre, dni, genero));
		Collections.sort(listaPersonal);
	}
	
	public void altaEntrada(String codigo, double precio, boolean vip) {
		if (!comprobarEntrada(codigo)) {
			listaEntradas.add(new Entrada(codigo, precio, vip));
			Collections.sort(listaEntradas);
		} 
	}
	
	public void altaCliente(String nombre, String dni, LocalDate fechaNacimiento) {
		listaClientes.add(new Cliente(nombre, dni, fechaNacimiento));
		
	}
	
	public void crearEntradaCliente(String nombre, String codigo) {
		if (comprobarEntrada(codigo) && comprobarCliente(nombre)) {
			devolverCliente(nombre).getEntradas().add(devolverEntrada(codigo));
		} else {
			System.out.println("Cliente o Entrada no existente");
		}
	}
	
	public void guardarSueldoFichero() {
		try {
			RandomAccessFile fichero = new RandomAccessFile("datos.txt", "rw");
						
			for (Personal personal : listaPersonal) {
				if (personal instanceof DJ) {
					fichero.seek(fichero.length());
					fichero.writeDouble(((DJ) personal).getSueldo());
				}
			}
			
			fichero.close();
			
			RandomAccessFile fichero2 = new RandomAccessFile("datos.txt", "rw");
			fichero2.readDouble();
			fichero2.close();
			
		} catch (Exception e) {
		}
	}
	
	public void conectarBBDD() {
		String servidor = "jdbc:mysql://localhost:3306/discoteca";
		try {
			conexion = DriverManager.getConnection(servidor, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarDjBBDD() throws SQLException {
		String query = "INSERT INTO dj (dni, nombre, sueldo, tipoMusica)"+ 
					   "VALUES (?,?,?,?)";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Personal personal : listaPersonal) {
			if (personal instanceof DJ) {
				sentencia.setString(1, personal.getDni());
				sentencia.setString(2, personal.getNombre());
				sentencia.setDouble(3, ((DJ) personal).getSueldo());
				sentencia.setString(4, ((DJ) personal).getTipoMusica());
				sentencia.execute();
				
			}
		}
	}
	
	public void guardarCamarerosBBDD() throws SQLException {
		String query = "INSERT INTO camarero (dni, nombre, genero)"+ 
						"VALUES (?,?,?)";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Personal personal : listaPersonal) {
			if (personal instanceof Camarero) {
				sentencia.setString(1, personal.getDni());
				sentencia.setString(2, personal.getNombre());
				sentencia.setString(3, ((Camarero) personal).getGenero());
				sentencia.execute();
				
			}
		}
		
	}
	
	public void cargarDjBBDD() throws SQLException {
		String query = "SELECT * FROM dj";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getString(2)+", "+
							   resultado.getString(3)+", "+
							   resultado.getDouble(4)+", "+
							   resultado.getString(5));
			
		}
	}
	
	public void cargarCamarerosBBDD() throws SQLException {
		String query = "SELECT * FROM camarero";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getString(2)+", "+
							   resultado.getString(3)+", "+
							   resultado.getString(4));
			
		}
	}
	
	public void actualizarSueldoDjBBDD(double nuevoSueldo, String nombreDj) throws SQLException {
		String query = "UPDATE dj "
					 + "SET sueldo=?"
					 + "WHERE nombre =?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setDouble(1, nuevoSueldo);
		sentencia.setString(2, nombreDj);
		sentencia.execute();
	}
	
	public void eliminarCamareroBBDD(String nombreCamarero) throws SQLException {
		String query = "DELETE FROM camarero WHERE nombre =?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, nombreCamarero);
		sentencia.execute();
	}
	
	public void matrizDJ() {
		String[][] matriz = new String[3][listaPersonal.size()];
		
		for (int i = 0; i < listaPersonal.size(); i++) {
			Personal cliente = listaPersonal.get(i);
				matriz[0][i] = cliente.getDni();
				matriz[1][i] = cliente.getNombre();
				if (cliente instanceof DJ) {
					matriz[2][i] = ((DJ) cliente).getTipoMusica();
				}
		}
		
		for (int i = 0; i < listaPersonal.size(); i++) {
			System.out.println("["+matriz[0][i]+"]"+"["+matriz[1][i]+"]"+"["+matriz[2][i]+"]");
		}
	}
	
	public Cliente devolverCliente(String nombre) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				return cliente;
			}
		}
		return null;
	}
	
	public Entrada devolverEntrada(String codigo) {
		for (Entrada entrada : listaEntradas) {
			if (entrada.getCodigo().equalsIgnoreCase(codigo)) {
				return entrada;
			}
		}
		return null;
	}
	
	public boolean comprobarCliente(String nombre) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarEntrada(String codigo) {
		for (Entrada entrada : listaEntradas) {
			if (entrada.getCodigo().equalsIgnoreCase(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	public void listarClientes() {
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
	}
	
	public void listarEntradas() {
		for (Entrada entrada : listaEntradas) {
			System.out.println(entrada);
		}
	}
	
	public void listarDJs() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof DJ) {
				System.out.println(personal);
			}
		}
	}
	
	public void listarCamarero() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Camarero) {
				System.out.println(personal);
			}
		}
	}
	
}
