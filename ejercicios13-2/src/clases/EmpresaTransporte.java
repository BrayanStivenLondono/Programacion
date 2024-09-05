package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class EmpresaTransporte implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	
	private Connection conexion;
	private ArrayList<Personal> personal;
	private ArrayList<Transporte> transportes;
	
	public EmpresaTransporte() {
		personal = new ArrayList<Personal>();
		transportes = new ArrayList<Transporte>();
	}

	public ArrayList<Personal> getListaPersonal() {
		return personal;
	}

	public void setListaPersonal(ArrayList<Personal> listaPersonal) {
		this.personal = listaPersonal;
	}

	public ArrayList<Transporte> getListaTransportes() {
		return transportes;
	}

	public void setListaTransportes(ArrayList<Transporte> listaTransportes) {
		this.transportes = listaTransportes;
	}
	
	public void altaConductor(String dni, String nombre, String carnet) {
		personal.add(new Conductor(
				dni, 
				nombre, 
				carnet));
		Collections.sort(personal);
	}
	
	public void altaCarretellero(String dni, String nombre, String costeHora) {
		personal.add(new Carretillero(
				dni, 
				nombre, 
				costeHora));
		Collections.sort(personal);
	}
	
	public void altaTransporte(String codigo, String empresa, String fechaTransporte, String nombreConductor)  {
		if (compruebaTransporte(codigo) == false && compruebaConductor(nombreConductor)) {
			transportes.add(new Transporte(
					codigo, 
					empresa, 
					fechaTransporte, 
					devulveConductor(nombreConductor)));
			Collections.sort(transportes);
		}
	}
	
	public void registrarCarretilleroTransporte(String codigo, String nombre) {
		if (compruebaTransporte(codigo) && (comprobarCarretillero(nombre))) {
			devuelveTransporte(codigo).getListaCarretilleros().add(devuelveCarretillero(codigo));
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}
	
	public void guardarDatos() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(new File("src/datos.dat")));
			escritor.writeObject(personal);
			escritor.writeObject(transportes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//PARTE DE BASES DE DATOS.....
	
	public void conexion () throws SQLException {
		String servidor = "jdbc:mysql://localhost:3306/transporte3ev";
		Connection conexion = DriverManager.getConnection(servidor, "root", "" );
	}
	
	public void guardarConductor(String dni, String nombre, String carnet) throws SQLException {
		String query = "insert into conductores (dni, nombre, carnet) values (?,?,?);";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		for (Personal personal : personal) {
			if (personal instanceof Conductor) {
				sentencia.setString(1, personal.getDni());
				sentencia.setString(2, personal.getNombre());
				sentencia.setString(3, ((Conductor) personal).getCarnet());
				sentencia.execute();
			}
		}
	}
	
	public void cargarConductores() throws SQLException {
		String query = "select * from conductores";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet res = sentencia.executeQuery();
		
		while (res.next()) {
			System.out.println(res.getString(1)+", "+res.getString(2)+", "+res.getString(3)+", ");
		}
	}
	
	public void guardarDatosRAF() {//nombres de carretillero
		try (RandomAccessFile f = new RandomAccessFile("datos.txt", "rw")) {
			for (Personal personal : personal) {
				if (personal instanceof Carretillero) {
					f.writeUTF(personal.getNombre());
				}
			}
		} catch (IOException e) {
		}
	}
	
	
	public void listarCarretilleros() {
		for (Personal personal : personal) {
			if (personal instanceof Carretillero) {
				System.out.println(personal);
			}
		}
	}
	
	public void listarConductores() {
		for (Transporte tras : transportes) {
			System.out.println(tras);
		}
	}
	
	public boolean compruebaTransporte(String codigo) {
		for (Transporte tras : transportes) {
			if (tras.getCodigo().equalsIgnoreCase(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean compruebaConductor(String nombre) {
		for (Personal personal : personal) {
			if (personal instanceof Conductor) {
				if (personal.getNombre().equalsIgnoreCase(nombre)) {
					 return true;
				}
			}
		}
		return false;
	}
	
	public boolean comprobarCarretillero(String nombre) {
		for (Personal personal : personal) {
			if (personal instanceof Carretillero) {
				if (personal.getNombre().equalsIgnoreCase(nombre)) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	public Carretillero devuelveCarretillero(String nombre) {
		for (Personal personal : personal) {
			if (personal instanceof Carretillero) {
				if (personal.getDni().equalsIgnoreCase(nombre)) {
					return (Carretillero) personal;
				}
			}
		}
		return null;
	}
	
	public Conductor devulveConductor(String nombre) {
		for (Personal personal : personal) {
			if (personal instanceof Conductor) {
				if (personal.getNombre().equalsIgnoreCase(nombre)) {
					return (Conductor) personal;
				}
			}
		}
		return null;
	}
	
	public Transporte devuelveTransporte(String codigo) {
		for (Transporte tras : transportes) {
			if (tras.getCodigo().equalsIgnoreCase(codigo)) {
				return tras;
			}
		}
		return null;
	}
}




