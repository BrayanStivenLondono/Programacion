package ejercicios02;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Programa que lea un número entero de 5 cifras y 
		// muestre sus cifras  desde el principio como en el ejemplo.
				
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero de 5 cifras");
	    int numero = input.nextInt();
		System.out.println(numero/10000);
		System.out.println(numero/1000);
		System.out.println(numero/100);		
		System.out.println(numero/10);
		System.out.println(numero);

		// si leo un numero y luego un cadena > limpiar BUFFER
		input.nextLine(); // BUFFER limpio
		
		String cadena = input.nextLine();
		System.out.println("dame otra vez un numero de 5 cifras");
		
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(0) + "" + cadena.charAt(1)+ "" + cadena.charAt (2));
		System.out.println(cadena.charAt(0) + "" + cadena.charAt(1)+ "" + cadena.charAt (2));
		System.out.println(cadena.charAt(0) + "" + cadena.charAt(1)+ "" + cadena.charAt (2) + "" + cadena.charAt(3));
		System.out.println(cadena);
		
		// Otro modo (USAR ESTE)
	                 
		// System.out.println(cadena1.substring (0,1));
		// System.out.println(cadena1.substring (0,2));
		// System.out.println(cadena1.substring (0,3));
		// System.out.println(cadena1.substring (0,4));
		// System.out.println(cadena1);




		
		
		
		
		input.close();

	}

}
