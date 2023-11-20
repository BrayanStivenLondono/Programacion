package ejecicios03;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que lea un número entero e indique si es par o impar.
		System.out.println("Dame un numero entero");
        int numero = input.nextInt();
		
		
		if (numero%2==0) { // lo que va delante del ?
			System.out.println("El numero es par"); // valor del si
			
		} else {
			System.out.println("El numero es impar"); // valor de no

			input.close();
		}
		

	}

}