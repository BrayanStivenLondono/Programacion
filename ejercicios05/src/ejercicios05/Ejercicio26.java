package ejercicios05;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Introduce un numero " + "decimal para convertir a binario");
		int numero = input.nextInt();

		String resultado =" ";

		while (numero>=1) {
			// Concatenar de izda a derecha
			resultado += (numero%2);
			numero /= 2;
		}

		System.out.println("El resultado es: "+resultado);

		input.close();
	}
	
}
