package ejercicios02;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		System.out.println("introduce un numero entero");
		
		// Programa Java que lee un número entero por teclado y obtiene 
		// y muestra por pantalla el doble y el triple de ese número.
				
		
		//  leo datos con clases scanner
		int numero = input.nextInt();
	
		System.out.println("El doble es " + numero*2);
		System.out.println("El triple es " + numero*3);

		
		
		input.close();

	}

}
