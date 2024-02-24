package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		int numero1 = input.nextInt();
		System.out.println("Dame otro numero");
		int numero2 = input.nextInt();
		
		EjercicioPrevio20.sumaNumeros(numero1, numero2);
		
		int miResta = EjercicioPrevio20.restaNumeros(numero1, numero2);
		System.out.println("La resta es "+miResta);
		
		input.close();
	}
	
	static void sumaNumeros (int a, int b) {// datos entrantes
		System.out.println("La suma es "+(a+b));	
	}
	
	static int restaNumeros (int a, int b) {
		int resta = a-b;
		return resta;
	}
	

}
