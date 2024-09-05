package parcialPrueba1;

import java.util.Scanner;

public class Metodos {
	static Scanner input = new Scanner (System.in);

	public static double[] rellenarVector() {
		double[] vector = new double [5];
		for (int i=0; i<vector.length; i++) {
			System.out.println("Introduce el precio "+(i+1)+":");
			vector[i] = input.nextDouble();
		}
		input.close();
		return vector;
	}
	
	public static void visualizarViajeCaro(double[] vector) {
		double mayor = vector [0];
		for (int i=0; i<vector.length; i++) {
			if (vector[i]>mayor) {
				mayor = vector[i];
			}
		}
		System.out.println("El viaje más caros es: "+mayor);	
	}
	public static void visualizarViajeBarato(double[] vector) {
		double menor = vector [0];
		for (int i=0; i<vector.length; i++) {
			if (vector[i]<menor) {
				menor = vector[i];
			}
		}
		System.out.println("El viaje más barato es: "+menor);
	}
	public static void ordenarViajes(double[] vector) {
		System.out.println("Sin ordenar");
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
			
		for (int i=0; i<vector.length-1; i++) {
			for (int j=i+1; j<vector.length; j++) {
				if (vector[j]<vector[i]) {
					double aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}			
		}
		System.out.println("Ordenada");
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
	}
}
