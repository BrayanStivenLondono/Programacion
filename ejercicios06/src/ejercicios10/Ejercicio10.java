package ejercicios10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		if (esEntero(cadena)) {
			System.out.println("Entero");
		} else {
			System.out.println("No entero");
		}
		
		input.close();
	}       //devuelve          recibe
	public static boolean esEntero (String cadena) {
		
		if (cadena.charAt(0)=='-' && cadena.length()>1 || cadena.charAt(0)>='0' && cadena.charAt(0)<='9') {
			for (int i=1; i<cadena.length(); i++) {
				if (cadena.charAt(0)>'9' && cadena.charAt(0)<'0') {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
