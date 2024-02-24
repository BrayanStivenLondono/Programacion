package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String [][] matriz = new String [2][5];
		
 		
		/* Crear una aplicación que me pida el nombre de un alumno y su edad (5 alumnos). Se 
		 * deben almacenar en una matriz de String de 2x5. Posteriormente me mostrará los datos
		 * de cada alumno y su edad. */
		
		Ejercicio14.pedirDatos(matriz);
		Ejercicio14.mostrarDatos(matriz);
		Ejercicio14.estudianteMayor(matriz);
		
		input.close();
	}
	static void pedirDatos (String [][] matriz) {
		for (int i=0; i<5; i++) {
			System.out.println("Introduce el nombre "+(i+1));
			matriz [0][i] = input.nextLine();
			System.out.println("Introduce su edad "+(i+1));
			matriz [1][i] = input.nextLine();
		}
	
	}
	static void mostrarDatos (String [][] matriz) {
		for (int i=0; i<5; i++) {
			System.out.println("El/la estudiante "+matriz[0][i]+" "
					+ "tiene "+matriz[1][i]+" años");
		}
	}
	static void estudianteMayor (String [][] matriz) {
		int [] vector = new int [5];
		int mayor = vector[0];
		for (int i=0; i<5; i++) {
			vector[i] = Integer.parseInt(matriz[1][i]);//se cambio de tipo String a int para sacar el mayor
		}
		for (int i=0; i<5; i++) {
			if (vector[i]>mayor) {
				mayor = vector[i];
			}
		}
		System.out.println("La mayor edad la tiene "+mayor);

	}

}
