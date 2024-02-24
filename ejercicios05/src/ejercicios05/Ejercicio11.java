package ejercicios05;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que pide al usuario una contraseña formada por una cadena con cualquier carácter
		// y muestra los caracteres de la cadena de texto separados por un espacio.
		System.out.println("Dime tu contraseña (cadena)");
		String cadena = input.nextLine();

		// cadena.length() > longitud de cadena
		for (int i=0; i<cadena.length(); i++) {
			// muestro cada caracter de la cadena
			// y lo concateno en un espacio
			System.out.print(cadena.charAt(i)+" ");
				
		}
		// cadena.charAt() > en cada vuelta. charAt (), .....
		
		input.close();

	}

}
