package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Factura;
import clases.Tienda;

public class FacturaTest {

	static Tienda unaTienda = new Tienda();

	@BeforeAll
	public static void insertarFacturas() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos facturas");
		unaTienda.altaFactura("Factura1", 10.1, "2021-04-02");
		unaTienda.altaFactura("Factura2", 20.2, "2021-05-02");
		unaTienda.altaFactura("Factura3", 30.3, "2022-04-02");
		unaTienda.listarFacturas();
		System.out.println();
	}

	@Test
	public void buscarFacturasTest() {
		System.out.println("Test de busqueda de facturas ");
		Factura fact = new Factura("Factura4", 40.4);
		unaTienda.getListaFacturas().add(fact);
		assertEquals(fact, unaTienda.buscarFactura("Factura4"));
		System.out.println("Compruebo, muestro primero objeto fact y luego busco factura Factura4");
		System.out.println(fact);
		System.out.println(unaTienda.buscarFactura("Factura4"));
		System.out.println();
	}
	
	@Test
	public void buscarFacturasTest2() {
		System.out.println("Test de busqueda de facturas ");
		Factura fact = new Factura("Factura5", 50.5);
		unaTienda.getListaFacturas().add(fact);
		assertNotEquals(fact, unaTienda.buscarFactura("Factura55"));
		System.out.println("Compruebo, muestro primero objeto fact y luego busco factura Factura5");
		System.out.println(fact);
		System.out.println(unaTienda.buscarFactura("Factura55"));
		System.out.println();
	}

	@AfterAll
	public static void mostrarFacturas() {
		System.out.println("AfterAll");
		unaTienda.listarFacturas();
		System.out.println("Mensaje fin");
	}
}
