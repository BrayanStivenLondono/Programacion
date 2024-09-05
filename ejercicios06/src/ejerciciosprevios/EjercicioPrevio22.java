package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio22 {

	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		//metodo que recibe un numero y devuelve si es o no primo
		System.out.println("Metodo Primo");
		System.out.println("Introduce un numero");
		int numero = input.nextInt();
		
		boolean miPrimo = EjercicioPrevio22.esPrimo(numero);
		if (miPrimo==true) {
			System.out.println("Primo");
		} else {
			System.out.println("No primo");
		}
		
		/*metodo que no reciba cantidad, ni devuelva nada
		 * dentro del metodo calcula la potencia de un numero
		 * elevado a otro
		 */
		System.out.println("\nMetodo Potencia");
		EjercicioPrevio22.potencia();
		
		/*metodo que recibe dos numeros y no devuleve nada 
		 * muestro un cuadrado del ancho y el alto marcado en los parametros
		 */
		System.out.println("\nMetodo rectangulo");
		System.out.println("Introduce el alto");
		int alto = input.nextInt();
		System.out.println("Introduce el ancho");
		int ancho = input.nextInt();
		
		EjercicioPrevio22.cuadrado(ancho, alto);
		// metodo que reciba una cadena y devuelva el numero de letras 'a' que tiene //
		input.nextLine();
		System.out.println("Introduce una cadena");
		String cadena = input.nextLine();
		
		int miCadena = EjercicioPrevio22.numeroLetras(cadena);
		System.out.println("\nMetodo vocales");
		System.out.println("La cantidad de vocales es "+miCadena);
		
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
