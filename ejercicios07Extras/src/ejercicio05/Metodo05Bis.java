package ejercicio05;

import java.util.Scanner;

public class Metodo05Bis {

	public static void main(String[] args) {
		Metodo05.muestraMayusculas();

	}
	public static void muestraMayusculas () {
		Scanner input = new Scanner (System.in);

		char [] mayusculas = new char [26];
		char letra = 'A';

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
		System.out.println(cadena+" ");
		
		input.close();
	}

}
