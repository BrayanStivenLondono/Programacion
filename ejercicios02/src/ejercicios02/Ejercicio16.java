package ejercicios02;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cadena de texto");
		String cadena = input.nextLine();

		int longitudCadena = cadena.length();
		// con substring Puedo obtener el trozo de una cadena

		System.out.println(cadena.substring(longitudCadena/2));
		
		
		
		
		input.close();

	}

}
