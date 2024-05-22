package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Tienda;

public class TiendaTest {
	
	static Tienda tienda = new Tienda();
	
	@BeforeAll
	public static void insertarClienteFactauras() {
		System.out.println("Alta cliente");
		tienda.altaCliente("cli1", "Juan");
		tienda.altaCliente("cli2", "Maria");
		tienda.altaCliente("cli3", "Pedro");
		System.out.println("Facturas");
		tienda.altaFactura("11", 44, "2000-02-02");
		tienda.altaFactura("22", 93, "2000-02-02");
		tienda.altaFactura("33", 12, "2000-02-02");
		
	}
	
	@Test
	public void asignarClienteFacturaTest() {
		tienda.asignarClienteFactura("cli1", "11");
		
		assertEquals(tienda.buscarCliente("cli1"), tienda.buscarFactura("11").getCliente());
		System.out.println(tienda.buscarCliente("cli1"));
		System.out.println(tienda.buscarFactura("11").getCliente());
		System.out.println();
	}
	
	@Test
	public void asignarClienteFacturaTest2() {
		tienda.asignarClienteFactura("cli2", "33");
		
		assertNotEquals(tienda.buscarCliente("cli1"), tienda.buscarFactura("22").getCliente());
		System.out.println(tienda.buscarCliente("cli1"));
		System.out.println(tienda.buscarFactura("11").getCliente());
		System.out.println();
	}
	
	@AfterAll
	public static void mostrarClienteFacturas() {
		System.out.println("Facturas");
		tienda.listarFacturas();
		System.out.println();
	}
	
}
