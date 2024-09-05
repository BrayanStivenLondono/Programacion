package ejercicios02;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// dice si la primera está contenida en la segunda
		
		System.out.println("Introduce la primera cadena");
		String cadena1 = input.nextLine();
		
		System.out.println("introduce la segunda cadena");
		String cadena2 = input.nextLine();
		
		boolean contenidas = cadena1.contains(cadena2);
		System.out.println("cadena1" + cadena1);
		System.out.println("cadena2" + cadena2);

		System.out.println(contenidas ? "la cadena2 esta contenida en cadena1" : "La cadena2 esta contenida en cadena1 ");
		
		input.close();

	}

}
