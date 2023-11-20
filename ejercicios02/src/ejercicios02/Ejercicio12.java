package ejercicios02;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame un cadena");
		String cadena = input.nextLine();
		
		System.out.println("Dame un caracter");
		char caracter = input.nextLine().charAt(0); //Se pone ambos para comparar / nextLine()-(cadena) y charAt-(0)(caracter) 
		
		System.out.println(caracter==cadena.charAt(0) ? "la cadena comienza por el caracter" : "la cadena es comienza con el caracter");
		
		input.close();

	}

}
