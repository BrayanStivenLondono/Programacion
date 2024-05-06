package programa;

import clases.Biblioteca;

public class Programa {

	public static void main(String[] args) {
		Biblioteca biblio1 = new Biblioteca();

		System.out.println("Alta socios, articulos y creamos prestamos");
		biblio1.altaSocio("Jesus");
		biblio1.altaSocio("Andres");		        
		biblio1.altaArticulo("1111", "Gabriel Garcia Marquez", "Planeta","Cien a�os de Soledad");
		biblio1.altaArticulo("2222", "Gabriel Garcia Marquez", "Planeta","Del amor y otros Demonios");
		biblio1.altaArticulo("3333", "Revista3", "Science", true);
		biblio1.altaArticulo("4444", "Revista4", "Historia", false);
		biblio1.crearPrestamoSocio(1);
		biblio1.crearPrestamoSocio(2);
		biblio1.introducirArticuloPrestamo(1, "1111");
		biblio1.introducirArticuloPrestamo(2, "3333");

		System.out.println();
		System.out.println("Listamos articulos");
		biblio1.listarArticulos();
		
		System.out.println();
		System.out.println("Mostramos prestamos socios");
		biblio1.mostrarPrestamosSocio(1);
		System.out.println("Listamos prestamos");
		biblio1.listarPrestamos();
		
		System.out.println("Guardando datos....");
		biblio1.guardarDatos();
		
		System.out.println("Cargando datos....");
		biblio1.cargarDatos();

	}

}