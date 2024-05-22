package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Cliente;
import clases.Tienda;

public class ClienteTest {
	
	static Tienda tienda  = new Tienda();
	
	//hago una tienda aqui para no hacerla en cada metodo
	//y de paso un cliente
	//el metodo tiene una funcion de instancia
	
	@BeforeAll //esto se debe colocar
	public static void insertarClientes(){
		tienda.altaCliente("111", "luis");
		
	}
	
	@Test
	public void existeClienteTest() {//prueba positiva
		assertTrue(tienda.existeCliente("111"));
		System.out.println();
	}
	
	@Test
	public void existeClienteTest2() {	//prueba negativa
		assertFalse(tienda.existeCliente("1111"));
		System.out.println();
	}
	
	@Test
	public void buscarClienteTest() {//positiva
		Cliente cliente = new Cliente("222","Maria");
		tienda.getListaClientes().add(cliente);
		
		assertEquals(cliente, tienda.buscarCliente("222"));
		System.out.println();
	}
	
	@Test
	public void buscarClienteTest2() {//negativa
		Cliente cliente = new Cliente("333", "Juan");
		tienda.getListaClientes().add(cliente);
		
		assertNotEquals(cliente, tienda.buscarCliente("3333"));
		System.out.println();
	}

	@AfterAll
	public static void mostrarClientesCreados() {
		System.out.println("Clientes");
		tienda.listarClientes();
		System.out.println();
	}
}
