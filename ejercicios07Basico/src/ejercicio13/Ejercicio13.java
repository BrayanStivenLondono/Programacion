package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = new int [3]; 
		System.out.println("Introduce los valores");
		for (int i=0; i<miVector.length; i++) {
			miVector [i] = input.nextInt();
		}
		
		System.out.println("Seleccione una opcion");
		System.out.println("1 - Suma del Array");
		System.out.println("2 - Minimo del Array");
		System.out.println("3 - Maximo del Array");
		System.out.println("4 - Media del Array");
		System.out.println("5 - Salir");
		int opcion = input.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Suma "+Ejercicio13.suma(miVector));
		break;
		case 2:
			System.out.println("Minimo "+Ejercicio13.minimo(miVector));
		break;
		case 3:
			System.out.println("Maximo "+Ejercicio13.maximo(miVector));
		break;
		case 4:
			System.out.println("Media "+Ejercicio13.media(miVector));
		break;
		case 5:
			System.exit(opcion);
			System.out.println("Fin");
		break;
		default:
			System.out.println("Opcion incorrecta");
		break;
			
	}
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
