package ejercicios05;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion = 0;
		
		do {
				System.out.println("1.- opcion1");
				System.out.println("2.- opcion2");
				System.out.println("3.- salir");
				System.out.println("Seleciona la opcion que quieres");
				opcion = input.nextInt();
				
				switch (opcion) {
				case 1 :
					System.out.println("opcion 1");
					break;
				case 2 :
					System.out.println("opcion 2");
					break;
				case 3 : 
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
		} while (opcion!=3);
		System.out.println("Fin del programa");
		
	
		input.close();


	}

}
