package ejercicio19;

import java.util.Scanner;

public class Metodo19Bis {
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		String[] frases = Metodo19.rellenarVector();//IMP
		Metodo19.visualizarPalabras(frases);
		
		input.close();

	}
	public static String[] rellenarVector () {
		String [] cadenas = new String[3];
		
		for (int i=0; i<cadenas.length; i++) {
			System.out.println("Introduce la frase "+i);
			cadenas[i] = input.nextLine();
		}
		return cadenas;
	}
	public static void visualizarPalabras (String [] frases) {
		System.out.println("Dame una componente");
		int componente = input.nextInt();
		System.out.println("\nLa frase es: "+frases[componente]);//imp
		
		//cuento espacios
		int cantidadEspacios =0;
		for (int i=0; i<frases[componente].length(); i++) {
			if (frases[componente].charAt(i)==' ') {
				cantidadEspacios++;
			}
		}
		System.out.println("Espacios: "+cantidadEspacios);
		for (int i=0; i<cantidadEspacios+1; i++) {//+1
			String [] palabras = frases[componente].split(" ");//SPLIT
			System.out.println(palabras[i]+" ");
		}
	}
}
