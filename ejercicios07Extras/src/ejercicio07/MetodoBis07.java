package ejercicio07;

import java.util.Scanner;

public class MetodoBis07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame el tamaņo del vector");
		int tam = input.nextInt();

		int[] array1 = new int[tam];
		int[] array2;

		MetodoBis07.rellenarNumAleatorioArray(array1, 10, 100);

		array2 = array1;

		array1 = new int[tam];

		MetodoBis07.rellenarNumAleatorioArray(array1, 10, 100);

		int array3[] = MetodoBis07.multiplicador(array1, array2);

		System.out.println("array1");
		MetodoBis07.mostrarArray(array1);
		System.out.println("array2");
		MetodoBis07.mostrarArray(array2);
		System.out.println("array3");
		MetodoBis07.mostrarArray(array3);
		
		input.close();
	}
	public static void rellenarNumAleatorioArray(int[] vector, int a, int b) {
		for (int i=0; i<vector.length; i++) {
			vector[i] = ((int) Math.floor(Math.random()*(a-b)+b));
		}
	}

	public static void mostrarArray(int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("En el indice "+i+" esta el valor "+vector[i]);
		}
	}

	public static int[] multiplicador(int[] vector1, int[] vector2) {
		int[] vector3 = new int[vector1.length];
		for (int i=0; i<vector1.length; i++) {
			vector3[i] = vector1[i]*vector2[i];
		}
		return vector3;
	}
}
