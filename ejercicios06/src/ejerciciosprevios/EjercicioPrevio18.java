package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio18 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// llamar metodos
		
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		EjercicioPrevio18.subCadena(cadena);
		EjercicioPrevio18.letrasNumero(cadena);
		
		input.close();
	
	}
	static void subCadena (String cadena) {

		System.out.println("Introduce un numero");
		int numero1 = input.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = input.nextInt();

		System.out.println(cadena.substring(numero1,numero2));

	}
	static void letrasNumero (String cadena) {
		System.out.println("Introduce otro numero");
		int numero1 = input.nextInt();
		
		System.out.println(cadena.substring(0,numero1));
	}

}
