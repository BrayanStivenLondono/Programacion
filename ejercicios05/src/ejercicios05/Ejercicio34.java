package ejercicios05;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Comprobar si un número introducido por teclado es primo. Un número primo es aquel que solo es divisible entre sí mismo y entre 1.
		System.out.println("Introduce un numero");
		int numero = input.nextInt();
	
		boolean esPrimo = true;
				
		for (int i=2; i<numero; i++) {
			if (numero%i==0) {
				esPrimo = false;
				break; 				
			}
		}
		if (esPrimo) {
			System.out.println("es primo");
		} else { 
			System.out.println("No es primo");
		}

		input.close();

	}

}
