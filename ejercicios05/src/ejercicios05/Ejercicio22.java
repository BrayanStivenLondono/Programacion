package ejercicios05;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce un numero binario de cualquier cantidad de cifras");
		String binario = input.nextLine();

		int exponente = 0;
		long resultado = 0;

		// Recorro desde el bit de menos peso hasta la de más
		for (int i=binario.length()-1; i>=0; i--) {

			if (binario.charAt(i)=='1') {
				resultado = resultado+(long)(Math.pow(2, exponente));
			}
			exponente++;
		}

		System.out.println("La conversion es: "+resultado);

		input.close();

	}

}
