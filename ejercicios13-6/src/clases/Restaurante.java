package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Restaurante implements Serializable {
	private static final long serialVersionUID = 1L;
	
	Connection conexion;
	private ArrayList<Persona> personas;
	private ArrayList<Mesa> mesas;
	private ArrayList<Comida> comidas;
	
	public Restaurante() {
		personas = new ArrayList<Persona>();
		mesas = new ArrayList<Mesa>();
		comidas = new ArrayList<Comida>();
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
	public ArrayList<Mesa> getMesas() {
		return mesas;
	}
	public void setMesas(ArrayList<Mesa> mesas) {
		this.mesas = mesas;
	}
	public ArrayList<Comida> getComidas() {
		return comidas;
	}
	public void setComidas(ArrayList<Comida> comidas) {
		this.comidas = comidas;
	}
	
	public void altaCliente(int id, String nombre) {
		if (!comprobarCliente(nombre)) {
			personas.add(new Cliente(id, nombre));
			Collections.sort(personas);
		}
	}
	
	public void altaEmpleado(int id, String nombre, String cargo, double sueldo) {
		personas.add(new Empleados(id, nombre, cargo, sueldo));
		Collections.sort(personas);
	}
	
	public void altaMesa(double cuenta, int numero) {
		mesas.add(new Mesa(cuenta, numero));
	}
	
	public void asignarMesaPersona() {
		
	}
	
	public void conectarBBDD() throws SQLException {
		 String servidor = "jdbc:mysql://localhost:3306/baseFranquicia";
	        conexion = DriverManager.getConnection(servidor, "root", "");
	}
	
	public void guardarClientesBBDD() throws SQLException {
		String query = "INSERT INTO cliente (nombre, id_cliente, sueldo) VALUES (?,?,?) ";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Persona persona : personas) {
			if (persona instanceof Cliente) {
				sentencia.setString(1, persona.getNombre());
				sentencia.setInt(2, persona.getId());
				sentencia.execute();
			}
		}
	}
	
	public void guardarEmpleadosBBDD() throws SQLException {
		String query = "INSERT INTO empleado (nombre, id_empleado, cargo, sueldo) VALUES (?,?,?,?)";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Persona persona : personas) {
			if (persona instanceof Empleados) {
				sentencia.setString(1, persona.getNombre());
				sentencia.setInt(2, persona.getId());
				sentencia.setString(3, ((Empleados) persona).getCargo());
				sentencia.setDouble(4, ((Empleados) persona).getSueldo());
				sentencia.execute();
			}
		}
	}
	
	public void cargarClientesBBDD() throws SQLException {
		String query = "SELECT * FROM cliente";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getString(1)+", "+resultado.getInt(2)+", "+resultado.getDouble(3));
		}
	}
	
	public void cargarEmpleadosBBDD(String nombre) throws SQLException {
		String query = "SELECT * FROM empleado WHERE nombre=?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, nombre);
		ResultSet resultado = sentencia.executeQuery();
		
		while (resultado.next()) {
			System.out.println(resultado.getString(1)+", "+
								  resultado.getInt(2)+", "+
								resultado.getString(3)+", "+
								resultado.getDouble(4));
		}
	}
	
	public void eliminarClienteBBDD(int id_cliente) throws SQLException {
		String query = "DELETE * FROM cliente WHERE id_cliente=?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setInt(1, id_cliente);
		sentencia.execute();
	
	}
	
	public void guardarDatosFichero() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(new File("src/datos.dat")));
			escritor.writeObject(comidas);
			escritor.writeObject(mesas);
			escritor.writeObject(personas);
			escritor.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void cargarDatosFichero() {
		try {
			ObjectInputStream lector = new ObjectInputStream(new FileInputStream("src/datos.dat"));
			mesas = (ArrayList<Mesa>) lector.readObject();
			personas = (ArrayList<Persona>) lector.readObject();
			comidas = (ArrayList<Comida>) lector.readObject();
			
			lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Cliente devolverCliente(String nombreCliente) {
		for (Persona persona : personas) {
			if (persona instanceof Cliente) {
				if (persona.getNombre().equalsIgnoreCase(nombreCliente)) {
					return (Cliente) persona;
				}
			}
		}
		return null;
	}
	
	public void eliminarEntrada(String nombrePersona) {
		Iterator<Persona> iterador = personas.iterator();
		while (iterador.hasNext()) {
			Persona persona = iterador.next();
			if (persona.getNombre().equalsIgnoreCase(nombrePersona)) {
				iterador.remove();
			}
		}
	}
		
	public boolean comprobarMesa(int numeroMesa) {
		for (Mesa mesa : mesas) {
			if (mesa.getNumero()==numeroMesa) {
				return true;
			}
		}
		return false;
	}
	
	public boolean comprobarEmpleado(String nombre) {
		for (Persona persona : personas) {
			if (persona instanceof Empleados) {
				if (persona.getNombre().equalsIgnoreCase(nombre)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean comprobarCliente(String nombre) {
		for (Persona persona : personas) {
			if (persona instanceof Cliente) {
				if (persona.getNombre().equalsIgnoreCase(nombre)) {
					return true;
				}
			}
		}
		return false;
	}
}
