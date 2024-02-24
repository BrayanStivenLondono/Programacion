package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce numero 1");
		double numero1 = input.nextDouble();
		System.out.println("Introduce numero 2");
		double numero2 = input.nextDouble();
		System.out.println("Introduce numero 3");
		double numero3 = input.nextDouble();
		System.out.println("Introduce numero 4");
		double numero4 = input.nextDouble();

		System.out.println("Menu de opciones");
		System.out.println("1 - Suma de 2 numeros");
		System.out.println("2 - Suma de 3 numeros");
		System.out.println("3 - Suma de 4 numeros");
		System.out.println("Elige un opcion 1-3");

		int opcion = input.nextInt();
		
		switch (opcion) {
			
		case 1:
			EjercicioPrevio14.sumaNumeros(numero1, numero2);
		break;
		
		case 2:
			EjercicioPrevio14.sumaNumeros(numero1, numero2, numero3);
		break;
		
		case 3:
			EjercicioPrevio14.sumaNumeros(numero1, numero2, numero3, numero4);
		break;
		
		default:
			System.out.println("Opcion incorrecta");
		break;
		}

		input.close();
	}
	// sobrecarga o polimorfismo
	// se pueden llamar igual (que hacen lo mismo)
	// tienen que tener distintos parametros de entrada
	static void sumaNumeros (double numero1, double numero2) { //lo que dentra
		System.out.println("La suma de dos numeros es "+(numero1+numero2));
		
	}
	static void sumaNumeros (double numero1, double numero2, double numero3) {
		System.out.println("La suma de tres numeros es "+(numero1+numero2+numero3));
		
	}
	static void sumaNumeros (double numero1, double numero2, double numero3, double numero4) {
		System.out.println("La suma de cuatro numeros es "+(numero1+numero2+numero3+numero4));
		
	}

}
