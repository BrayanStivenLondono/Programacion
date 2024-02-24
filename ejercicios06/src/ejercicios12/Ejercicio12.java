package ejercicios12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String cadena = leeCaracteres();
		System.out.println(cadena);
		
	}
	private static String leeCaracteres () { //Private; solo funciona en esta clase
		String cadena = "";
		
		char caracter;
		Scanner input = new Scanner (System.in);
		
		do {
			System.out.println("Introduce un caracter");
			caracter = input.nextLine().charAt(0);
			cadena += caracter+" ";
			
		} while (caracter!='0');
		
		input.close();
		return cadena;
	}

}
