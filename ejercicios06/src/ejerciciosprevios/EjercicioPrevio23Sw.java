package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio23Sw {

	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Metodos");
		System.out.println("1 - Primos");
		System.out.println("2 - Potencia");
		System.out.println("3 - Rectangulo");
		System.out.println("4 - Vocales");
		System.out.println("5 - Salir");
		int opcion = input.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("\nMetodo Primo");
			System.out.println("Introduce un numero");
			int numero = input.nextInt();
			
			boolean miPrimo = EjercicioPrevio23Sw.esPrimo(numero);
			if (miPrimo==true) {
				System.out.println("Primo");
			} else {
				System.out.println("No primo");
			}		
		break;
		case 2:
			System.out.println("\nMetodo Potencia");
			EjercicioPrevio23Sw.potencia();
			
		break;
		case 3:
			System.out.println("\nMetodo rectangulo");
			System.out.println("Introduce el alto");
			int alto = input.nextInt();
			System.out.println("Introduce el ancho");
			int ancho = input.nextInt();
			
			EjercicioPrevio23Sw.cuadrado(ancho, alto);
			
		break;
		case 4:
			input.nextLine();
			System.out.println("Introduce una cadena");
			String cadena = input.nextLine();
			
			int miCadena = EjercicioPrevio23Sw.numeroLetras(cadena);
			System.out.println("\nMetodo vocales");
			System.out.println("La cantidad de vocales es "+miCadena);
		break;
		case 5:
			System.out.println("Fin del programa");
		break;
		default:
			System.out.println("Opcion incorrecta");
		break;
		

		}
		
	}
	static boolean esPrimo (int numero) {
		boolean primo = true;
		for (int i=2; i<numero; i++) {
			if (numero%i==0) {
				primo = false;
			}
		}
		return primo;
	}
	
	static void potencia () {
		System.out.println("Introduce la base");
		double base = input.nextDouble();
		System.out.println("Introduce el exponente");
		double exponente = input.nextDouble();
		
		System.out.println("La potencia es "+(Math.pow(base, exponente)));

	}
	
	static void cuadrado (int ancho, int alto) {
		for (int i=0; i<alto; i++) {
			for (int j=0; j<ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	static int numeroLetras (String cadena) {
		int contadorA =0;
			for (int i=0; i<cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			
			if (caracter=='a') {
				contadorA++;
			}
		}
		return contadorA;
	}

}
