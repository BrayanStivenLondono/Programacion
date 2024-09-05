package ejercicios05;

import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Pedir 10 n�meros. Mostrar la media de los n�meros positivos, la media de los n�meros negativos y la cantidad de ceros.
		
		int contadorPositivo =0;
		int sumaPositivos=0;
		int contadorNegativo =0;
		int sumaNegativos =0;
		int contadorCeros = 0;
		
		for (int i=0; i<=10; i++) {
			System.out.println("Introduce un numero");
			int numero = input.nextInt();

			if (numero<0) {
				contadorNegativo++; // contador
				sumaNegativos -= numero; 
				
			} else if (numero>0) {
				contadorPositivo++;
				sumaPositivos += numero;
				
			} else if (numero=='0') {
				contadorCeros++;
			}
		
		}
		System.out.println("La cantidad de ceros es "+contadorCeros);
		if (contadorPositivo>0) {
			System.out.println("Media positivos "+(double)sumaPositivos/contadorPositivo);
		}
		if (contadorNegativo>0) {
			System.out.println("Media negativos "+ (double)sumaNegativos/contadorNegativo);
		}
		
		
		
		input.close();

	}

}
