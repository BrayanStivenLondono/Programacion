package ejercicios02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		System.out.println("Introduce un texto");
		
		// Programa que lee una cadena compuesta de varias palabras 
		// por teclado y la muestra quitándole los espacios.
		
		
		String cadena = input.nextLine(); 
		cadena = cadena.replaceAll(" ", "");
		
		System.out.println(cadena);

			
		input.close();
		
		
	}

}
