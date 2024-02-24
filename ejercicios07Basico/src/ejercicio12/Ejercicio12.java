package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = new int [3]; 
		System.out.println("Introduce los valores");
		for (int i=0; i<miVector.length; i++) {
			miVector [i] = input.nextInt();
		}
		
		System.out.println("Minimo "+Ejercicio12.minimo(miVector));
		System.out.println("Maximo "+Ejercicio12.maximo(miVector));
		System.out.println("Suma "+Ejercicio12.suma(miVector));
		System.out.println("Media "+Ejercicio12.media(miVector));

		
		input.close();
	}
	static int minimo (int [] vector) {
		int minimo = vector[0];
		for (int i=0; i<vector.length; i++) {
			if (vector[i]<minimo) {
				minimo = vector[i];

			}
		}
		return minimo;
	}
	static int maximo (int [] vector) {
		int maximo =0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]>maximo) {
				maximo = vector[i];

			}
		}
		return maximo;
	}
	static int suma (int [] vector) {
		int suma =0;
		for (int i=0; i<vector.length; i++) {
			suma = suma+vector[i];
		}
		return suma;
	}
	static double media (int [] vector) {
		int suma =0;
		for (int i=0; i<vector.length; i++) {
			suma = suma+vector[i];
		}
		return (double) suma/vector.length;
	}
}
