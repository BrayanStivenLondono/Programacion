package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		double [] numero = new double [5];
		
		for (int i=0; i<numero.length; i++) {
			System.out.println("Dame un numero");
			numero [i] = input.nextDouble();
		}
		for (int i=0; i<numero.length; i++) {
			System.out.print(numero[i]);
		}
		input.close();

	}

}
