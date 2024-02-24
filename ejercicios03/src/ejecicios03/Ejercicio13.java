package ejecicios03;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame una cadena");
		String cadena1=input.nextLine();
		System.out.println("Dame otra cadena");
		String cadena2=input.nextLine();
		
		if (cadena1.equals(cadena2)) {
			System.out.println("mismos caracteres (coincidencia es completa)");
			
		} else {
			if (cadena1.equalsIgnoreCase(cadena2)) {
				System.out.println("mismas letras (mayusculas, minusculas distintas)");
				
			} else {
				System.out.println("no son iguales");
			}
		}
		
		input.close();

	}

}
