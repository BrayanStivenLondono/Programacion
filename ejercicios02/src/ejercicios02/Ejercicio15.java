package ejercicios02;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
		 // cambia de posicion las cadenas
		 System.out.println("Introuduce dos palabras separadas");
		 String cadena = input.nextLine();
		
		 int posicionEspacio = cadena.indexOf(' ')+1;
		 		 
		 String palabra1 = cadena.substring(0, posicionEspacio);
		 String palabra2 = cadena.substring(posicionEspacio);
		 
		 System.out.println(palabra2 + " " + palabra1);		 
		 
		
		 input.close();
	}

}
