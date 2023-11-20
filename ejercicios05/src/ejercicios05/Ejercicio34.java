package ejercicios05;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Comprobar si un número introducido por teclado es primo. Un número primo es aquel que solo es divisible entre sí mismo y entre 1.
		System.out.println("Introduce un numero");
		
		int numero = input.nextInt();
	
		boolean esPrimo = true;
		
		// para calcular divisores no puedo usar el 1 (todos los numeros de divisible a 1)
		
		for (int i=2; i<=numero%2; i++) {
			if (numero%1==0) {
				esPrimo = false;
				break; // opcinal (si hay divisor el numero ya no es primo
				       // por lo tanto, puedo sallir del bucle > break;
								
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
