package mas;

import java.util.Scanner;

public class BucleExtra03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.

		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		System.out.println("Introduce el caracter a buscar");
		char caracter = input.nextLine() .charAt(0);
		
		int contadorLetra=0;
		
		for (int i=0; i<cadena.length(); i++) {
			
			if (cadena.charAt(i)==caracter) {
				contadorLetra++;
			}
		}
		System.out.println("El caracter "+"("+caracter+")"+" aparece "+contadorLetra+" veces");
		
		input.close();
	}

}
