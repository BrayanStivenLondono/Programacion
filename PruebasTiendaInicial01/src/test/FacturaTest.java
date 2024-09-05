package test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Factura;
import clases.Tienda;

public class FacturaTest {
	
	static Tienda tienda = new Tienda();
	
	 @BeforeAll
	 public static void insertarFacturas() {
		tienda.altaFactura("11", 32,"2000-05-05");
		
	 }
	 
	 @Test
	 public void buscarFacturaTest() {
		 Factura factura = new Factura("22", 14);
		 tienda.getListaFacturas().add(factura);
		 
		 assertEquals(factura, tienda.buscarFactura("22"));
		 System.out.println();
	 }
	 
	 @Test
	 public void buscarFacturaTest2() {
		 Factura factura = new Factura("33", 58);
		 tienda.getListaFacturas().add(factura);
		 
		 assertNotEquals(factura, tienda.buscarFactura("333"));
		 System.out.println();
	 }
	 
	 @AfterAll
	 public void mostrarFacturas() {
		 System.out.println("Facturas");
		 tienda.listarFacturas();
		 System.out.println();
	 }
	 
}
