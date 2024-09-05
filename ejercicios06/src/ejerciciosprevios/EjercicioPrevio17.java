package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio17 {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// llamar metodos
		
		EjercicioPrevio17.subCadena();
		EjercicioPrevio17.letrasNumero();
		
		input.close();
	}
	static void subCadena () {
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		System.out.println("Introduce un numero");
		int numero1 = input.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = input.nextInt();

		System.out.println(cadena.substring(numero1,numero2));
		
	}
	static void letrasNumero () {
		System.out.println("Introduce otro numero");
		int numero1 = input.nextInt();
		input.nextLine();
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		System.out.println(cadena.substring(0,numero1));
	}

}
