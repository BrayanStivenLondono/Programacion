package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
<<<<<<< HEAD
		int [] array1 = new int [5]; 
		int [] array2 = new int [5];
=======
		int [] array1 = new int [10]; 
		int [] array2 = new int [10];
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		
		for (int i=0; i<array1.length; i++) {
			System.out.println("Introduce el primer vector");
			array1[i] = input.nextInt();
		}
		
		for (int i=0; i<array2.length; i++) {
			System.out.println("Introduce el segundo vector");
			array2 [i] = input.nextInt();
		}
		
		int [] arraySuma = sumadorVector (array1,array2);
		
		for (int i=0; i<arraySuma.length; i++) {
			System.out.print(arraySuma[i]+" ");
		}
		
		input.close();
	}
<<<<<<< HEAD
	private static int[] sumadorVector (int[] array1, int[] array2) {
		int [] arraySuma = new int [5];
=======
	private static int [] sumadorVector (int [] array1, int [] array2) {
		int [] arraySuma = new int [10];
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		
		for (int i=0; i<arraySuma.length; i++) {
			arraySuma[i] = array1[i]+array2[i];
		}
		return arraySuma;
	}

}
