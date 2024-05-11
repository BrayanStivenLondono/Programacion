package programa;

import clases.Supermercado;

public class Programa {
	public static void main(String[] args) {
		Supermercado gestor = new Supermercado();
		
		System.out.println("Alta Cliente y productos");
		gestor.altaCliente("Juan");
		gestor.altaCliente("Maria");
		gestor.listarClientes();
		
		System.out.println();
		gestor.altaProducto("Galletas", 2.20, "Semanal");
		gestor.altaProducto("Huevos", 5.50, true);
		gestor.listarProductos();
		
		System.out.println("\nVenta Para Cliente");
		gestor.crearVentaCliente(1);
		gestor.crearVentaCliente(2);
		
		System.out.println("\nProductos a ventas");
		gestor.introducirProductosVenta("Galletas", 1);
		gestor.introducirProductosVenta("Huevos", 2);
		
		System.out.println("\nMostrar cliente 2");
		gestor.mostrarVentasCliente(2);
		
		System.out.println("Lista Ventas");
		gestor.listarVentas();
		
		System.out.println();
		System.out.println("Guardo datos");
		gestor.guardarDatos();
		
		System.out.println();
		System.out.println("Cargo datos");
		gestor.cargarDatos();
	}
}
