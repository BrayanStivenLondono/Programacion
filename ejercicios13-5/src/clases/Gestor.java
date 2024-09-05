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
import java.util.Iterator;

public class Gestor {
	private Connection conexion;
	private ArrayList<Atraccion> atracciones;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Personal> listaPersonal;
	private ArrayList<Entrada> listaEntradas;

	
	public Gestor () {
		atracciones = new ArrayList<Atraccion>();
		listaClientes = new ArrayList<Cliente>();
		listaPersonal = new ArrayList<Personal>();
		listaEntradas = new ArrayList<Entrada>();
	}

	public ArrayList<Atraccion> getAtracciones() {
		return atracciones;
	}
	
	public void setAtracciones(ArrayList<Atraccion> atracciones) {
		this.atracciones = atracciones;
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
	
	public void altaAtraccion(String nombre, String tipo, int edad, String estado, String fabricante) {
		atracciones.add(new Atraccion(nombre, tipo, edad, estado, fabricante));	
		Collections.sort(atracciones);
	}
	
	public void altaCliente (int codigo, String nombre, String dni, int edad, String email, String telefono) {
		listaClientes.add(new Cliente(codigo, nombre, dni, edad, email, telefono));
	}
	
	public void altaEncargado(String nombre, String dni, int sueldo, int codigo, int anyosEsperiencia) {
		listaPersonal.add(new Encargado(nombre, dni, sueldo, codigo, anyosEsperiencia));
		Collections.sort(listaPersonal);
	}
	
	public void altaEmpleado(String nombre, String dni, int sueldo, int codigo, int anyosEsperiencia) {
		listaPersonal.add(new Empleado(nombre, dni, sueldo, codigo, anyosEsperiencia));
		Collections.sort(listaPersonal);
	}
	
	public void altaEntrada (int codigo, int precio, int codigoCliente) {
		if (comprobarCliente(codigoCliente)) {
			listaEntradas.add(new Entrada(codigo, precio, devolverCliente(codigoCliente)));
		}
	}
	
	public void asigarEmpleadoEncargado(String empleado, String encargado) {
		//
		if (comprobarEmpleado(empleado) && comprobarEncargado(encargado)) {
			devolverEncargado(encargado).getListaEmpleados().add(devolverEmpleado(empleado));
		}
	}
	
	public void asignarAtraccionesEmpleado (String empleado, String nombreAtraccion) {
		if (comprobarEmpleado(empleado) && comprobarAtraccion(nombreAtraccion)) {
			devolverEmpleado(empleado).getListaAtracciones().add(devolverAtraccion(nombreAtraccion));
		}
	}
	
	//eliminar cliente, personal, entrada
	
	public void eliminarCliente (int codigo) {
		Iterator<Cliente> iterador = listaClientes.iterator();
		while (iterador.hasNext()) {
			Cliente cliente = iterador.next();
			if (cliente.getCodigo()==codigo) {
				iterador.remove();
			}
		}
	}
	
	public void eliminarPersonal(String nombre) {
		Iterator<Personal> iterador = listaPersonal.iterator();
		while (iterador.hasNext()) {
			Personal personal = iterador.next();
			if (personal.getNombre().equalsIgnoreCase(nombre)) {
				iterador.remove();
			}
		}
	}
	
	public void eliminarEntrada(int codigo) {
		Iterator<Entrada> iterador = listaEntradas.iterator();
		while (iterador.hasNext()) {
			Entrada entrada = iterador.next();
			if (entrada.getCodigo()==codigo) {
				iterador.remove();
			}
		}
	}
	
	public void guardaDatosFichero () {
		try {
			RandomAccessFile f = new RandomAccessFile("datos.dat", "rw");
			f.seek(f.length());
			
			for (Atraccion atraccion : atracciones) {
				f.writeUTF(atraccion.getNombre());
			}
			
			for (Personal personal : listaPersonal) {
				f.writeInt(personal.getCodigo());
			}
			
			for (Cliente cliente : listaClientes) {
				f.writeUTF(cliente.getNombre());
			}
			
			for (Entrada entrada : listaEntradas) {
				f.writeInt(entrada.getCodigo());
			}
			
			f.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void conectarBBDD () throws SQLException {
		String servidor = "jdbc:mysql://localhost:3306/parque_atracciones";
        conexion = DriverManager.getConnection(servidor, "root", "");
	}
	
	public void guardarClientes() throws SQLException  {
		String query = "INSERT INTO cliente (codCliente, nombre, dni, edad, email, telefono)"
				+ "VALUES (?,?,?,?,?,?)";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Cliente cliente : listaClientes) {
			sentencia.setInt(1, cliente.getCodigo());
			sentencia.setString(2, cliente.getNombre());
			sentencia.setString(3, cliente.getDni());
			sentencia.setInt(4, cliente.getEdad());
			sentencia.setString(5, cliente.getEmail());
			sentencia.setString(6, cliente.getTelefono());
			sentencia.execute();
		}
	}
	
	//nombre, tipo, edadMinima, estado, fabricante
	public void guardarAtraccion() throws SQLException {
		String query = "INSERT INTO atraccion (nombre, tipo, edadMinima, estado, fabricante)"
				+ "VALUES (?,?,?,?,?)";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Atraccion atraccion : atracciones) {
			sentencia.setString(1, atraccion.getNombre());
			sentencia.setString(2, atraccion.getTipo());
			sentencia.setInt(3, atraccion.getEdad());
			sentencia.setString(4, atraccion.getEstado());
			sentencia.setString(5, atraccion.getFabricante());
			sentencia.execute();
		}

	}
	
	public void cargarClientes() throws SQLException {
		String query = "SELECT * FROM cliente";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getInt(1)+", "+
							resultado.getString(2)+", "+
							resultado.getString(3)+", "+
							   resultado.getInt(4)+", "+
							resultado.getString(5)+", "+
							resultado.getString(6));
		}
	}
	
	//nombre, tipo, edadMinima, estado, fabricante

	public void cargarAtraccion() throws SQLException {
		String query = "SELECT * FROM atraccion";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getString(2)+", "+
							resultado.getString(3)+", "+
							   resultado.getInt(4)+", "+
							resultado.getString(5)+", "+
							resultado.getString(6));
		}
	}
	
	
	
	//codCliente, nombre, dni, edad, email, telefono
	public void actualizarClienteBBDD(String nombre, String dni, int edad, String email, String telefono, int codCliente) throws SQLException {
		String query = ("UPDATE cliente "
					+ "SET nombre=?, dni=?, edad=?, email=?, telefono=?"
					+ "WHERE codCliente=?");
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, nombre);
		sentencia.setString(2, dni);
		sentencia.setInt(3, edad);
		sentencia.setString(4, email);
		sentencia.setString(5, telefono);
		sentencia.setInt(6, codCliente);
		sentencia.execute();
	}
	
	//nombre, tipo, edadMinima, estado, fabricante
	public void actualizarAtraccionBDD(String tipo, int edadMinima, String estado, String fabricante, String nombre) throws SQLException {
		String query = "UPDATE atraccion "
					+ "SET tipo=?, edadMinima=?, estado=?, fabricante=?"
					+ "WHERE nombre=?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, tipo);
		sentencia.setInt(2, edadMinima);
		sentencia.setString(3, estado);
		sentencia.setString(4, fabricante);
		sentencia.setString(5, nombre);
		sentencia.execute();
		
	}
	
	public void listarClientes() {
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
	}
	
	public void listarAtracciones() {
		for (Atraccion atraccion : atracciones) {
			System.out.println(atraccion);
		}
	}
	
	public void listarEncargados() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Encargado) {
				System.out.println(personal);
			}
		}
	}
	
	public void listarEmpleados() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Empleado) {
				System.out.println(personal);
			}
		}
	}
	
	public void listarEntradas() {
		for (Entrada entrada : listaEntradas) {
			System.out.println(entrada);
		}
	}
	
	
	public boolean comprobarEntrada (int codigoEntrada) {
		for (Entrada entrada : listaEntradas) {
			if (entrada.getCodigo()==codigoEntrada) {
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarCliente (int codigoCliente) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getCodigo()==codigoCliente) {
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarEncargado (String encargado) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Encargado) {
				if (personal.getNombre().equalsIgnoreCase(encargado)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean comprobarAtraccion (String nombreAtraccion) {
		for (Atraccion atraccion : atracciones) {
			if (atraccion.getNombre().equalsIgnoreCase(nombreAtraccion)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarEmpleado (String empleado) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Empleado) {
				if (personal.getNombre().equalsIgnoreCase(empleado)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Cliente devolverCliente(int codigoCliente) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getCodigo()==codigoCliente) {
				return cliente;
			}
		}
		return null;
	}
	
	public Atraccion devolverAtraccion (String nombreAtraccion) {
		for (Atraccion atraccion : atracciones) {
			if (atraccion.getNombre().equalsIgnoreCase(nombreAtraccion)) {
				return atraccion;
			}
		}
		return null;
	}
	
	public Entrada devolverEntrada(int codigoEntrda) {
		for (Entrada entrada : listaEntradas) {
			if (entrada.getCodigo()==codigoEntrda) {
				return entrada;
			}
		}
		return null;
	}
	
	public Encargado devolverEncargado(String nombreEncargado ) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Encargado) {
				if (personal.getNombre().equalsIgnoreCase(nombreEncargado)) {
					return (Encargado) personal;
				}
			}
		}
		return null;
	}
	
	public Empleado devolverEmpleado(String nombreEmpleado ) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Empleado) {
				if (personal.getNombre().equalsIgnoreCase(nombreEmpleado)) {
					return (Empleado) personal;
				}
			}
		}
		return null;
	}
}
