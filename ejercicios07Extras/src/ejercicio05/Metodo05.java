package ejercicio05;

import java.util.Scanner;

public class Metodo05 {
	
	public static void muestraMayusculas () {
		Scanner input = new Scanner (System.in);
		//declaramos vector
		char [] mayusculas = new char [26];
		//declarar letra
		char letra = 'A';
		//construir vector con letars
		for (int i=0; i<mayusculas.length; i++) {
			mayusculas[i] = letra;
			letra++;
		}
		
		int posicion =0;
		String cadena = "";
		do {
			System.out.println("Dame un numero");
			posicion = input.nextInt();
			
			if (posicion>=0 && posicion<=26) {
				cadena += mayusculas[posicion];
			} else {
				System.out.println("Error, introduce otro numero");
			}
			
		} while (posicion!=-1);
		System.out.println(cadena);
		
		input.close();
	}
}
