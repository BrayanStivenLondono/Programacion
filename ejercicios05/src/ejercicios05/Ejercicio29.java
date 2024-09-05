package ejercicios05;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String cadena;	
		int contadorVocales =0;
		int contadorTotalCaracteres =0;
		String cadenaTotal ="";
		
		do {
			System.out.println("Introduce una cadena");
			cadena = input.nextLine().toLowerCase();		
			
			contadorTotalCaracteres += cadena.length();
			
			for (int i=0; i<cadena.length(); i++) {
				char letra = cadena.charAt(i);
				if (letra=='a' || letra=='e'|| letra=='i'||letra=='o'||letra=='u') {
					contadorVocales++;
				}
			}	
			cadenaTotal += cadena;
		}while(!cadena.equals("fin"));
		
		System.out.println("Cantidad vocales: "+contadorVocales);
		System.out.println("Porcentaje vocales: "+((double)contadorVocales/contadorTotalCaracteres*100)+"%");
		System.out.println("Cadena total: \n"+cadenaTotal);
		
		input.close();

	}

}
