package metodos;

import java.util.Scanner;

public class Ejercicio01 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {	
		
		double [] vectorPesos = new double [5];
		
		Ejercicio01.leerVectorPesos(vectorPesos);
		Ejercicio01.mostrarVectorPesos(vectorPesos);
		Ejercicio01.mediaVectorPesos(vectorPesos);
		Ejercicio01.maximoVectorPesos(vectorPesos);
		Ejercicio01.minimoVectorPesos(vectorPesos);
		
		System.out.println("Introduce un numero");
		double numero = input.nextDouble();
		
		Ejercicio01.cantidadPesosMayores(vectorPesos, numero);
		Ejercicio01.cantidadPesosMenores(vectorPesos, numero);

		input.close();
	}
	static void leerVectorPesos (double [] peso) {
		for (int i=0; i<peso.length; i++) {
			System.out.println("Introduce el peso "+(i+1));
			peso[i] = input.nextDouble();
		}
		
	}
	static void mostrarVectorPesos (double [] peso) {
		for (int i=0; i<peso.length; i++) {
			System.out.print("["+peso[i]+"]"+" ");
		}
		System.out.println();
	}
	static void mediaVectorPesos (double [] peso) {
		double media =0;
		double suma =0;
		for (int i=0; i<peso.length; i++) {
			suma += peso[i];
			media = (double)suma/peso.length;
		}
		System.out.println("\nLa media es "+media);
		
	}
	static void maximoVectorPesos (double [] peso) {
		double maximo =0;
		for (int i=0; i<peso.length; i++) {
			if (peso[i]>maximo) {
				maximo = peso[i];
			}
		}
		System.out.println("El maximo es "+maximo);
	}
	static void minimoVectorPesos (double [] peso) {
		double minimo = peso[0];
		for (int i=0; i<peso.length; i++) {
			if (peso[i] < minimo) {
				minimo = peso[i];
			}
		}
		System.out.println("El minimo es "+minimo);
	}
	static void cantidadPesosMayores (double [] peso, double numero) {
		double contadorMayor =0;
		for (int i=0; i<peso.length; i++) {
			if (peso[i]>numero) {
				contadorMayor++;
			}
		}
		System.out.println("El numero de pesos mayores a "+(int)numero+" son "+(int)contadorMayor);
		
	}
	static void cantidadPesosMenores (double [] peso, double numero) {
		double contadorMenor =0;
		for (int i=0; i<peso.length; i++) {
			if (peso[i] < numero) {
				contadorMenor++;
			}
		}
		System.out.println("El numero de pesos menores a "+(int)numero+" son "+(int)contadorMenor);
	}

}
