package ejercicios02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Programa que pide y lee 2 cadenas de texto por teclado 
		// y me dice si son iguales o no lo son (Operador ?)
		Scanner input = new Scanner (System.in);
		
		System.out.println("introduce una cadena");
		String cadena1 = input.nextLine();
		
		System.out.println("dame otra cadena ");
		String cadena2 = input.nextLine();
		
		System.out.println(cadena1.equals(cadena2)?"Las cadenas son iguales ": "Las cadenas son diferentes");
		
		
		
		
		
		
		
		
		
		input.close();
		

	}

}
