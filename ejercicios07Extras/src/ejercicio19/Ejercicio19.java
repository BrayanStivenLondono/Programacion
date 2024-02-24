package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//vector frases
		String[] frases = Metodo19.rellenarVector();
		//lo llamo
		// recibe el vector y usando split lo divido en palabras
		Metodo19.visualizarPalabras(frases);
		
		input.close();

	}

}
