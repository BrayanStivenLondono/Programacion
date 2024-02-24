package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Contador de la cadena
		
		int totalMayus =0;
		int totalMinus =0;
		int totalSignos =0;
		int totalNumero =0;
		int totalCadena =0;
		int longitud =0;
		
		String cadena = "";
		do {
			System.out.println("Introduce una cadena");
			cadena = input.nextLine();
			totalCadena++; //contador (IMP)
			
			longitud += cadena.length();
			
			for (int i=0; i<cadena.length(); i++) {
				if (cadena.charAt(i)>='a' && cadena.charAt(i)<='z') {
					totalMinus++;
				}
				if (cadena.charAt(i)>='A' && cadena.charAt(i)<='Z') {
					totalMayus++;
				}
				if (cadena.charAt(i)>='0' && cadena.charAt(i)<='9') {
					totalNumero++;
				}
				if (cadena.charAt(i)=='[' || cadena.charAt(i)==']' || cadena.charAt(i)=='(' || cadena.charAt(i)==')') {
					totalSignos++;
				}
			}
			
		} while (!cadena.equals("fin"));
		
		System.out.println("Total cadenas "+(totalCadena-1));
		System.out.println("Longitud total de cadenas: "+(longitud-3));
		System.out.println("Letras mayusculas "+totalMayus);
		System.out.println("Letras minusculas "+totalMinus);
		System.out.println("Total letras "+(totalMayus+totalMinus));
		System.out.println("Total numeros "+totalNumero);
		System.out.println("Total signos "+totalSignos);
		
		input.close();

	}

}
