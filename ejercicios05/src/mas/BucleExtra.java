package mas;

import java.util.Scanner;

public class BucleExtra {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
		// El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
		
		System.out.println("Introduce la cantidad de numeros a pedir");
		int cantidadNumeros = input.nextInt();
				
		int mayor =0;
		int menor =0;
		int igual =0;

		int numero =0;
		do {
				
		for (int i=0; i<cantidadNumeros; i++) {
			System.out.println("Introduce los numeros "+(i+1));
			numero = input.nextInt();
			
			if (numero>0) {
				mayor++;
			}
			if (numero<0) {
				menor++;
			}
			if (numero==0) {
				igual++;
			}
			
		}
		} while (cantidadNumeros==numero);
		System.out.println(mayor+" son mayores a 0");
		System.out.println(menor+" son menores a 0");
		System.out.println(igual+" son igual a 0");

		input.close();

	}

}
