package programa;

import java.time.LocalDate;
import clases.Discoteca;

public class Programa {
	public static void main(String[] args) {
		Discoteca gestor = new Discoteca();

		System.out.println("Doy de Alta Clientes");
		gestor.altaCliente("Juan", "12345678A", LocalDate.now());
		gestor.altaCliente("Ana", "87654321B", LocalDate.now());
		gestor.altaCliente("Carlos", "23456789C", LocalDate.now());
		gestor.altaCliente("Maria", "34567890D",LocalDate.now());
		gestor.altaCliente("Luis", "45678901E", LocalDate.now());
		gestor.listarClientes();
		
		System.out.println();
		System.out.println("Doy de Alta Djs");
		//gestor.altaDJ(dni, nombre, sueldo, tipoMusica);
		gestor.altaDJ("12345678A","David", 2000, "Electro");
		gestor.altaDJ("87654321B","Laura", 2500, "House");
		gestor.altaDJ("23456789C","Carlos", 1800, "Techno");
		gestor.altaDJ("34567890D","Ana", 2200, "Trance");
		gestor.altaDJ("45678901E","Luisito", 1900, "Dubstep");
		gestor.listarDJs();
		
		System.out.println();
		System.out.println("Doy de alta Camareros");
		gestor.altaCamarero("Miguel", "11223344K", "Masculino");
		gestor.altaCamarero("Elena", "22334455L", "Femenino");
		gestor.altaCamarero("Roberto", "33445566M", "Masculino");
		gestor.altaCamarero("Sofia", "44556677N", "Femenino");
		gestor.altaCamarero("Fernando", "55667788O", "Masculino");
		gestor.listarCamarero();
		
		System.out.println();
		System.out.println("Doy alta entradas");
		//gestor.altaEntrada(codigo, precio, vip);
		gestor.altaEntrada("ENT001", 500, false);
		gestor.altaEntrada("ENT002", 700, true);
		gestor.altaEntrada("ENT003", 600, false);
		gestor.altaEntrada("ENT004", 100, true);
		gestor.altaEntrada("ENT005", 800, false);
		gestor.listarEntradas();
		System.out.println();

		System.out.println();
		System.out.println("Asigno Entrada a cliente");
		
		//gestor.crearEntradaCliente(nombre, codigo);
		gestor.crearEntradaCliente("Juan", "ENT001");
		gestor.crearEntradaCliente("Ana", "ENT002");
		gestor.crearEntradaCliente("Carlos", "ENT003");
		gestor.crearEntradaCliente("Maria", "ENT004");
		gestor.crearEntradaCliente("Luis", "ENT005");
		gestor.listarClientes();
		
		System.out.println();
		System.out.println("Guardo y muestro sueldos en fichero RAF");
		gestor.guardarSueldoFichero();
		
		System.out.println();
		System.out.println("Matriz DJs");
		gestor.matrizDJ();

		try {
			System.out.println("Conecto con BBDD");
			gestor.conectarBBDD();
			System.out.println("Conectada");
			System.out.println();
			
			System.out.println();
			System.out.println("Guardo y Cargo DJ");
			gestor.guardarDjBBDD();
			gestor.cargarDjBBDD();
			
			System.out.println();
			System.out.println("Guardo y muestro Camareros");
			gestor.guardarCamarerosBBDD();
			gestor.cargarCamarerosBBDD();
			
			System.out.println();
			System.out.println("Elimino Camarero (Elena)");
			gestor.eliminarCamareroBBDD("Elena");
			
			System.out.println();
			System.out.println("Cambio sueldo dj (Lusitio a 3000)");
			gestor.actualizarSueldoDjBBDD(3000, "Luisito");
		} catch (Exception e) {
		}
	}
}
