package ejercicios05;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa que pide al usuario una cadena de texto, la pasa a minúsculas, y muestra los caracteres de la cadena por separado.
		// toLowerCase()	Pasa a minuscula
		System.out.println("Dame una cadena de texto");
		String cadena = input.nextLine() .toLowerCase(); // todo el texto entrante queda en minuscula
		
		int contadorA=0; // [contador]
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		for (int i=0; i<cadena.length(); i++) { //recorrido de cadena (empieza en 0 y termina al final de la cadena) 
			// se encarga de coger el caracter de la cadena 
			char caracter = cadena.charAt(i); // lee todas las palabras		
			//primera vuelta char caracter=cadena.charAt(0);
			//segunda vuelta char caracter=cadena.charAt(1);
			
			if (caracter=='a') { // [contador]
				contadorA++; // [contador]
			} else if (caracter=='e') {
				contadorE++;
			} else if (caracter=='i') {
				contadorI++;
			} else if (caracter=='o') {
				contadorO++;
			} else if (caracter=='u') {
				contadorU++;
			}
		}
		// 3 vocales y 15 letras -> porcentaje -> 3/15*100
	    // porcentajes -> cantidad/total
		// al ser contador int no funciona sino lo casteo a double
		//                                  casting
		System.out.println("el ratio A " + ((double)contadorA/cadena.length()*100));
		System.out.println("el ratio E " + ((double)contadorE/cadena.length()*100));
		System.out.println("el ratio I " + ((double)contadorI/cadena.length()*100));
		System.out.println("el ratio O " + ((double)contadorO/cadena.length()*100));
		System.out.println("el ratio U " + ((double)contadorU/cadena.length()*100));


	
		
		input.close();
	}

}
