package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		//pide
		System.out.println("Rellenamos primer array");
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Introduce un entero ");
			array1[i] = input.nextInt();
		}
		System.out.println();

		System.out.println("Rellenamos segundo array");
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Introduce un entero ");
			array2[i] = input.nextInt();
		}
		System.out.println();//muestra
		//----------------------------------------------------
		int[] arrayResultado = sumaArray2(array1, array2);

		System.out.println("array1");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println("");
		System.out.println("array2");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]+ " ");
		}
		//------------------------------------------------------
		//resuelve
		System.out.println("");
		System.out.println("array resultado");
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.print(arrayResultado[i]+" ");
		}

		input.close();
	}

	private static int[] sumaArray2(int[] array1, int[] array2) {
		int[] resultado = new int[array1.length];
		
		for (int i=0; i<array1.length; i++) {
			resultado[i] = array1[i] + array2[array2.length-1-i];
		}
		return resultado;
	}
}
