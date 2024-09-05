package programa;

import java.sql.SQLException;

import clases.Gestor;

public class Principal {

	public static void main(String[] args) {
		Gestor parque = new Gestor();
		
		System.out.println("Alta Clientes");
		parque.altaCliente(1, "Juan", "111K", 20, "Juan@gmail.com", "27362312");
		parque.altaCliente(2, "Maria", "222A", 15, "Maria@gmail.com", "54626154");
		parque.altaCliente(3, "Lucia", "333M", 30, "Lucia@gmail.com", "275445312");
		parque.altaCliente(4, "Paco", "444L", 25, "Paco@gmail.com", "11122312");
		parque.listarClientes();
		
		System.out.println();
		System.out.println("Alta Atracciones");
		//parque.altaAtraccion(nombre, tipo, edad, estado, fabricante);
		parque.altaAtraccion("Montaña Rusa", "otro", 25, "funcional", "fabriRusas");
		parque.altaAtraccion("Carrusel", "tranqui", 25, "funcional", "fabritodo");
		parque.altaAtraccion("Torre", "normal", 25, "no-funcional", "fabriRusas");
		parque.altaAtraccion("Barco Pirata", "otro", 30, "funcional", "fabriRusas");
		parque.listarAtracciones();
		
		System.out.println();
		System.out.println("Alta Entradas");
		parque.altaEntrada(1, 27, 1);
		parque.altaEntrada(2, 41, 2);
		parque.altaEntrada(3, 21, 3);
		parque.altaEntrada(4, 30, 4);
		parque.listarEntradas();
		
		System.out.println();
		System.out.println("Alta Personal Encargado");
		parque.altaEncargado("Lucio", "111L", 1200, 1, 5);
		parque.altaEncargado("Favio", "333D", 1300, 2, 4);
		parque.altaEncargado("Diana", "222T", 1500, 3, 3);
		parque.listarEncargados();
		
		System.out.println();
		System.out.println("Alta Empleados");
		parque.altaEmpleado("Jose", "1112L", 1000, 1, 10);
		parque.altaEmpleado("Victor", "234C", 1200, 2, 10);
		parque.altaEmpleado("Mario", "1234X", 1000, 3, 10);
		parque.altaEmpleado("Tony", "4455B", 1000, 4, 10);
		parque.altaEmpleado("Lucas", "2123K", 1000, 5, 10);
		parque.listarEmpleados();
		
		System.out.println();
		System.out.println("Asigno empleados a Encargado");
		parque.asigarEmpleadoEncargado("Victor", "Lucio");
		parque.asigarEmpleadoEncargado("Jose", "Favio");
		parque.asigarEmpleadoEncargado("Tony", "Favio");
		parque.asigarEmpleadoEncargado("Mario", "Diana");
		parque.asigarEmpleadoEncargado("Lucas", "Diana");
		parque.listarEncargados();
		
		System.out.println();
		System.out.println("Asigno atraccion a empleado");
		parque.asignarAtraccionesEmpleado("Jose", "Montaña Rusa");
		parque.asignarAtraccionesEmpleado("Mario", "Barco Pirata");
		parque.asignarAtraccionesEmpleado("Tony", "Torre");
		parque.asignarAtraccionesEmpleado("Lucas", "Carrusel");
		parque.listarEmpleados();
		
		System.out.println();
		System.out.println("Elimino entrada (1)");
		parque.eliminarEntrada(1);
		parque.listarEntradas();
		
		System.out.println();
		System.out.println("Guardo en fichero RAC");
		
		try {
			System.out.println("Conecto BBDD");
			parque.conectarBBDD();
			
			System.out.println();
			System.out.println("Guardo clientes");
			parque.guardarClientes();
			parque.cargarClientes();
			
			System.out.println();
			System.out.println("Guardo Atraccion");
			parque.guardarAtraccion();
			parque.cargarAtraccion();
			
			System.out.println();
			System.out.println("Cargo todo");
			parque.cargarClientes();
			parque.cargarAtraccion();
			
			System.out.println();
			System.out.println("Atualizo cliente");
			parque.actualizarClienteBBDD("PacoGento", "11111111A", 14, "No tiene", "695012615", 4);
			
			System.out.println();
			System.out.println("Actualizo Atraccion");
			parque.actualizarAtraccionBDD("Muerte", 99, "funcional", "No tiene", "Carrusel");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
