package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame el tamaño de vector");
		int tam = input.nextInt();
		
		int [] miVector = new int [tam];
		
		int multiplica =1;
		
		for (int i=0; i<miVector.length; i++) {
			System.out.println("Introduce el valor "+i+ " de la multiplicacion");
			miVector[i] = input.nextInt();
			multiplica = multiplica*miVector [i];
		}
		System.out.println("La multiplicacion es "+multiplica);

		input.close();
	}

}
