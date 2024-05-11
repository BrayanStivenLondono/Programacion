package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Cliente;
import clases.Tienda;

public class ClienteTest {
	
	static Tienda tienda;
	
	//hago una tienda aqui para no hacerla en cada metodo
	//y de paso un cliente
	//el metodo tiene una funcion de instancia
	
	@BeforeAll //esto se debe colocar
	public static void insertarClientes(){
		tienda = new Tienda();
		tienda.altaCliente("111", "luis");
	}
	
	@Test
	public void existeClienteTest() {//prueba positiva
		assertTrue(tienda.existeCliente("111"));
	}
	
	@Test
	public void existeClienteTest2() {	//prueba negativa
		assertFalse(tienda.existeCliente("1111"));
	}
	
	@Test
	public void buscarClienteTest() {//negativa
		Cliente cliente = new Cliente("222","maria");
		tienda.getListaClientes().add(cliente);
		
		assertEquals(cliente, tienda.buscarCliente("222"));
	}
	
	@Test
	public void buscarClienteTest2() {//positiva
		assertEquals(null, tienda.buscarCliente("3333"));
	}
	
}
