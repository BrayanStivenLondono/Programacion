package ejercicios05BuclesExtra;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// SE REPITE

		int opcion =0;
		
		do {
			System.out.println("\nMenus de opciones");
			System.out.println("1. Numeros de 1 a 100 con un while");
			System.out.println("2. Positivos negativos o pares");
			System.out.println("3. Salir");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1: 
				System.out.println("Numeros del 1 al 100");
				int numeros = 0;
				
				while (numeros<100) {
					numeros++;
					System.out.println(numeros);
				}
				break;
			case 2:
				System.out.println("Introduce un numero");
				int numero = input.nextInt();
				
				do {
					if (numero%2==0) {
						System.out.println("par");
						
					} else {
						System.out.println("impar");
					}
					if (numero<0) {
						System.out.println("negativo");
					} else {
						System.out.println("positivo");
					}
					break;
				
				} while (numero!=0);
				
				break;
			case 3:
				System.out.println("Salir");
				break;
			}
			
		} while (opcion!=3);
		
		
		
		input.close();
	}

}
