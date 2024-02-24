package ejercicios02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		System.out.println("Introduce un texto");
		String cadena = input.nextLine();
		 
		cadena = cadena.replaceAll(" ", "");
		
		System.out.println(cadena);

		input.close();
		
		
	}

}
