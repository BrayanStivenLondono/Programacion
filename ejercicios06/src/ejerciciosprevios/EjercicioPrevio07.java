package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		int numero1 = input.nextInt();
		System.out.println("Dame otro numero");
		int numero2 =  input.nextInt();
		
		EjercicioPrevio07.suma(numero1,numero2);
		EjercicioPrevio07.resta(numero1,numero2);
		
		input.close();
	}

	static void suma (double n1, double n2) {
		System.out.println("La suma es "+(n1+n2));
		
	}
	static void resta (double numero1, double numero2) {
		System.out.println("La suma es "+(numero1-numero2));
		
	}

}
