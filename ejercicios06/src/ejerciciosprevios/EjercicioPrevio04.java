package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		int numero1 = input.nextInt();
		System.out.println("Dame otro numero");
		int numero2 =  input.nextInt();
		
		//llamo a metodos
		EjercicioPrevio04.suma(numero1,numero2);
		EjercicioPrevio04.resta(numero1,numero2);
		
		
		input.close();

	}
	//recibe dos numeros int
	// suma (int numero1, int numero2)

	static void suma (int numero1, int numero2) {
		System.out.println("La suma es "+(numero1+numero2));
		
	}
	static void resta (int numero1, int numero2) {
		System.out.println("La resta es "+(numero1-numero2));
		
	}

}
