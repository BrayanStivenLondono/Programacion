package ejercicio01;

import java.util.Scanner;

public class Metodo01 {
	
	public static void rellenarArray (int [] vector) {
		Scanner input = new Scanner (System.in);
		for (int i=0; i<vector.length; i++) {
			System.out.println("Introduce un numero");
			vector[i] = input.nextInt();
			
		}
		input.close();
	}
	
	public static void mostrarArray (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("Indice "+i+" valor "+vector[i]);//poner siempre el [i]
		}
	}
}
