package ejercicios05;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// pedo 10 numeros reales usando un bucle
		// cuando se cuantos tengo que pedir y no tengo que poner condiciones
		// bucle FOR
		
		double suma=0;
		System.out.println("Bucle1");
		for (int i = 0; i < 10; i++) {
			System.out.println("Dame un numero");
			double numero = input.nextDouble();
			// almacena el resultado
			// sumando el dato > acomulador
			suma = suma + numero; // acomulador
			
			
		}
		System.out.println("La suma es" + suma);

		
		input.close();

	}

}
