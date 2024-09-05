package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio21 {

	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// metodo que reciba dos String y devuelva uno concatenado
		
		System.out.println("Metodo concatenar");
		System.out.println("Dame una cadena");
		String cad1 = input.nextLine();
		System.out.println("Dame una cadena");
		String cad2 = input.nextLine();
		
		String cadenaTotal = EjercicioPrevio21.concatenar(cad1, cad2);
		System.out.println("Cadena concatenada "+cadenaTotal);
		// ATAJO.  System.out.println("Cadena concatenada "+EjerciciPrevio21.concatenar(cad1,cad2));
		
		// metodo que reciba un String y devuelva la primera letra
		System.out.println("Dame una cadena");
		String cad3 = input.nextLine();
		char miCadenaCorta = EjercicioPrevio21.primeraLetra(cad3);
		System.out.println("Primera letra "+miCadenaCorta);
		
		// metodo que reciba un String y devuelva su longitud
		System.out.println("Dame una cadena");
		String cad4 = input.nextLine();
		
		int miLongitud = EjercicioPrevio21.longitud(cad4);
		System.out.println("Cadena final "+miLongitud);

		input.close();
	}
	static String concatenar (String cad1, String cad2) {	
		String unida = cad1+" "+cad2;
		return unida;
	}
	static char primeraLetra (String cad1) {
		char cadenaCorta = cad1.charAt(0);
		return cadenaCorta;
		
	}
	static int longitud (String cad1) {
		int longitudCad = cad1.length();
		return longitudCad;
		
	}

}
