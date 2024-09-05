package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		double numero1 = input.nextDouble();
		System.out.println("Introduce otro numero");
		double numero2 = input.nextDouble();

		System.out.println("Menu de opciones");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicacion");
		System.out.println("4 - Division");
		System.out.println("Elige una opcion 1-4");

		int opcion = input.nextInt();
		
		switch (opcion) {
			
		case 1:
			EjercicioPrevio13.sumaNumeros(numero1, numero2);
		break;
		
		case 2:
			EjercicioPrevio13.restaNumeros(numero1, numero2);
		break;
		
		case 3:
			EjercicioPrevio13.multiplicaNumeros(numero1, numero2);
		break;
			
		case 4:
			EjercicioPrevio13.divideNumeros(numero1, numero2);
		break;
			
		default:
			System.out.println("Opcion incorrecta");
		break;
		}

		input.close();
	}
	// metodo suma
	// recibe dos doubles 
	// no devulve nada
	static void sumaNumeros (double numero1, double numero2) { //lo que dentra
		System.out.println("La suma es "+(numero1+numero2));

	}
	static void restaNumeros (double numero1, double numero2) {
		System.out.println("La resta es "+(numero1-numero2));

	}
	static void multiplicaNumeros (double numero1, double numero2) {
		System.out.println("La multiplicacion es "+(numero1*numero2));
	}
	static void divideNumeros (double numero1, double numero2) {
		System.out.println("La division es "+(numero1/numero2));

	}

}
