package ejercicios05;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Tablas de multiplicar
		System.out.println("Introduce un numero");
		int numero = input.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.println(numero+" x "+i+ " = "+numero*i);
		}
		
		input.close();

	}

}