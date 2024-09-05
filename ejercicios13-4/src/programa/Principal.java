package programa;

import java.sql.SQLException;

import clases.Ikea;

public class Principal {

	public static void main(String[] args) {
		
		Ikea ikea = new Ikea();
		
		System.out.println("Creamos trabajadores");
		ikea.altaTrabajador("1111", "Maria", "muebles cocina");
		ikea.altaTrabajador("2222", "Carlos", "muebles cocina");
		ikea.altaTrabajador("3333", "Raquel", "muebles oficina");
		ikea.altaTrabajador("4444", "Felipe", "muebles oficina");
		ikea.altaTrabajador("5555", "Lorena", "menaje cocina");
		ikea.altaTrabajador("6666", "David", "menaje cocina");
		ikea.altaTrabajador("7777", "Andres", "menaje exterior");
		ikea.altaTrabajador("8888", "Ines", "menaje exterior");
		ikea.altaTrabajador("9999", "Andrea", "menaje cocina");
		System.out.println("Mostramos trabajadores");
		ikea.listarTrabajadores();
		System.out.println();

		System.out.println("Creamos jefes seccion");
		ikea.altaJefeSeccion("1111", "Maria", "muebles", 180);
		ikea.altaJefeSeccion("9999", "Andrea", "menaje", 250);
		System.out.println("Mostramos jefes seccion");
		ikea.listarJefesSeccion();
		System.out.println();

		System.out.println("Creamos departamentos");
		ikea.altaDepartamento("Departamento1", "menaje", "1111");
		ikea.altaDepartamento("Departamento2", "muebles", "9999");
		System.out.println("Mostramos departamentos");
		ikea.listarDepartamentos();
		System.out.println();

		System.out.println("Registramos trabajadores en departamento");
		ikea.registrarTrabajadorDepartamento("1111", "Departamento2");
		ikea.registrarTrabajadorDepartamento("2222", "Departamento2");
		ikea.registrarTrabajadorDepartamento("3333", "Departamento2");
		ikea.registrarTrabajadorDepartamento("4444", "Departamento2");
		ikea.registrarTrabajadorDepartamento("5555", "Departamento1");
		ikea.registrarTrabajadorDepartamento("6666", "Departamento1");
		ikea.registrarTrabajadorDepartamento("7777", "Departamento1");
		ikea.registrarTrabajadorDepartamento("8888", "Departamento1");
		ikea.registrarTrabajadorDepartamento("9999", "Departamento1");
		System.out.println("Mostramos departamentos");
		ikea.listarDepartamentos();
		System.out.println();

		System.out.println("Guardamos en fichero datos departamentos");
		ikea.guardarDatosDepartamentos();
		System.out.println("Guardamos en fichero datos personal");
		ikea.guardarDatosPersonal();
		System.out.println();

		try {
			System.out.println("Conectamos BBDD");
			ikea.conectarBBDD();
			System.out.println("Insertamos datos trabajadores en BBDD");
			ikea.insertarTrabajadoresBBDD();
			System.out.println("Mostramos trabajadores de BBDD");
			ikea.mostrarTrabajadoresBBDD();
			System.out.println();
			System.out.println("Insertamos datos jefes seccion en BBDD");
			ikea.insertarJefesSeccionBBDD();
			System.out.println("Mostramos jefes seccion");
			ikea.listarJefesSeccion();
			System.out.println();
			System.out.println("Eliminamos trabajador de BBDD");
			ikea.eliminarTrabajador("5555");
			System.out.println("Mostramos trabajadores de BBDD");
			ikea.mostrarTrabajadoresBBDD();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
