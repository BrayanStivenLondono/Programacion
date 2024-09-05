package ejercicios04;

import java.util.Scanner;

public class Ejercicio1b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame una letra");
		char letra = input.nextLine().charAt(0);
		//ESTE PROGRAMA NO ES CORRECTO -> break // esto pasa si no esta BREAK
		switch (letra) {
		case 'a':
			System.out.println("Es la vocal a");
		case 'e':
			System.out.println("Es la vocal e");
		case 'i':
			System.out.println("Es la vocal i");
		case 'o':
			System.out.println("Es la vocal o");
		case 'u':
			System.out.println("Es la vocal u");
		default:
			System.out.println("no es una vocal");
		}

		input.close();

	}

}
