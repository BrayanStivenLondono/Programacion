package ejercicios05BuclesExtra;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) { // Menu // NO SE REPITE
		System.out.println("Menu de opciones");
		System.out.println("1. Convertir a binario");
		System.out.println("2. Convertir a Hexadecimal");
		System.out.println("3. Convertir a Octal");
		System.out.println("4. Salir");
		System.out.println("Introduce una opcion 1-4");
		
		Scanner input = new Scanner (System.in);
		int opcion = input.nextInt();
		
		System.out.println("Introduce un numero entero en sistema decimal"); // saldra en cada caso
		int numero = input.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Binario");
			System.out.println(Integer.toBinaryString(numero));
			break;
		case 2:
			System.out.println("Hexadecimal");
			System.out.println(Integer.toHexString(numero));
			break;
		case 3:
			System.out.println("Octal");
			System.out.println(Integer.toOctalString(numero));
			break;
		case 4:
			System.out.println("Salir");
			break;
		default:
			System.out.println("Introduce una opcion 1-4");
		}


		input.close();


	}

}
