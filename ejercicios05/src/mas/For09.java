package mas;

import java.util.Scanner;

public class For09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Contador de letras de una cadena
		
		System.out.println("Introcude un caracter");
		char caracter = input.nextLine().charAt(0);
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		int contadorLetra =0;
		
		for (int i=0; i<cadena.length(); i++) {
			
			if (cadena.charAt(i)==caracter) {
				contadorLetra++;
			}
		}
		System.out.println("El cantidad del caracter " +caracter+ " es "+contadorLetra);
		
		input.close();
	}

}
