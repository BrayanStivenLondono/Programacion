package ejecicios03;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame una letra");
		char letra = input.nextLine().charAt(0);
	
		
		if (letra>='0' && letra <='9') {
			System.out.println("Es una cifra");
			
		} else { 
			System.out.println("No es una cifra");
		}

		input.close();
	}

}

