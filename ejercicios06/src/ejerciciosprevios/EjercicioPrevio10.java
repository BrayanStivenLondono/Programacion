package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		double numero1 = input.nextDouble();
		System.out.println("Dame otro numero");
		double numero2 =  input.nextDouble();
		
		//llamo a metodos
		EjercicioPrevio10.multiplica(numero1,numero2);
		EjercicioPrevio10.divide(numero1, numero2);
		
		input.close();
	}
	//recibe dos numeros int
	// suma (int numero1, int numero2)

	static void multiplica (double n1, double n2) {
		System.out.println("La multiplicacion es "+(n1*n2));
		
	}
	static void divide (double numero1, double numero2) {
		System.out.println("La division es "+(numero1/numero2));
		
	}

}
