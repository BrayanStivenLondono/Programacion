package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Tienda;

public class TiendaTest {
	static Tienda unaTienda = new Tienda();

	@BeforeAll
	public static void insertarClientesFacturas() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos clientes");
		unaTienda.altaCliente("11111", "Maria");
		unaTienda.altaCliente("22222", "Patricia");
		unaTienda.altaCliente("33333", "Jacinto");
		unaTienda.listarClientes();
		System.out.println("Insertaremos facturas");
		unaTienda.altaFactura("Factura1", 10.1, "2021-04-02");
		unaTienda.altaFactura("Factura2", 20.2, "2021-05-02");
		unaTienda.altaFactura("Factura3", 30.3, "2022-04-02");
		unaTienda.listarFacturas();
		System.out.println();
	}

	@Test
	public void asignarClienteFacturaTest() {
		System.out.println("Asignar Cliente Factura ");
		unaTienda.asignarClienteFactura("11111", "Factura1");
		assertEquals(unaTienda.buscarCliente("11111"), unaTienda.buscarFactura("Factura1").getCliente());
		System.out.println("Compruebo, muestro primero objeto con idCliente y luego busco factura con idCLiente");
		System.out.println(unaTienda.buscarCliente("11111"));
		System.out.println(unaTienda.buscarFactura("Factura1").getCliente());
		System.out.println();
	}
	
	@Test
	public void asignarClienteFacturaTest2() {
		System.out.println("Asignar Cliente Factura2 ");
		unaTienda.asignarClienteFactura("22222", "Factura2");
		assertNotEquals(unaTienda.buscarCliente("22222"), unaTienda.buscarFactura("Factura1").getCliente());
		System.out.println("Compruebo, muestro primero objeto con idCliente y luego busco factura con idCLiente");
		System.out.println(unaTienda.buscarCliente("22222"));
		System.out.println(unaTienda.buscarFactura("Factura1").getCliente());
		System.out.println();
	}
	
	@AfterAll
	public static void mostrarClientesFacturas() {
		System.out.println("AfterAll");
		unaTienda.listarClientes();
		unaTienda.listarFacturas();
		System.out.println("Mensaje fin");
	}
}
