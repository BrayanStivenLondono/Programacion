package practica3;

import java.util.Scanner;

public class Ejercicio04 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		int[] habitantes = new int[5];

		Ejercicio04.leerHabitantes(habitantes);
		Ejercicio04.mediaHabitantes(habitantes);
		Ejercicio04.maximoHabitantes(habitantes);
		Ejercicio04.minimoHabitantes(habitantes);
		input.close();

	}

	public static void leerHabitantes(int[] habitantes) {
		for (int i = 0; i <habitantes.length; i++) {
			System.out.println("Introduce un número de habitantes de un pueblo ("+(i+1)+" de 10)");
			habitantes[i] = input.nextInt();
		}
	}

	public static void mediaHabitantes(int[] habitantes) {
		double media = 0;
		int suma = 0;
		for (int i=0; i<habitantes.length; i++) {
			suma = suma+habitantes[i];
			media = suma/habitantes.length;
		}
		System.out.println("La suma de habitantes es: "+suma);
		System.out.println("La media de habitantes es: "+media);
	}

	public static void maximoHabitantes(int[] habitantes) {
		int maximo = habitantes[0];
		for (int i=0; i<habitantes.length; i++) {
			if (habitantes[i]>maximo) {
				maximo = habitantes[i];
			}
		}
		System.out.println("El máximo de habitantes es: " + maximo);
	}

	public static void minimoHabitantes(int[] habitantes) {
		int minimo = habitantes[0];
		for (int i=0; i<habitantes.length; i++) {
			if (habitantes[i]<minimo) {
				minimo = habitantes[i];
			}
		}
		System.out.println("El mínimo de habitantes es: " + minimo);

	}

}
