package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		int [] miVector = new int [2];
		
		int multiplica =1;
		
		for (int i=0; i<miVector.length; i++) {
			System.out.println("Introduce el valor "+i+ " de la multiplicacion");
			miVector[i] = input.nextInt();
			multiplica *= miVector[i];
		}
		System.out.println("La multiplicacion es "+multiplica);

		input.close();
	}

}
