package ejercicios05;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Realizar un programa que nos pida un número, y nos diga cuantos números hay entre 1 y n que son primos.
		System.out.println("Introduce un numero entero");
		int limit = input.nextInt();
		
		int contadorPrimos=0; 	
		for (int i=1; i<limit; i++) {
						
			boolean esPrimo = true;
	
			for (int j=2; j<i; j++) {
				
				if (i%j==0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				contadorPrimos++; 
			}
		}
		System.out.println("El total es "+ contadorPrimos);
		input.close();

	}

}
