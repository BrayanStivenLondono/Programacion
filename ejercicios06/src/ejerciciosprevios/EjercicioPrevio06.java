package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		double numero1 = input.nextDouble();
		System.out.println("Dame otro numero");
		double numero2 =  input.nextDouble();
		
		//llamo a metodos
		EjercicioPrevio06.suma(numero1,numero2);
		EjercicioPrevio06.resta(numero1,numero2);
		
		input.close();
	}
	//recibe dos numeros int
	// suma (int numero1, int numero2)

	static void suma (double n1, double n2) {
		System.out.println("La suma es "+(n1+n2));
		
	}
	static void resta (double numero1, double numero2) {
		System.out.println("La suma es "+(numero1-numero2));
		
	}

}
