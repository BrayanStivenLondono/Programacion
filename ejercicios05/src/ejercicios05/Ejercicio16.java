package ejercicios05;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Pedir por teclado un número entero ‘cantidadSueldos’. Posteriormente pedir tantos sueldos como indica la variable ‘cantidadSueldos’.
		// Finalmente mostrar el sueldo mas alto. Utilizar el tipo de datos adecuado.
		
		System.out.println("Dime varios sueldos ");
		int cantidadSueldos = input.nextInt();
		
		float mayor=0;
		
		for (int i=0; i<cantidadSueldos; i++) {
			System.out.println("Introdude el sueldo ");
			float sueldo=input.nextFloat();
			
			// si es el primer sueldo es el mayor
			if (sueldo>mayor) {
				mayor=sueldo;
			}
		}
		System.out.println("El sueldo mayor es "+ mayor);

	
		
		input.close();

	}

}
