package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int [] vectorInteracciones = new int [6];
		
		Ejercicio01.leerVectorInteracciones(vectorInteracciones);
		Ejercicio01.mostrarVectorInteracciones(vectorInteracciones);
		Ejercicio01.totalVectorInteracciones(vectorInteracciones);
		Ejercicio01.totalVectorInteraccionesPosicionPar(vectorInteracciones);
		Ejercicio01.totalVectorInteraccionesPosicionImpar(vectorInteracciones);
		
		System.out.println("________________________________________________________________");
		System.out.println("Introduce un numero");
		int numero = input.nextInt();
		Ejercicio01.cantidadInteraccionesMayores(vectorInteracciones, numero);

		
		input.close();
	}
	static void leerVectorInteracciones (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("Introduce la cantidad de interacciones de cada post ("+(i+1)+" de 6)");
			vector[i] = input.nextInt();
		}
	}
	static void mostrarVectorInteracciones (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print("["+vector[i]+"]"+" ");
		}
	}
	static void totalVectorInteracciones (int [] vector) {
		int suma = vector[0];
		for (int i=0; i<6; i++) {
		suma = suma+vector[i];
			System.out.println("\nTotal de interacciones es: "+suma);
		}
	}
	static void totalVectorInteraccionesPosicionPar (int [] vector) {
		int totalPares =0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]%2==0) {
				totalPares += vector[i];
			}

		}
		System.out.println("Total de interacciones post pares: "+totalPares);

	}
	static void totalVectorInteraccionesPosicionImpar (int []vector) {
		int totalImpares =0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]%2==0) {
			} else {
				totalImpares += vector[i];
			}
		}
		System.out.println("Total de interacciones post impares: "+totalImpares);
	}
	static void cantidadInteraccionesMayores (int [] vector, int numero) {
		int totalMayores =0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]>numero) {
				totalMayores++;
			}
		}
		System.out.println("Total de post con interacciones mayores a "+numero+" : "+totalMayores);
	}

}
