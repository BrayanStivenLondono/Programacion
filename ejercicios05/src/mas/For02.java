package mas;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// leer una cadena de texto // Fin; para acabar
		Scanner input = new Scanner (System.in);
		
		String cadena;	
		int contadorVocales=0;
		int contadorTotalCaracteres=0;
		String cadenaTotal="";
		//comparaciones de igualdad de char y de numeros ==
		//comparaciones de igualdad de String cadena.equals("cadena"). EQUALS
		
		do {
			System.out.println("Introduce una cadena");
			cadena = input.nextLine().toLowerCase();		
			
			contadorTotalCaracteres += cadena.length();
			
			for (int i=0; i<cadena.length(); i++) {				
				char letra = cadena.charAt(i);
				if (letra=='a' || letra=='e'|| letra=='i'|| letra=='o'|| letra=='u') { // le caracter
					contadorVocales++; // cuenta el caracter
				}
			}
			cadenaTotal += cadena; //acomulador
		} while (!cadena.equals("fin"));
		
		System.out.println("Cantidad vocales "+contadorVocales);
		System.out.println("Porcentaje vocales "+((double)contadorVocales/contadorTotalCaracteres*100)+"%");
		System.out.println("Cadena total: "+cadenaTotal+" ");
		
		input.close();

	}

}
