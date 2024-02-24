package mas;

import java.util.Scanner;

public class BucleExtra07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		System.out.println("Introduce un caracter");
		char caracter = input.nextLine().charAt(0);
		
		int contadorLetra =0;
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)==caracter) {
				contadorLetra++;
			}
		}
		System.out.println("El caracter "+caracter+" aparece "+contadorLetra+" veces");
		//--------------------------------------------------------------------------------------------------------------
		
		System.out.println("Introduce una cadena");
		String cadena1 = input.nextLine();
		System.out.println("Introduce un caracter");
		char caracter1 = input.nextLine().charAt(0);
		System.out.println("Introduce un segundo caracter");
		char caracter2 = input.nextLine().charAt(0);
		
		String cadena2 = "";
		for (int i=0; i<cadena1.length(); i++) {
			
			if (cadena1.charAt(i)==caracter1) {
				cadena2 = (cadena2)+caracter2;
			} else {
				cadena2 = cadena2 +cadena1.charAt(i);
			}
			
		}
		System.out.println("La cadena inicial "+cadena2);
		System.out.println("La cadena Final "+cadena2.replace(caracter1, caracter2));
	
		input.close();
	}

}
