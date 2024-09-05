package ejecicios03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que lea un carácter por teclado e indique si es una letra mayúscula (tipo char).
		System.out.println("Dame una letra");
		char letra = input.nextLine().charAt(0);
		
		if (letra>='A' && letra <='Z') {
			System.out.println("La letra es mayuscula");
		} else {
			System.out.println("La letra es minuscula");	
			
		input.close();
		}

	}

}
