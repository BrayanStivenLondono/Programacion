package parcial1;

import java.util.Scanner;

public class Ejercicio03 {

	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		String[] frases = Ejercicio03.rellenarVector();//IMP
		Ejercicio03.visualizarPalabras(frases);
		
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
		System.out.println("Elige una cadena");
		int elegida = input.nextInt();
		System.out.println("\nLa frase es: "+frases[elegida]);//imp
		
		//cuento espacios o vocales/conso/mayus/minus
		int cantidadEspacios =0;
		for (int i=0; i<frases[elegida].length(); i++) {
			if (frases[elegida].charAt(i)==' ') {
				cantidadEspacios++;
			}
		}
		System.out.println("Espacios: "+cantidadEspacios);
		for (int i=0; i<cantidadEspacios+1; i++) {//+1
			String [] palabras = frases[elegida].split(" ");//SPLIT
			System.out.println(palabras[i]+" ");

		}
	}
}
