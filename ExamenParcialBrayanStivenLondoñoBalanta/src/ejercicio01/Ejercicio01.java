package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double[] marcas = Metodos01.rellenarMarcas();
		
		int opcion =0;
		do {
			System.out.println("1 – Mejor marca");
			System.out.println("2 – Ordenar marcas de menor a mayor");
			System.out.println("3 – Media de marcas triatlón");
			System.out.println("4 - Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				Metodos01.mejorMarca(marcas);
			break;
			case 2:
				Metodos01.ordenarMarca(marcas);
			break;
			case 3:
				Metodos01.mediaMarca(marcas);
			break;
			case 4:
				System.out.println("Salir");
			break;
			default:
				System.out.println("Opcion incorrecta");
			}
		} while (opcion!=4);
		System.out.println("Fin del programa, Adios");
		input.close();
	}
	
}
