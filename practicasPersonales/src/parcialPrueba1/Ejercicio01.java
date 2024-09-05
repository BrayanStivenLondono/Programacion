package parcialPrueba1;

import java.util.Scanner;

public class Ejercicio01 {
	
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		double[] precios = Metodos.rellenarVector();
		
		int opcion =0;
		do {
			System.out.println("\nElige");
			System.out.println("1 - Viaje mas caro");
			System.out.println("2 - Viaje mas barato");
			System.out.println("3 - Ordenar");
			System.out.println("4 - Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				Metodos.visualizarViajeCaro(precios);
			break;
			case 2:
				Metodos.visualizarViajeBarato(precios);
			break;
			case 3:
				Metodos.ordenarViajes(precios);
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
	

}
