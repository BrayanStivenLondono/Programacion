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

	static Tienda tienda = new Tienda();
	
	@BeforeAll
	public static void insertarClientes() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos clientes");
		tienda.altaCliente("11111", "Maria");
		tienda.altaCliente("22222", "Patricia");
		tienda.altaCliente("33333", "Jacinto");
		tienda.listarClientes();
		System.out.println();
	}

	@Test
	public void existeClienteTest() {
		System.out.println("Test de existencia de clientes ");
		boolean resultado = tienda.existeCliente("11111");
		assertTrue(resultado);
		System.out.println("Compruebo assertTrue");
		System.out.println(resultado);
		System.out.println();
	}
	
	@Test
	public void existeClienteTest2() {
		System.out.println("Test de existencia de clientes2 ");
		boolean resultado = tienda.existeCliente("44444");
		assertFalse(resultado);
		System.out.println("Compruebo assertFalse");
		System.out.println(resultado);
		System.out.println();
	}

	@Test
	public void buscarClientesTest() {
		System.out.println("Test de busqueda de clientes ");
		Cliente cli = new Cliente("44444", "Andres");
		tienda.getListaClientes().add(cli);
		assertEquals(cli, tienda.buscarCliente("44444"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 44444");
		System.out.println(cli);
		System.out.println(tienda.buscarCliente("44444"));
		System.out.println();
	}

	@Test
	public void buscarClientesTest2() {
		System.out.println("Test de busqueda de clientes2 ");
		Cliente cli = new Cliente("55555", "Olga");
		tienda.getListaClientes().add(cli);
		assertNotEquals(cli, tienda.buscarCliente("555554"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 555554");
		System.out.println(cli);
		System.out.println(tienda.buscarCliente("555554"));
		System.out.println();
	}
	
	@AfterAll
	public static void mostrarClientes() {
		System.out.println("AfterAll");
		tienda.listarClientes();
		System.out.println("Mensaje fin");
	}
}