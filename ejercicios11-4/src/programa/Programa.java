package programa;

import clases.Inversion;

public class Programa {
	public static void main(String[] args) {
		Inversion misMonedas = new Inversion();

		System.out.println("---Alta clientes y listamos---");
		misMonedas.altaCliente("Jesus");
		misMonedas.altaCliente("Andres");
		misMonedas.listarCliente();
		System.out.println();
		
		System.out.println("---Alta monedas y listamos---");
		misMonedas.altaMoneda("BitCoin", 2.2,"BBVA");
		misMonedas.altaMoneda("Dolar", 3.3, true);
		misMonedas.listarMonedas();
		System.out.println();
		
		System.out.println("---Creamos compras de moneda y listamos---");
		misMonedas.crearCompraCliente(1);
		misMonedas.crearCompraCliente(2);
		misMonedas.introducirMonedasCompra(1, "BitCoin");
		misMonedas.introducirMonedasCompra(2, "Dolar");
		misMonedas.listarCompras();
		
		System.out.println();
		System.out.println("---Mostramos compras cliente 1---");
		misMonedas.mostrarComprasCliente(1);

		System.out.println();
		System.out.println("Guardando datos en fichero....");
		System.out.println("Creado fichero inversion.dat");
		System.out.println();
		misMonedas.guardarDatos();
		System.out.println("Cargando datos....");
		misMonedas.cargarDatos();

	}

}
