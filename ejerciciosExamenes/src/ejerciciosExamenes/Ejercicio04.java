package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		// Crear un programa que muestre un men� y pida seleccionar una opci�n con un n�mero entero. El men� tendr� 3 opciones:
		// 1 � Comprobar n�mero
		// 2 � Comprobar par�ntesis y corchetes
		// 3 - Salir
		// Opci�n 1: La opci�n 1 pide un n�mero entero. Si el n�mero introducido es
		// negativo, lo indica y no hace nada m�s. Si es positivo el programa indica si es m�ltiplo de 5 o no.
		
		// Opci�n 2: La opci�n 2 pide una cadena. Si he introducido m�s de un car�cter lo
		// indica por mensaje y no hace nada m�s. Si he introducido un solo car�cter, indica si es un
		// par�ntesis ( ) o corchetes [ ], en caso contrario, indicar� que no se trata de los caracteres
		// solicitados.
		
		System.out.println("1- Comprobar numero");
		System.out.println("2- Comprobar par�ntesis y corchetes");
		System.out.println("3- Salir");
		
		int opcion = input.nextInt();
		
		if (opcion>= 1 && opcion<=2) {
			switch (opcion) {
			
			case 1:
				System.out.println("Introduce un numero entero");
				int entero = input.nextInt();
				
				if (entero<0) {
					System.out.println("El numero es negativo");
					
				} else if (entero%5==0) {
					System.out.println("Es multiplo de 5");
				} else {
					System.out.println("No es multiplo de 5");
				}
				break;
		        
			case 2: 
		        input.nextLine(); // buffer
		        System.out.println("Introduce una cadena");
		        String cadena = input.nextLine();
		        
		        if (cadena.length()!=1) {
		        	System.out.println("Has introducido mas de un caracter");
		        } else {
		        	int caracterAscii = (int) cadena.charAt(0);
		        	if (caracterAscii==40 || caracterAscii==41 || caracterAscii==91 || caracterAscii==93) { // pido caracter ASCII
		        		System.out.println("El caracter introducidos es delimitador");
		        	} else {
		        		System.out.println("No pertenece a los caracteres solicitados");
		        	}
		        }
		        break;
		
			}
		} else {
			System.out.println("Has elegido salir, programa terminado");
		}

		input.close();
	}

}
