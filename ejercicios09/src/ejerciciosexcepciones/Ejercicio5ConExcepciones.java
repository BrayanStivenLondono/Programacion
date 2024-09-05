package ejerciciosexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5ConExcepciones {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner (System.in);
			System.out.println("Dame un numero");
			double numero = input.nextDouble();
			System.out.println("Raiz cuadrada de "+numero+" = "+Math.sqrt(numero));
			input.close();
			
		} catch (InputMismatchException e) {
			System.out.println("Error de entrada de datos");
		}
	}
}
