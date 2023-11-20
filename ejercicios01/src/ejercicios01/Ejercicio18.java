package ejercicios01;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// declarar objeto Scanner
		//scanner nombreObjeto = new scanner (teclado)
		//system.out > salida por pantalla
		//system.in > entrada pro pantalla (teclado)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" introduce un byte ");
		byte numByte = input.nextByte();
		System.out.println(" el byte introducido es " + numByte);
		
		System.out.println(" introduce un short ");
		short numShort = input.nextShort();
		System.out.println(" el short introducido es " + numShort);

		System.out.println(" introduce un int ");
		int numInt = input.nextInt();
		System.out.println(" el int introducido es " + numInt);
		
		System.out.println(" introduce un long ");
		long numLong = input.nextLong();
		System.out.println(" el long introducido es " + numLong);
		
		System.out.println(" introduce un float ");
		float numFloat = input.nextFloat();
		System.out.println(" el float introducido es " + numFloat);
		
		System.out.println(" introduce un double ");
		double numDouble = input.nextDouble();
		System.out.println(" el double introducido es " + numDouble);
		
		// cuando tengo que leeer un caracter o una cadena despues de un numero
		// es necesario
		//limpiar el buffer
		input.nextLine();
		
		//cuando es un caracter necesito leer la lista entera
		// input.nextLine()
		//y despues quedarme con la primera letra
		//.charAt(0)
		
		System.out.println(" introduce un char ");
		char caracter = input.nextLine().charAt(0);
		System.out.println(" el char introducido es " + caracter);
		
		
		
		//cierre del scanner
		input.close();
		
		
		
		
		

	}

}
