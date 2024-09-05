package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String [] cadena = new String [5];
		
		for (int i=0; i<cadena.length; i++) {
			System.out.println("Dame una palabras");
			cadena [i] = input.nextLine();
		}
		for (int i=0; i<cadena.length; i++) {
			System.out.print(cadena[i]);
		}
		
		input.close();
	}

}
