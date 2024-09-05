package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Discoteca {
	Connection conexion;
	private ArrayList<Personal> personal;
	private ArrayList<Cliente> cliente;
	private ArrayList<Entrada> entrada;
	
	public Discoteca() {
		personal= new ArrayList<Personal>();
		cliente = new ArrayList<Cliente>();
		entrada = new ArrayList<Entrada>();
	}
	
	//metodo dar de alta
	public void altaDj(String nombre, String dni, float sueldo, String tipoMusica) {
		personal.add(new Dj(nombre, dni, sueldo, tipoMusica));
		Collections.sort(personal);
	}
	public void altaCamarero(String nombre, String dni, String genero, int antiguedad) {
		personal.add(new Camarero(nombre, dni, genero, antiguedad));
		Collections.sort(personal);
	}
	
	public void altaEntrada(String codigo, float precio, boolean vip) {
		for(Entrada entradas : entrada) {
			if(!entradas.getCodigo().equals(codigo)) {
				entrada.add(new Entrada(codigo, precio, vip));
				Collections.sort(entrada);
			}
		}
	}
	
	public void altaCliente (String nombre, String dni, LocalDate fechaNacimiento) {
		for (Cliente clientes : cliente) {
			if(!clientes.getDni().equals(dni)) {
				cliente.add(new Cliente(nombre, dni, fechaNacimiento));
			}
		}
	}
	
	//metodo cliente entrada
	public void crearEntradaCliente (String dni, String codigo) {
		if (clienteExiste(dni)) {
			if(entradaExiste(codigo)&&clienteExiste(dni)) {
				devuelveCliente(dni).getEntrada().add(devuelveEntrada(codigo));
				}
			}
	}
	//metodo listar
	public void listarPersonal() {
		for(Personal personales : personal) {
			System.out.println(personales);
		}
	}
	
	public void listarCliente() {
		for(Cliente clientes : cliente) {
			System.out.println(clientes);
		}
	}
	
	public void listarEntrada() {
		for(Entrada entradas : entrada) {
			System.out.println(entradas);
		}
	}
	
	//metodo existe
	public boolean personalExiste(String dni) {
		for(Personal personales : personal) {
			if(personales.getDni().equals(dni)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean clienteExiste(String dni) {
		for(Cliente clientes : cliente) {
			if(clientes.getDni().equals(dni)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean entradaExiste(String codigo) {
		for(Entrada entradas : entrada) {
			if(entradas.getCodigo().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	
	//metood devuelve
	public Personal devuelvePersonal(String dni) {
		for(Personal personales : personal) {
			if(personales.getDni().equals(dni)) {
				return personales;
			}
		}
		return null;
	}
	
	public Cliente devuelveCliente(String dni) {
		for(Cliente clientes : cliente) {
			if(clientes.getDni().equals(dni)) {
				return clientes;
			}
		}
		return null;
	}
	
	public Entrada devuelveEntrada(String codigo) {
		for(Entrada entradas : entrada) {
			if(entradas.getCodigo().equals(codigo)) {
				return entradas;
			}
		}
		return null;
	}
	
	public void conectarBBDD() {
		String servidor = "jdbc:mysql://localhost:3306/personal";
		try {
			conexion = DriverManager.getConnection(servidor, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// GUARDAR ARTISTAS BASE DATOS
		public void guardarDjBBDD() {
			String query = "INSERT INTO dj(dni, nombre, sueldo, tipoMusica) VALUES (?,?,?,?)";
			try {
				PreparedStatement sentencia = conexion.prepareStatement(query);
				for (Personal personal : personal) {
					if (personal instanceof Dj) {
						sentencia.setString(1, personal.getDni());
						sentencia.setString(2, personal.getNombre());
						sentencia.setFloat(3, ((Dj) personal).getSueldo());
						sentencia.setString(4, ((Dj) personal).getTipoMusica());
						sentencia.executeUpdate();
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// CARGAR ARTISTAS DE BASE DATOS
		public void cargarDjBBDD() throws SQLException {
			String query = "SELECT * FROM dj";
			PreparedStatement sentencia = conexion.prepareStatement(query);
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				System.out.println(resultado.getString(2) + ", " + resultado.getString(3) + ", " + resultado.getFloat(4)
						+ ", " + resultado.getString(5));
			}
		}
		
		// GUARDAR ARTISTAS BASE DATOS
				public void guardarCamarerosBBDD() {
					String query = "INSERT INTO camarero(dni, nombre, genero) VALUES (?,?,?)";
					try {
						PreparedStatement sentencia = conexion.prepareStatement(query);
						for (Personal personal : personal) {
							if (personal instanceof Camarero) {
								sentencia.setString(1, personal.getDni());
								sentencia.setString(2, personal.getNombre());
								sentencia.setString(3, ((Camarero) personal).getGenero());
								sentencia.executeUpdate();
							}
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				// CARGAR ARTISTAS DE BASE DATOS
				public void cargarCamareroBBDD() throws SQLException {
					String query = "SELECT * FROM camarero";
					PreparedStatement sentencia = conexion.prepareStatement(query);
					ResultSet resultado = sentencia.executeQuery();
					while (resultado.next()) {
						System.out.println(resultado.getString(2) + ", " + resultado.getString(3) + ", " + resultado.getString(4));
					}
				}
}