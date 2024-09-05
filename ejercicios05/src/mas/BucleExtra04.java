package mas;

import java.util.Scanner;

public class BucleExtra04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la
		// aparición del primer carácter en la cadena por el segundo carácter.

		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		System.out.println("Introduce un caracter");
		char caracter1 = input.nextLine().charAt(0);//DEBO PONER EL .charAt(0) SIEMPRE (ERROR SI NO ESTA)
		System.out.println("Introduce otro caracter");
		char caracter2 = input.nextLine().charAt(0);
		
		for (int i=0; i<cadena.length(); i++) {
			
		}
		System.out.println("La cadena incial "+cadena);
		System.out.println("La cadena final "+cadena.replace(caracter1, caracter2));

		input.close();
	}

}
