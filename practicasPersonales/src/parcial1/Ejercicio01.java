package parcial1;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String[] frases = rellenarVector();
		System.out.println("_______________________");
		System.out.println("Cantidad de palabras");
		cantidadPalabras(frases);
		System.out.println("_______________________");
		System.out.println("Visualizar palabras letras");
		visualizarPalabrasLetras(frases);
		input.close();
	}

	public static String[] rellenarVector() {
		System.out.println("_______________________");
		System.out.println("Rellenar vector");
		String[] frases = new String[3];
		for (int i = 0; i < frases.length; i++) {
			System.out.println("Introduce la frase");
			frases[i] = input.nextLine();
		}
		return frases;
	}

	public static void cantidadPalabras(String[] frases) {
		for (int i = 0; i < frases.length; i++) {
			System.out.println("Frase " + i);
			System.out.println(frases[i]);
			System.out.println("La cantidad de palabras de la frase " + i + " es " + frases[i].split(" ").length);
		}
	}

	public static void visualizarPalabrasLetras(String[] frases) {
		System.out.println("Introduce la componente");
		int componente = input.nextInt();
		System.out.println("La frase de la componente " + componente + " es " + frases[componente]);
		int cantidadDeEspacios = 0;
		for (int i=0; i<frases[componente].length()-1; i++) {
			if (frases[componente].charAt(i)==' ') {
				cantidadDeEspacios++;
			}
		}
		System.out.println("Sus palabras y letras son");
		for (int i=0; i<cantidadDeEspacios+1; i++) {
			String[] partes = frases[componente].split(" ");
			System.out.println(partes[i]+", "+partes[i].length()+ " letras");
		}//syso                   casa            4 letras
	}
}
