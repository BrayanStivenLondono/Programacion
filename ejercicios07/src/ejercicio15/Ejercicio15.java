package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el numero de filas");
		int filas = input.nextInt();
		System.out.println("Introduce el numero de columnas");
		int columnas = input.nextInt();
		
		int [][] matriz = new int [filas][columnas];
		
		//relleno con aleatoria
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz [i][j] = (int)(Math.random()*100)-50;
			}
		}
		//la muestro
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println(matriz[i][j]+" ");
			}
			System.out.println();
		}
		//lo llamo
		System.out.println("Ordenada");
		Ejercicio15.ordenar(matriz);
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println(matriz[i][j]+" ");
			}
		}
		input.close();
	}
	static void ordenar (int [][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				for (int k=0; k<matriz.length; k++) {
					for (int l=0; l<matriz[k].length; l++) {
						if (matriz[i][j]<matriz[k][l]) {
							
							int aux      = matriz[i][j];
							matriz[i][j] = matriz[k][l];
							matriz[k][l] = aux;
						}
					}
				}
			}
		}
	}
}
