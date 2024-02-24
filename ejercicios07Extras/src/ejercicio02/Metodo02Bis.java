package ejercicio02;

import java.util.Scanner;

public class Metodo02Bis {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el tamaño del array");
		int tam = input.nextInt();
		
		int [] vector = new int [tam];
		
		Metodo02.rellenarArrayAleatorio(vector,0,9);
		Metodo02.mostrarArray(vector);
		
		input.close();
	}
	public static void rellenarArrayAleatorio (int [] vector, int a, int b) {
		for (int i=0; i<vector.length; i++) {
			vector[i] = (int)Math.floor(Math.random()*(a-b)+b);
		}
	}
	
	public static void mostrarArray (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("Indice "+i+" valor "+vector[i]);
		}
	}
}
