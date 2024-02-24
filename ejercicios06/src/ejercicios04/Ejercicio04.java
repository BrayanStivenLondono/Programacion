package ejercicios04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero entero positivo");
		int numero = input.nextInt();
		
		for (int i=0; i<numero; i++) {
			System.out.println((i)+" Es primo? "+(Metodo04.esPrimo(numero)));
			
		}
		System.out.println(Metodo04.esPrimo(47));
		
		input.close();

	}

}
