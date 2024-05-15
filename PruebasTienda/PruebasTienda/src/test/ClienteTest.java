package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Cliente;
import clases.Tienda;

public class ClienteTest {

	static Tienda unaTienda = new Tienda();
	
	@BeforeAll
	public static void insertarClientes() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos clientes");
		unaTienda.altaCliente("11111", "Maria");
		unaTienda.altaCliente("22222", "Patricia");
		unaTienda.altaCliente("33333", "Jacinto");
		unaTienda.listarClientes();
		System.out.println();
	}

	@Test
	public void existeClienteTest() {
		System.out.println("Test de existencia de clientes ");
		boolean resultado = unaTienda.existeCliente("11111");
		assertTrue(resultado);
		System.out.println("Compruebo assertTrue");
		System.out.println(resultado);
		System.out.println();
	}
	
	@Test
	public void existeClienteTest2() {
		System.out.println("Test de existencia de clientes2 ");
		boolean resultado = unaTienda.existeCliente("44444");
		assertFalse(resultado);
		System.out.println("Compruebo assertFalse");
		System.out.println(resultado);
		System.out.println();
	}

	@Test
	public void buscarClientesTest() {
		System.out.println("Test de busqueda de clientes ");
		Cliente cli = new Cliente("44444", "Andres");
		unaTienda.getListaClientes().add(cli);
		assertEquals(cli, unaTienda.buscarCliente("44444"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 44444");
		System.out.println(cli);
		System.out.println(unaTienda.buscarCliente("44444"));
		System.out.println();
	}

	@Test
	public void buscarClientesTest2() {
		System.out.println("Test de busqueda de clientes2 ");
		Cliente cli = new Cliente("55555", "Olga");
		unaTienda.getListaClientes().add(cli);
		assertNotEquals(cli, unaTienda.buscarCliente("555554"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 555554");
		System.out.println(cli);
		System.out.println(unaTienda.buscarCliente("555554"));
		System.out.println();
	}
	
	@AfterAll
	public static void mostrarClientes() {
		System.out.println("AfterAll");
		unaTienda.listarClientes();
		System.out.println("Mensaje fin");
	}
}