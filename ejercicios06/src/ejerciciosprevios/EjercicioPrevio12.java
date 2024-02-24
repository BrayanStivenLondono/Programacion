package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio12 {

	public static void main(String[] args) {
		
		EjercicioPrevio12.mostrarLetra(); //llamo

	}
	public static void mostrarLetra () {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una letra");
		String cadena = input.nextLine();
		
		System.out.println(cadena.charAt(0));

		input.close();
	}

}
