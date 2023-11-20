package ejercicios02;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		 
		 String cadena = input.nextLine();
		 System.out.println("Introuduce dos palabras separadas");
		
		 int posicionEspacio = cadena.indexOf(' ')+1;
		 		 
		 String palabra1 = cadena.substring(0, posicionEspacio);
		 String palabra2 = cadena.substring(posicionEspacio);
		 
		 System.out.println(palabra2 + " " + palabra1);		 
		 
		
		 input.close();
	}

}
