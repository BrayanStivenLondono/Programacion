package ejecicios03;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que lea dos caracteres por teclado e indique si son iguales (tipo char).
		System.out.println("Dame un letra");
		char caracter1 = input.nextLine().charAt(0);
		
		System.out.println("Dame otras letra");
		char caracter2 = input.nextLine().charAt(0);

		if (caracter1==caracter2) {
			System.out.println("Son iguales");
			
		} else { 
			System.out.println("No son iguales");
		}
		
		
		
		
		
		
		
		
		input.close();
	}

}
