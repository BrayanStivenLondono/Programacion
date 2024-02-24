package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio03 {

	public static void main(String[] args) {
		// Math.pow.....
		// Clase.metodo
		EjercicioPrevio03.suma();
		EjercicioPrevio03.resta();

	}

	//no recibe nada > suma ()
	//en el cajon del metodo no entran valores
	static void suma () {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int numero1 =  input.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = input.nextInt();
		
		System.out.println("La suma es "+(numero1+numero2));
		
		input.close();
	}
	static void resta () {
		int numero1 = 8;
		int numero2 = 7;
		System.out.println("La suma es "+(numero1-numero2));
		
	}

}
