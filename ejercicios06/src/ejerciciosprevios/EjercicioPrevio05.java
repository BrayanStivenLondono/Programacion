package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		int numero1 = input.nextInt();
		System.out.println("Dame otro numero");
		int numero2 =  input.nextInt();
		
		//llamo a metodos
		EjercicioPrevio05.suma(numero1,numero2);
		EjercicioPrevio05.resta(numero1,numero2);
		
		input.close();
	}
	//recibe dos numeros int
	// suma (int num1, int num2)

	static void suma (int n1, int n2) {
		System.out.println("La suma es "+(n1+n2));
		
	}
	static void resta (int numero1, int numero2) {
		System.out.println("La suma es "+(numero1-numero2));
		
	}

}
