package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		char [] caracteres = new char [5];
		
		//rellenar vector
		for (int i=0; i<caracteres.length; i++) {
			System.out.println("Dame un caracter");
			caracteres [i] = input.nextLine().charAt(0);
		}
		//mostrar su contenido
		for (int i=0; i<caracteres.length; i++) {
			System.out.print(caracteres[i]+" ");
		}
		System.out.println();
		//los llamo, ya ordenado, y muestro
		Ejercicio10.ordenar(caracteres);
		for (int i=0; i<caracteres.length; i++)  {
			System.out.print(caracteres[i]+" ");
		}
		input.close();
		
	}
	private static void ordenar (char [] array) {
		// cada vez que me situo en una celda
		// recorro con el segundo bucle las celdas siguientes
		// en busca del valor mas pequeño, que ire colocando en la celda actual
		// asi sucesivamente a lo largo de todas las celdas
		for (int i=0; i<array.length-1; i++) {//(-1) para que empieze en 0
			for (int j=i+1; j<array.length; j++) {
				if (array[j] < array[i]);
				char aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
		}
	}
}
