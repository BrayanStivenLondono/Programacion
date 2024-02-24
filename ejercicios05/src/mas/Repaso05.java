package mas;

import java.util.Scanner;

public class Repaso05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// pasa la cadena a mayuscula > toLowerCase
		// pasa la cadena a minuscula > toUpperCase
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)>='a' && cadena.charAt(i)<='z') {
			}
		}
		System.out.println("Cambios: "+cadena.toUpperCase());
		//---------------------------------------------------------------
		
		input.close();
	}

}
