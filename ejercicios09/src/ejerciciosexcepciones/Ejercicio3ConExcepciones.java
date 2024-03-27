package ejerciciosexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3ConExcepciones {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		try {
			System.out.println("Dame un numero");
			numero = input.nextInt();
			System.out.println("El numero es " + numero);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Error, formato de numero incorrecto");
		}
	}
}
