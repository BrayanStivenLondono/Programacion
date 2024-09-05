package programa;

import clases.Colegio;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Creamos colegio");
		Colegio colegio1 = new Colegio();

		System.out.println("Rellenamos");
		colegio1.rellenarColegio();
		System.out.println();
		
		System.out.println("Visualizamos");
		colegio1.visualizar();
		System.out.println();
		
		System.out.println("Modificamos");
		colegio1.modificar();
		System.out.println();
		
		System.out.println("Ordenamos");
		colegio1.ordenar();
		System.out.println();
		
		System.out.println("Visualizamos");
		colegio1.visualizar();
		

	}

}
