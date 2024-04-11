package programa;

import clases.Cine;

public class Programa {

	public static void main(String[] args) {
		//creamos cine
		Cine cine1 = new Cine();
		//rellenamos cine
		cine1.generarCine();
		//visualizamos cine
		cine1.visualizarCine();
		//modificar pelicula por titulo
		System.out.println("Modificar pelicula");
		System.out.println();
		cine1.modificarPelicula();
		//ordenamos
		cine1.ordenarDescPeliculas();
		System.out.println();
		//visualizamos despues de ordenar y modificar
		cine1.visualizarCine();
	}
}
