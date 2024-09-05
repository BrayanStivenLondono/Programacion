package ejercicios05;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Comprobar si un numero introducido por teclado es perfecto. Un número es perfecto si es
		// igual a la suma de todos sus divisores positivos sin incluir el propio número.
		
		int numero =0;
		int perfectos =0;
		int noPerfectos =0;
		
		do {
			System.out.println("Introduce un numero");
			numero = input.nextInt();
			
		    int sumaDivisores=0;
		
		    for (int i=1; i<numero; i++) {
			if (numero%i==0) {
				sumaDivisores += i;
				
				}		
			}
			if (sumaDivisores==numero) {
				perfectos++;
				System.out.println("Es numero perfecto");
			} else {
				noPerfectos++;
				System.out.println("No es numero perfecto");
			}
	} while (numero>0);
		
		System.out.println("La cantidad de numeros perfectos es: "+perfectos);
		System.out.println("La cantidad de numero no-perfectos es: "+(noPerfectos-1));
		
		input.close();
	
	}

}
