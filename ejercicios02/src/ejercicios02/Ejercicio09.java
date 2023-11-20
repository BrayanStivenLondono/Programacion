package ejercicios02;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
	    int numero = input.nextInt();
	    // num 123
	    // 3
	    // 23
	    // 123
		System.out.println(numero&10);
		System.out.println(numero%100);		
		System.out.println(numero%1000);
		System.out.println(numero%10000);
		System.out.println(numero);
		
		// Otro modo (USAR ESTE)
        
		// System.out.println(cadena1.substring (0,1));
		// System.out.println(cadena1.substring (0,2));
		// System.out.println(cadena1.substring (0,3));
		// System.out.println(cadena1.substring (0,4));
		// System.out.println(cadena1);
		// num 123
		// 1
		// 12
		// 123
		
		input.close();
	}

}
