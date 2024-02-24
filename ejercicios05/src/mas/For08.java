package mas;

import java.util.Scanner;

public class For08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// el ej 17 es similar, tambien mirar el 16 (pide varios numero y dice cual es el mayor)
		System.out.println("Introduce un numero");
		int numero = input.nextInt();

		boolean esPrimo = true;
		 // % = 2
		for (int i=2; i<numero; i++) { // importante
			
			if(numero%i==0) {  // importante (puedo poner numero%2 o numero%i || porque i vale 2
				esPrimo = false;
			}
		}
		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		input.close();
	}

}
