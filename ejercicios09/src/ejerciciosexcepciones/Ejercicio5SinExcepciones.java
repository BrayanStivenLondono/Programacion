package ejerciciosexcepciones;

import java.util.Scanner;

public class Ejercicio5SinExcepciones {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		double numero = input.nextDouble();
		
		System.out.println("Raiz cuadrada de " + numero + "=" + Math.sqrt(numero));
		input.close();

	}

}
