package ejecicios03;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que lea un número entero e indique si el número es múltiplo de 10. // multiplo > % (10,20,30,40,50......
		System.out.println("Dame un numero entero");

		int numero = input.nextInt(); 
		
		if (numero%10==0) {
			System.out.println("El numero es multiplo de 10");
			
		} else {
			System.out.println("El numero no es multiplo de 10");
			
		}
		
		input.close();

	}

}
