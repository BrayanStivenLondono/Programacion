package mas;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// El ej 12, sera como empieze el examen
		// CANTIDAD DE VOCALES EN UNA CADENA Y LO PASA A MINUSCULA
		// i++ va de uno en uno
		// i=i+2 > aumenta de 2 en 2
		// i=i+3 > aumenta de 3 en 3
		// i--   > disminuye  1 en 1
		// i-=2  > disminuye  2 en 2 (i=i-2)
				
		// contador de vocales de una cadena
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		int consonante=0;

		for (int i=0; i<cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			
			if (caracter=='a') {
				contadorA++;
			} else if (caracter=='e') {
				contadorE++;
			} else if (caracter=='i') {
				contadorI++;
			} else if (caracter=='o') {
				contadorO++;
			} else if (caracter=='u') {
				contadorU++;
			}
			if (caracter!='a' && caracter!='e' && caracter!='i' && caracter!='o' && caracter!='u') {
				consonante++;
			}
		
		}
		System.out.println("Cantidad A "+ contadorA);
		System.out.println("Cantidad E "+ contadorE);
		System.out.println("Cantidad I "+ contadorI);
		System.out.println("Cantidad O "+ contadorO);
		System.out.println("Cantidad U "+ contadorU);
		System.out.println("Cantidad consonantes "+consonante);
		System.out.println("El total de los caracteres es "+(contadorA+contadorE+contadorI+contadorO+contadorU+consonante));

		input.close();
	}

}
