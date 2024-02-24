package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio09 {

	public static void main(String[] args) {
		//llamo metodos
		EjercicioPrevio09.multiplica();
		EjercicioPrevio09.division();

	}

	static void multiplica () {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		int numero1 = input.nextInt();
		System.out.println("Dame otro numero");
		int numero2 = input.nextInt();
		
		System.out.println("La multiplicacion es "+(numero1*numero2));
		
		input.close();
	}
	static void division () {
		int numero1 = 8;
		int numero2 = 7;
		System.out.println("La division es "+(numero1/numero2));
		
	}

}
