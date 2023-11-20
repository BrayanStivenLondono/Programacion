package ejecicios03;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame una cadena de texto");
		String cadena1 = input.next();
		
		System.out.println("Dame otra caden de texto");
		String cadena2 = input.next();
		
		if (cadena1.equals(cadena2)) {
			
		} else { 
			if (cadena1.equalsIgnoreCase(cadena2)) {
				System.out.println("mismas letras (mayusculas, minusculas distintas)");
	
	
			}
		}
		
		
		
		
		
		
		
		
		input.close();
		

	}

}
