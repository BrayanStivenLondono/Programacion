package ejercicios05;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Crea una aplicaci�n que dibuje una escalera de n�meros, siendo cada l�nea n�meros empezando en uno y acabando en el n�mero de la l�nea.
		
		System.out.println("Introduce la altura de la escalera");
		int altura = input.nextInt();
		
		for (int i=1; i<=altura; i++ ) {
			for (int j=1; j<=i; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
		input.close();
		//1
		//12
		//123
	}

}
