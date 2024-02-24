package ejercicio19;

import java.util.Scanner;

public class Metodo19 {
	static Scanner input = new Scanner (System.in);
	
	public static String[] rellenarVector () {
		//relleno vector
		String [] frases = new String[4];
		for (int i=0; i<frases.length; i++) {
			System.out.println("Introduce la frase "+i);
			frases[i] = input.nextLine();
		}
		return frases;
	}
	public static void visualizarPalabras (String [] frases) {
		System.out.println("Dame una componente");
		int componente = input.nextInt();
		System.out.println("\nLa frase es: "+frases[componente]);
		
		//cuento espacios
		int cantidadEspacios =0;
		for (int i=0; i<frases[componente].length(); i++) {
			if (frases[componente].charAt(i)==' ') {
				cantidadEspacios++;
			}
		}
		System.out.println("Espacios: "+cantidadEspacios);
		for (int i=0; i<cantidadEspacios+1; i++) {
			String [] palabras = frases[componente].split(" ");//SPLIT
			System.out.println(palabras[i]+" ");
		}
	}
}
