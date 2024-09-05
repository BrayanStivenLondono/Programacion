package mas;

import java.util.Scanner;

public class Figura {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Introduce su lado"); // CUADRODA con su lados iguales
		int lado = input.nextInt();
		
		for (int i=0; i<lado; i++) {
			for (int j=0; j<lado ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//----------------------------------------------------------------------------------------
		System.out.println("Introduce su largo"); // CUADRADO con alto y ancho
		int largo = input.nextInt();
		System.out.println("Introduce su ancho");
		int ancho = input.nextInt();
		
		for (int i=0; i<largo; i++) {
			for (int j=0; j<ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//-------------------------------------------------------------------------------------------
		System.out.println("Introduce el alto de la escalera"); // ESCALERA
		int altura = input.nextInt();
		
		for (int i=1; i<=altura; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		input.close();
	}

}
