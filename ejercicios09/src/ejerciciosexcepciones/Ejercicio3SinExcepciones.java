package ejerciciosexcepciones;

import java.util.Scanner;

public class Ejercicio3SinExcepciones {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		System.out.println("Dame un numero");
		numero = input.nextInt();
		System.out.println("El numero es " + numero);
		input.close();
	}
}
