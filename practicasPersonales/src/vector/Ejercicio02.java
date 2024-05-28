package vector;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] caracteres = new char[5];

		// relleno vector caracteres
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Dame un caracter");
			caracteres[i] = input.nextLine().charAt(0);
		}
		// muestro contenido del array
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i] + " ");
		}
		
		// ordenar
		ordenar(caracteres);
		System.out.println();
		// mostrar ordenado
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i] + " ");
		}
		input.close();
	}

	public static void ordenar(char[] array) {//ordena numeros de menor a mayor
		for (int i=0; i<array.length-1; i++) {
			for (int j = i+1; j<array.length; j++) {
				if (array[j] > array[i]) {//(>) mayor a menor. (<) menor a mayor
					char aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

}
