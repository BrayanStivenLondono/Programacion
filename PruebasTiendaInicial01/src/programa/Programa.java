
package programa;

import clases.Tienda;

public class Programa {

	public static void main(String[] args) {
		Tienda tienda = new Tienda();

		System.out.println("Alta cliente1");
		tienda.altaCliente("11111", "Andres");
		System.out.println("Alta cliente2");
		tienda.altaCliente("22222", "Carlota");
		System.out.println("Alta cliente ya existente");
		tienda.altaCliente("11111", "Maria");
		System.out.println();
		
		System.out.println("Listar clientes");
		tienda.listarClientes();
		System.out.println();

		System.out.println("Buscar cliente 11111");
		System.out.println(tienda.buscarCliente("11111"));
		System.out.println("Buscar cliente 111112");
		System.out.println(tienda.buscarCliente("111112"));
		System.out.println();

		System.out.println("Alta factura1");
		tienda.altaFactura("Factura1", 10.1, "2021-04-02");
		System.out.println("Alta factura2");
		tienda.altaFactura("Factura2", 20.2, "2021-05-02");
		System.out.println("Alta factura3");
		tienda.altaFactura("Factura3", 30.3, "2022-04-02");
		System.out.println();
		
		System.out.println("Listar facturas");
		tienda.listarFacturas();		
		System.out.println();
		
		System.out.println("Asignar cliente 11111 a Factura1");
		tienda.asignarClienteFactura("11111", "Factura1");
		System.out.println("Asignar cliente 22222 a Factura2");
		tienda.asignarClienteFactura("22222", "Factura2");
		System.out.println();
	
		System.out.println("Listar facturas");
		tienda.listarFacturas();		
		System.out.println();
		
		System.out.println("Listar facturas año 2021");
		tienda.listarFacturasAnno(2021);
		System.out.println();	
	}
}

