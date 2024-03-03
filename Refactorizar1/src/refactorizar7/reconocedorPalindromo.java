package refactorizar7; //cambio el nombre del paquete a refactorizar7

import java.util.Scanner;

//cambio el nombre de la clase a reconocedorPalindromo mas descriptivo

public class reconocedorPalindromo {

	public static void main(String[] args) {
		long numeroAReconocerPalindromo = introduceNumeroAReconocerLong();
		
		//le agrego a palindromo es para que sea mas legible segun el tipo de dato primitivo
		
		long numeroInvertido = invetirNumeroLong(numeroAReconocerPalindromo);
		//elimino el bucle for que no lo necesito
		compararSiPalindromo(numeroAReconocerPalindromo, numeroInvertido);
	
	}

	private static long invetirNumeroLong(long numeroAInvertir) {
		long numeroTemporal = numeroAInvertir;
		long numeroInvertido = 0;
		//elimino las variables inncesarias
		while (numeroTemporal > 0) {
			numeroInvertido = ((numeroInvertido * 10) + (numeroTemporal % 10));
			numeroTemporal /= 10;
		}
		return numeroInvertido;
	}

	private static long introduceNumeroAReconocerLong() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		//cambio el nombre de la viarible a numeroAReconocerPalindromo que introduce el usuario
		long numeroAReconocerPalindromo = input.nextLong();
		
		input.close();
		return numeroAReconocerPalindromo;
	}

	private static void compararSiPalindromo(long numeroAReconocerPalindromo, long numeroInvertido) {
		System.out.print("El número " + numeroAReconocerPalindromo);
		if (numeroAReconocerPalindromo==numeroInvertido) {
			System.out.print("es un palíndromo.");
		} else {
			System.out.print(" no es un palíndromo.");
		}
	}
}