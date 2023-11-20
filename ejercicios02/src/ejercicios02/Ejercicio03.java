package ejercicios02;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Programa que pida la fecha de nacimient
		Scanner input = new Scanner (System.in);	
		
		System.out.println("introduce el dia (numero)");
		int dia = input.nextInt();
		
		// cuando leo un entero, y seguido tengo que leer un caracter
		// limpiar el BUFFER
		
		input.nextLine(); //buffer

		System.out.println("introduce un mes (texto)");
		String mes = input.nextLine();
		
		System.out.println("introduce el ano (numero)");
		int ano = input.nextInt();
		
		System.out.println(dia + "/" + mes + "/" + ano);
		
		
		input.close();

		
		
	

	}

}
