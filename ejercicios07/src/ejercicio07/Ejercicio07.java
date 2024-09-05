package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el tamaño del array");
		int tamaño = input.nextInt();
		String [] cadena = new String [tamaño];
		
		for (int i=0; i<cadena.length; i++) {
			System.out.println("Introduce una cadena");
			cadena[i] = input.nextLine();
		}
		Ejercicio07.desplazar(cadena, 2);
		System.out.println("Vector remplazado");
		for (int i=0; i<cadena.length; i++) {
			System.out.print(cadena[i]+" ");
		}

		input.close();
	}
	private static void desplazar (String[] cadena, int desplazamiento) {
		desplazamiento = desplazamiento%cadena.length; 
		
		String aux;//guarda el dato perdido
		
		for (int i=0; i<desplazamiento; i++)  {
			aux = cadena[cadena.length-1];
			for (int j=cadena.length-1; j>0; j--) {
				cadena[j] = cadena[j-1];
			}
			cadena[0] = aux;
		}
	}
}
