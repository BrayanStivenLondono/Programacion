package ejercicios05;

import java.util.Scanner;

public class Ejercicio01 {
	final static String MENSAJE = "Fin del programa";

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner (System.in);
		// Programa que muestre los números del 1 a un número mayor 
		// introducido por teclado utilizando la instrucción for.
		System.out.println("dame un numero");
        int numero = input.nextInt();
		
		// linea por separado
		System.out.println("Bucle 1");
		for (int i = 1; i<numero; i++) {
			System.out.println(i+"" + "");
		}
		// muestro en la misma linea
		System.out.println("Bucle 2");
		for (int i = 1; i<numero; i++) {
			System.out.print(i+" ");
		}
		System.out.println("MENSAJE");
		
			
		input.close();

	}

}

