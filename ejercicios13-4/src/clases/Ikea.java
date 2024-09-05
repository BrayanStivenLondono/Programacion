package clases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class Ikea {

	private ArrayList<Departamento> listaDepartamentos;
	private ArrayList<Personal> listaPersonal;
	private Connection conexion;

	public Ikea() {
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.listaPersonal = new ArrayList<Personal>();
	}

	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

	public ArrayList<Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(ArrayList<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	// ALTA TRABAJADOR
	public void altaTrabajador(String dni, String nombre, String departamento) {
		listaPersonal.add(new Trabajador(dni, nombre, departamento));
		Collections.sort(listaPersonal);
	}

	// ALTA JEFE SECCION
	public void altaJefeSeccion(String dni, String nombre, String seccion, int incentivo) {
		listaPersonal.add(new JefeSeccion(dni, nombre, seccion, incentivo));
		Collections.sort(listaPersonal);
	}

	// ALTA DEPARTAMENTO
	public void altaDepartamento(String codigo, String nombre, String dni) {
		if (compruebaDepartamento(codigo) == false && compruebaJefeSeccion(dni)) {
			listaDepartamentos.add(new Departamento(codigo, nombre, devuelveJefeSeccion(dni)));
			Collections.sort(listaDepartamentos);
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}

	// REGISTAR TRABAJADORES EN DEPARTAMENTO
	public void registrarTrabajadorDepartamento(String dni, String codigo) {
		if (compruebaDepartamento(codigo) && compruebaTrabajador(dni)) {
			devuelveDepartamento(codigo).getListaTrabajadores().add(devuelveTrabajador(dni));
		} else {
			System.out.println("Ha ocurrido un error");
		}
	}

	// LISTAR TRABAJADORES
	public void listarTrabajadores() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Trabajador) {
				System.out.println(personal);
			}
		}
	}

	// LISTAR JEFES SECCION
	public void listarJefesSeccion() {
		for (Personal personal : listaPersonal) {
			if (personal instanceof JefeSeccion) {
				System.out.println(personal);
			}
		}
	}

	// LISTAR DEPARTAMENTOS
	public void listarDepartamentos() {
		for (Departamento dep : listaDepartamentos) {
			System.out.println(dep);
		}
	}

	// GUARDAR DATOS DEPARTAMENTOS EN FICHERO
	public void guardarDatosDepartamentos() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("departamentos.dat"));
			escritor.writeObject(listaDepartamentos);
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// GUARDAR DATOS PERSONAL EN FICHERO
	public void guardarDatosPersonal() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("personal.dat"));
			escritor.writeObject(listaPersonal);
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// CONECTAR BASE DE DATOS
	public void conectarBBDD() {
		String servidor = "jdbc:mysql://localhost:3306/ikea";
		try {
			conexion = DriverManager.getConnection(servidor, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// INSERTAR TRABAJADORES EN BASE DE DATOS
	public void insertarTrabajadoresBBDD() {
		String query = "INSERT INTO trabajadores(dni, nombre, categoria) VALUES(?, ?, ?)";
		try {
			PreparedStatement sentencia = conexion.prepareStatement(query);

			for (Personal personal : listaPersonal) {
				if (personal instanceof Trabajador) {
					sentencia.setString(1, personal.getDni());
					sentencia.setString(2, personal.getNombre());
					sentencia.setString(3, ((Trabajador) personal).getCategoria());
					sentencia.execute();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// MOSTRAR TODOS LOS TRABAJADORES DE LA BASE DE DATOS
	public void mostrarTrabajadoresBBDD() throws SQLException {
		String query = "SELECT * FROM trabajadores";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		ResultSet resultado = sentencia.executeQuery();

		while (resultado.next()) {
			System.out.println(resultado.getString(2) + ", " + resultado.getString(3) + ", " + resultado.getString(4));
		}
	}

	// INSERTAR JEFES DE SECCION EN BASE DE DATOS
	public void insertarJefesSeccionBBDD() {
		String query = "INSERT INTO jefeSeccion(dni, nombre ,seccion, suplemento) VALUES(?,?,?,?)";
		try {
			PreparedStatement sentencia = conexion.prepareStatement(query);

			for (Personal personal : listaPersonal) {
				if (personal instanceof JefeSeccion) {
					sentencia.setString(1, personal.getDni());
					sentencia.setString(2, personal.getNombre());
					sentencia.setString(3, ((JefeSeccion) personal).getSeccion());
					sentencia.setInt(4, ((JefeSeccion) personal).getSuplemento());
					sentencia.execute();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ELIMINAR TRABAJADOR POR DNI DE BASE DE DATOS
	public void eliminarTrabajador(String dni) throws SQLException {
		String query = "DELETE FROM trabajadores WHERE dni=?";
		PreparedStatement sentencia = conexion.prepareStatement(query);
		sentencia.setString(1, dni);
		sentencia.executeUpdate();
	}

	// comprobaciones

	// COMPROBAR DEPARTAMENTO
	public boolean compruebaDepartamento(String codigo) {
		boolean existe = false;
		for (Departamento dep : listaDepartamentos) {
			if (dep.getCodigo().equals(codigo)) {
				existe = true;
			}
		}
		return existe;
	}

	// COMPROBAR JEFE SECCION
	public boolean compruebaJefeSeccion(String dni) {
		boolean existe = false;
		for (Personal personal : listaPersonal) {
			if (personal instanceof JefeSeccion) {
				if (personal.getDni().equals(dni)) {
					existe = true;
				}
			}
		}
		return existe;
	}

	// COMPROBAR TRABAJADOR
	public boolean compruebaTrabajador(String dni) {
		boolean existe = false;
		for (Personal personal : listaPersonal) {
			if (personal instanceof Trabajador) {
				if (personal.getDni().equals(dni)) {
					existe = true;
				}
			}
		}
		return existe;
	}

	// DEVUELVE JEFE SECCION
	public JefeSeccion devuelveJefeSeccion(String dni) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof JefeSeccion) {
				if (personal.getDni().equals(dni)) {
					return (JefeSeccion) personal;
				}
			}
		}
		return null;
	}

	// DEVUELVE TRABAJADOR
	public Trabajador devuelveTrabajador(String dni) {
		for (Personal personal : listaPersonal) {
			if (personal instanceof Trabajador) {
				if (personal.getDni().equals(dni)) {
					return (Trabajador) personal;
				}
			}
		}
		return null;
	}

	// DEVUELVE DEPARTAMENTO
	public Departamento devuelveDepartamento(String codigo) {
		for (Departamento dep : listaDepartamentos) {
			if (dep.getCodigo().equals(codigo)) {
				return dep;
			}
		}
		return null;
	}
}
