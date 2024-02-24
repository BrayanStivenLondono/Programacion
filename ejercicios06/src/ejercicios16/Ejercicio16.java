package ejercicios16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame una cadena");		
		String cadena = input.nextLine();
		
		System.out.println(Ejercicio16.invertirCadena(cadena));

		input.close();
	}
	static String invertirCadena (String cadena) {
		String resultado ="";
		
		for (int i=cadena.length()-1; i>=0; i--) {
			resultado += cadena.charAt(i);
		}
		return resultado;
	}

}
