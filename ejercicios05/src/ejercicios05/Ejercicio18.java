package ejercicios05;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Pedir 5 n�meros e indicar al final si alguno es m�ltiplo de 3.
        // si hay o no > boolean
		// primero false y despues si hay lo paso a true
		
		// para pedir caracter
		//                     lee         y  analizar  el texto.
		// char caracter = input.nextLine(). charAt(0); //ASI
		// == sirve para compara numeros
		// equals sirve para compara caracteres
		
		System.out.println("Dame el tama�o de un lado");
		int lado = input.nextInt();
	
	    for (int i=0; i<lado; i++) {
	    	for (int j=0; j<lado; j++) {
				System.out.print("("+i+","+j+") ");

	       }
	    	System.out.println();
			
       }

		input.close();

	}

}
