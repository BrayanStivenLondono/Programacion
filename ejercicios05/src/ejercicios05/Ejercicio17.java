package ejercicios05;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Pedir 10 números, y decir al final si se ha introducido alguno negativo.
        Scanner input = new Scanner (System.in);

        // si hay o no numeros negativos > boolean
        boolean hayNegativos = false;
        
		for (int i=0; i<=10; i++ ) {
			System.out.println("Dame dies numeros enteros");
			int numero = input.nextInt();
			
			if (numero<0) {
				hayNegativos = true;
			}
		}
		// comprobamos si ha leidos negativos
		if (hayNegativos) {
			System.out.println("Hay negativos");
		} else {
			System.out.println("No hay negativos");
		}

        input.close();
	}

}
