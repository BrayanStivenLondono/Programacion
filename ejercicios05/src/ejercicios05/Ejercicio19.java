package ejercicios05;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int acomulador =0;
		int contador =0;
		boolean hayMultiplo = false;
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un numero");
			int numero = input.nextInt();
			
			if (numero%3==0) {
				contador++; // dice cuantos numero multiplos de 3 hay 
				acomulador = acomulador+numero; // suma los numeros que son multiplos de 3
				hayMultiplo = true;
				
			}
		} 
		if (hayMultiplo) {
			System.out.println("Hay multiplos y son "+contador);

		} else {
			System.out.println("No hay multiplos");
		}
		
		input.close();
		
	}

}
