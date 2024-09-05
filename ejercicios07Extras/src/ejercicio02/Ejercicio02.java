package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce el tamaño del array");
		int tam = input.nextInt();
		
		int [] vector = new int [tam];
		
		Metodo02.rellenarArrayAleatorio(vector,0,9);
		Metodo02.mostrarArray(vector);
		
		input.close();
	}
	
}
