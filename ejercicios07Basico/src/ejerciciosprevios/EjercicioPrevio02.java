package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] enteros = new int [10];
		
		//pido 10 datos y lo voyt a guardar en el vector
		
		for (int i=0; i<enteros.length; i++) {
			System.out.println("Dame un numero");
			enteros [i] = input.nextInt();
		}
		System.out.println("[");
		for (int i=0; i<enteros.length; i++) {
			System.out.print(enteros[i]+" ");
		}
		System.out.println("]");
		input.close();

	}

}
