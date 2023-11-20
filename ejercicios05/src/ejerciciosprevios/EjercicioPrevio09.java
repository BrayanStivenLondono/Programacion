package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un tamaño de lado");
		int lado = input.nextInt();
		
		for (int i=0; i<lado; i++) {
			for (int j=0; j<lado; j++) {
				System.out.print("("+i+","+j+ ")");
			}
			System.out.println();
		}
		
		
		
		
		
		
		input.close();

	}

}
