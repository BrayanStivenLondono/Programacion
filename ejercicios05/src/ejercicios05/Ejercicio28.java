package ejercicios05;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que pida n�mero enteros, hasta introducir el n�mero 0. En ese momento indicar 
		// cu�l es el mayor, el menor y la cantidad de n�meros le�da, sin contar el 0.
		
		int numeroLeido ;
		int contador = 0;
		int menor =9999999;
		int mayor =0;
		
		do {
			System.out.println("Introduce varios numero (0 para acabar)");
			numeroLeido = input.nextInt();
			contador++; //acomulador
			
			if (numeroLeido!=0 && numeroLeido>mayor) { 
				mayor = numeroLeido;
			}
			if (numeroLeido!=0 && numeroLeido<menor) {
				menor = numeroLeido;
			}
			
			
		} while (numeroLeido!=0);
		System.out.println("La cantidad de numeros leidos es "+(contador-1));
		System.out.println("El menor es " + menor);
		System.out.println("El mayor es " + mayor);
		System.out.println("La suma de los numeros es "+ (numeroLeido+contador+menor+mayor-1));

		input.close();

	}

}