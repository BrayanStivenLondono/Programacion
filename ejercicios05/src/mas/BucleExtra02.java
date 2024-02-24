package mas;

import java.util.Scanner;

public class BucleExtra02 { //nombre de clase

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
		// contrario, el programa termina cuando se introduce un espacio.
		
	
		String cadena = "";
		do {
			System.out.println("Introduce caracter (espacio para acabar)");
			cadena = input.nextLine();
			char caracter = cadena.charAt(0);
			
			if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u') {
				   System.out.println("VOCAL");
				   
				} else {
				   System.out.println("NO VOCAL");
		    }
		
		} while (!cadena.equals(" "));	
		System.out.println("Fin del programa");
		input.close();
	}

}
