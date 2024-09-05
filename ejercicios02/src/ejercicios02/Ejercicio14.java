package ejercicios02;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		System.out.println("¿ Cuantos caracteres quieres mostrar ?"); // 5, los cinco primero (incluye espacios)
		int cantidad = input.nextInt();
		
		System.out.println(cadena.substring(0,cantidad));
		
		
		input.close();

	}

}
