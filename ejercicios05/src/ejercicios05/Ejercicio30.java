package ejercicios05;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// 30) Programa que me pide un n�mero entero positivo y me muestra por consola todos los
		// divisores de ese n�mero desde el numero 1 hasta el numero introducido, ambos incluidos.
		
		System.out.println("Dame un numero positivo");
		int numero = input.nextInt();
		System.out.println("Sus divisores son ");
		
		for (int i=1; i<=numero; i++) {
			
			if (numero%i==0) {
				System.out.print(i+" ");
				
			}
		}
		
		
		
		
	
		input.close();

	}

}
