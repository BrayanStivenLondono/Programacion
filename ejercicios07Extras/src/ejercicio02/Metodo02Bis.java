package ejercicio02;

import java.util.Scanner;

public class Metodo02Bis {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el tama�o del array");
		int tam = input.nextInt();
		
		int [] vector = new int [tam];
		
		Metodo02.rellenarArrayAleatorio(vector,0,9);
		Metodo02.mostrarArray(vector);
		
		input.close();
	}
	public static void rellenarArrayAleatorio (int [] vector, int a, int b) {
		for (int i=0; i<vector.length; i++) {
<<<<<<< HEAD
			vector[i] = (int) Math.floor(Math.random()*(a-b)+b);
=======
			vector[i] = (int)Math.floor(Math.random()*(a-b)+b);
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		}
	}
	
	public static void mostrarArray (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("Indice "+i+" valor "+vector[i]);
		}
	}
}
