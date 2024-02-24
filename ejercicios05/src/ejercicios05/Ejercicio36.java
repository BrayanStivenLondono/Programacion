package ejercicios05;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame un serie de palabras separadas por 1 espacio");
		String cadena=input.nextLine();
		// CONTADOR DE ESPACIOS
		// Programa que me cuenta el número de palabras 
		// que tiene una cadena de texto / cuenta los espacios
		
		int contadorEspacios=0;
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)==' ') { // Cuenta los espacios
				contadorEspacios++;
			}
		}
		
		System.out.println("Hay "+(contadorEspacios+1)+" palabras");

		input.close();
	}

}
