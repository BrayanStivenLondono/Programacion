package ejercicios05;

import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Crea una aplicación que dibuje una pirámide de asteriscos.
		System.out.println("Introduce la altura de la piramide");
		int altura = input.nextInt();		

		for (int i=1; i<=altura; i++) {
		
			int numEspacios = altura-i;
			for (int j=numEspacios; j>0; j--) {
				System.out.print(" ");
			}
			int numAsteriscos = i*2-1;
			for (int k=0; k<numAsteriscos; k++) {
				System.out.print("*");

			}
			System.out.println();

		}

		input.close();
	}

}
