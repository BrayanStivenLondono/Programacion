package ejercicios05;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		// CONTADOR DE ESPACIOS
		// Programa que me cuenta el n�mero de palabras que tiene una cadena de texto / cuenta los espacios
		Scanner input = new Scanner (System.in);
		System.out.println("Dame un serie de palabras separadas por 1 espacio");
		
		String cadena=input.nextLine();
		int contadorEspacios=0;
		
		//simplemente cuento los espacios que hay en una cadena
		for (int i=0;i<cadena.length();i++) {
			//voy cogiendo caracter a caracter y comparo
			if (cadena.charAt(i)==' ') { // Cuenta los espacios
				contadorEspacios++;
			}
		}
		
		//siempre habr� una palabra mas que espacios
		System.out.println("Hay "+(contadorEspacios+1)+" palabras");
		
		
		
		
		
		input.close();

	}

}
