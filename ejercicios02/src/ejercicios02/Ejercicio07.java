package ejercicios02;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que lea un número entero de 5 cifras y 
		// muestre sus cifras  desde el principio como en el ejemplo.
		
		System.out.println("introduce un numero de tres cifras");
		String cadena = input.nextLine();
		// descomponer texto
		
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(1));
		System.out.println(cadena.charAt(2));
		
		
		System.out.println("dame un numero (2* vez)");
		int numero = input.nextInt();
		// descomponer numeros
		System.out.println(numero/100);
		System.out.println((numero/10)%10);
		System.out.println(numero%10);
		
		
		
		
		
		
		input.close();
	}

}
