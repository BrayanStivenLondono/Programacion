package ejercicio01;

import java.util.Scanner;

public class Metodos01 {
	public static double[] rellenarMarcas() {	
		Scanner input = new Scanner (System.in);
		
		double[] marca = new double [5];
		for (int i=0; i<marca.length; i++) {
			System.out.println("Introduce marca "+(i+1));
			marca[i] = input.nextDouble();
		}
		return marca;
		
	}
	public static void mejorMarca (double[] marcas) {
		double menor = marcas[0];
		for (int i=0; i<marcas.length; i++) {
			if (marcas[i]<menor) {
				menor = marcas[i];
			}
		}
		System.out.println("La mejor marca es "+menor);
	}
	public static void ordenarMarca (double[] marcas) {
		System.out.println();
		System.out.println("Marcas sin ordenas");
		for (int i=0; i<marcas.length; i++) {
			System.out.print(marcas[i]+" ");
		}
		for (int i=0; i<marcas.length-1; i++) {
			for (int j=i+1; j<marcas.length; j++) {
				if (marcas[j]<marcas[i]) {
					double aux = marcas[i];
					marcas[i] = marcas[j];
					marcas[j] = aux;
				}
			}
		}
		System.out.println();
		System.out.println("Marcas ordenas");
		for (int i=0; i<marcas.length; i++) {
			System.out.print(marcas[i]+" ");
		}
	} 
	public static void mediaMarca (double[] marcas) {
		double media = 0;
		double suma = 0;
		for (int i=0; i<marcas.length; i++) {
			suma += marcas[i];
			media = suma/marcas.length;
		}
		System.out.println("La media de las marcas de triatlon es "+media+"%");
	}
}
