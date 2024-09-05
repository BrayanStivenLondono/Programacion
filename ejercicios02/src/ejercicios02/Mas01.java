package ejercicios02;

import java.util.Scanner;

public class Mas01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame 4 letras");
		String cadena = input.nextLine();
		
	    // muertra las cuatro lletras en fila (hacia abajo)
		System.out.println(cadena.charAt(0)); // 1 letra
		System.out.println(cadena.charAt(1)); // 2
		System.out.println(cadena.charAt(2)); // 3
		System.out.println(cadena.charAt(3)); // 4
		
		// ahora con numero (123)
		// 1
		// 12
		// 123
		
		System.out.println("Dame 5 numeros");
		String cadena2 = input.nextLine();
		
		System.out.println(cadena2.substring(0,1));
		System.out.println(cadena2.substring(0,2));
		System.out.println(cadena2.substring(0,3));
		System.out.println(cadena2.substring(0,4));
		System.out.println(cadena2);

		input.close();

	}

}
