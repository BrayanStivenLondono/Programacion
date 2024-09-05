package programa;

import java.time.LocalDate;

import clases.Discoteca;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Doy de Alta Clientes");
		
		Discoteca gestor = new Discoteca();
		gestor.altaCliente("Juan", "12345678A", LocalDate.now());
		gestor.altaCliente("Ana", "87654321B", LocalDate.now());
		gestor.altaCliente("Carlos", "23456789C", LocalDate.now());
		gestor.altaCliente("Maria", "34567890D",LocalDate.now());
		gestor.altaCliente("Luis ", "45678901E", LocalDate.now());
		gestor.listarCliente();

		System.out.println("Doy de Alta Djs");
		//gestor.altaDj(nombre, dni, sueldo, tipoMusica);
		gestor.altaDj("David", "12345678A", 2000, "Electro");
		gestor.altaDj("Laura", "87654321B", 2500, "House");
		gestor.altaDj("Carlos", "23456789C", 1800, "Techno");
		gestor.altaDj("Ana", "34567890D", 2200, "Trance");
		gestor.altaDj("Luis", "45678901E", 1900, "Dubstep");
		gestor.listarPersonal();
		
		System.out.println("Doy de alta Camareros");
		//gestor.altaCamarero(nombre, dni, genero, antiguedad);
		gestor.altaCamarero("Miguel", "11223344K", "Masculino", 2);
		gestor.altaCamarero("Elena", "22334455L", "Femenino", 4);
		gestor.altaCamarero("Roberto", "33445566M", "Masculino", 1);
		gestor.altaCamarero("Sofia", "44556677N", "Femenino", 3);
		gestor.altaCamarero("Fernando", "55667788O", "Masculino", 5);

		System.out.println("Listor personal");
		gestor.listarPersonal();
		
		System.out.println("Doy alta entradas");
		//gestor.altaEntrada(codigo, precio, vip);
		gestor.altaEntrada("ENT001", 50, false);
		gestor.altaEntrada("ENT002", 70, true);
		gestor.altaEntrada("ENT003", 60, false);
		gestor.altaEntrada("ENT004", 10, true);
		gestor.altaEntrada("ENT005", 80, false);
		gestor.listarEntrada();

		System.out.println("Asigno entrada clientes");
		gestor.crearEntradaCliente("12345678A", "ENT001");
		gestor.crearEntradaCliente("87654321B", "ENT002");
		gestor.crearEntradaCliente("23456789C", "ENT003");
		gestor.crearEntradaCliente("34567890D", "ENT004");
		gestor.crearEntradaCliente("45678901E", "ENT005");
		
	}

}
