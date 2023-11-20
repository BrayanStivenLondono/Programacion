package mas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// se usa principalmente cuando sabemos cuantas veces se de repetir una variable
		
		// for > necesita principio y final
		// for (variable que se usa en el bucle con su valor inicial;final;incremento)
		// la variable que se usa en el bucle, se comienza siempre por i
		//      inic  hasta  como?
		Scanner input = new Scanner (System.in);
		
		for (int i=0; i<=10; i++) {
			System.out.println();
			//0
			//1
		}
		for (int i=0; i<=10; i++) {
			System.out.print(i); //print
			//1 2
		}
		//-----------------------------------------------------------------
		// Leer una cadena con FOR
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine() .toLowerCase();
		
		int contadorA=0; // dice cuantos hay
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		for (int i=0; i<cadena.length();i++) {
			
			//se encarga de coger cada caracter de la cadena

			char caracter = cadena.charAt(i);
			
			//primera vuelta char caracter=cadena.charAt(0);
			//segunda vuelta char caracter=cadena.charAt(1);
			if (caracter=='a') {
				contadorA++; // incremental
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
		//porcentajes -> cantidad/total
		//al ser contador int no funciona sino lo casteo a double
		
		System.out.println("El ratio es " +(double)contadorA/cadena.length()*100);
		System.out.println("El ratio es " +(double)contadorE/cadena.length()*100);
		System.out.println("El ratio es " +(double)contadorI/cadena.length()*100);
		System.out.println("El ratio es " +(double)contadorO/cadena.length()*100);
		System.out.println("El ratio es " +(double)contadorU/cadena.length()*100);

		

		
		input.close();

	}

}
