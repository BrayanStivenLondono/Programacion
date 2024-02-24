package ejercicio02;

import java.util.Scanner;

public class Metodos02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String[] deportistas = Metodos02.rellenarDeportistas();
		
		int opcion =0;
		do {
			System.out.println();
			System.out.println("1 – Visualizar deportistas y deportes");
			System.out.println("2 – Visualizar deportistas");
			System.out.println("3 – Frecuencia países");
			System.out.println("4 - Salir");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				Metodos02.mostrarDeportistasDeportes(deportistas);
			break;
			case 2:
				Metodos02.mostrarDeportistas(deportistas);
			break;
			case 3:
				Metodos02.frecuenciaPaises(deportistas);
			break;
			case 4:
				System.out.println("Salir");
			break;
			default:
				System.out.println("Opcion incorrecta");
			break;	
			}
		} while (opcion!=4);
		System.out.println("Fin del programa, adios");
		
		input.close();
	}	
	public static String[] rellenarDeportistas() {
		Scanner input = new Scanner (System.in);
		String[] deportistas = new String [5];
		for (int i=0; i<deportistas.length; i++) {
			System.out.println("Introduce el nombre del deportista, deporte "+(i+1)+" : ");
			deportistas[i] = input.nextLine();
		}
		input.close();
		return deportistas;
	}
	public static void mostrarDeportistasDeportes (String[] deportistas) {
		for (int i=0; i<deportistas.length; i++) {
			System.out.print("Deportistas y deporte "+deportistas[i]);
		}
		
	} 
	public static void mostrarDeportistas (String[] deportistas) {
		for (int i=0; i<deportistas.length; i++) {
			for (int j=0; j<deportistas[i].length(); j++) {
				
			}
		} 
		}
	public static void frecuenciaPaises (String[] deportistas) {
		
	}

}
