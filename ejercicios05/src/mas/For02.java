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
		//comparaciones de igualdad de String cadena.equals("cadena")
		
		do {
			System.out.println("Introduce una cadena");
			cadena=input.nextLine().toLowerCase();		
			
			//voy sumando la cantidad de caracteres de la cadena
			//acumulador
			
			contadorTotalCaracteres=contadorTotalCaracteres+cadena.length();
			//recorro cada cadena leida en buscar de vocales
			for (int i=0; i<cadena.length(); i++) {
				//voy a coger cada uno de los caracteres 
				
				char letra = cadena.charAt(i);
				if (letra=='a' || letra=='e'|| letra=='i'||letra=='o'||letra=='u') { // le caracter
					contadorVocales++; // cuenta el caracter
				}
			}
			//concateno cada cadena leida
			cadenaTotal = cadenaTotal+cadena; //acomulador
		}while(!cadena.equals("fin"));

		
		System.out.println("Cantidad vocales "+contadorVocales);
		System.out.println("Porcentaje vocales "+((double)contadorVocales/contadorTotalCaracteres*100)+"%");
		System.out.println("Cadena total "+cadenaTotal);
		
		input.close();

	}

}
