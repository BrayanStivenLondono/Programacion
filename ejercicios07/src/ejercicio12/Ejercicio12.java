package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el lado del array");
		int lado = input.nextInt();
		
		int [][] matriz = new int [lado][lado];
		
		Ejercicio12.rellenarMatriz(matriz, input);
		System.out.println("Modificada");
		Ejercicio12.interCambioFilasColumnas(matriz);
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		
		input.close();
	}
	static void rellenarMatriz (int [][] matriz, Scanner input) {
		System.out.println("Pedimos datos matriz");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println("Introduce un numero");
				matriz[i][j] = input.nextInt();
			}
		}//muestradatos
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int [][] interCambioFilasColumnas (int [][] matriz) {
		int [][] matrizModificada = new int [matriz.length][matriz[0].length];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matrizModificada[j][i] = matriz[i][j];
			}
		}
		return matrizModificada;
	}
}
