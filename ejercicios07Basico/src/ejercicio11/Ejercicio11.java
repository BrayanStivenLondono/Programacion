package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = new int [3]; 
		System.out.println("Introduce los valores");
		for (int i=0; i<miVector.length; i++) {
			miVector [i] = input.nextInt();
		}
		
		Ejercicio11.maximo(miVector);
		Ejercicio11.minimo(miVector);
		Ejercicio11.suma(miVector);
		Ejercicio11.media(miVector);
		
		input.close();
	}
	static void minimo (int [] vector) {
		int minimo = vector[0];
		for (int i=0; i<vector.length; i++) {
			if (vector[i]<minimo) {
				minimo = vector[i];

			}
		}
		System.out.println("El minimo es "+minimo);
	}
	static void maximo (int [] vector) {
		int maximo =0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]>maximo) {
				maximo = vector[i];

			}
		}
		System.out.println("El maximo es "+maximo);
	}
	static void suma (int [] vector) {
		int suma =0;
		for (int i=0; i<vector.length; i++) {
			suma = suma+vector[i];
		}
		System.out.println("La suma es "+suma);

	}
	static void media (int [] vector) {
		int suma =0;
		double media =0;
		for (int i=0; i<vector.length; i++) {
			suma = suma+vector[i];
		}
		media = (double) suma/vector.length;
		System.out.println("La media es "+media);

	}
}
