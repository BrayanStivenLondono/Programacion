package ejercicio06;

import java.util.Scanner;

public class Metodo06Bis {

	public static void main(String[] args) {
		Metodo06.caracteres();
		
	}
	public static void caracteres () {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una frase");
		String letra = input.nextLine();
		
		char [] caracter = new char [letra.length()];
		
		for (int i=0; i<letra.length(); i++) {
			caracter[i] = letra.charAt(i);
			System.out.print("["+caracter[i]+"]"+" ");
		}
		input.close();
	}
}
