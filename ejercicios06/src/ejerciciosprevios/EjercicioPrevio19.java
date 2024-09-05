package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio19 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// llamar metodos
		
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		System.out.println("Introduce un numero");
		int numero1 = input.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = input.nextInt();
		
		System.out.println("Metodo 2");
		System.out.println("Introduce otro numero");
		int numero3 = input.nextInt();
		
		EjercicioPrevio19.subCadena(cadena, numero1, numero2);
		EjercicioPrevio19.letrasNumero(cadena, numero3);
		
		input.close();
	
	}
	static void subCadena (String cadena, int numero1, int numero2) {
		System.out.println(cadena.substring(numero1,numero2));

	}
	static void letrasNumero (String cadena, int numero1) {
		System.out.println(cadena.substring(0,numero1));
	}

}
