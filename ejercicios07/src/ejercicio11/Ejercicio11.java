package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [][] matriz = new int [3][3]; //tamaño matriz
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println("Dame un numero ["+i+"]"+"["+j+"]");
				matriz [i][j] = input.nextInt();
			}
		}
		
		Ejercicio11.mostrarEstadisticas(matriz);
		
		input.close();
	}
	private static void mostrarEstadisticas (int [][] matriz) {
		int mayor = matriz[0][0];
		int menor = matriz[0][0];
		int suma = 0;
<<<<<<< HEAD
		int producto = 1;
=======
		int producto =1;
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j]<menor) {
					menor = matriz[i][j]; 
				}
				if (matriz[i][j]>mayor) {
					mayor = matriz[i][j];
				}
<<<<<<< HEAD
				
=======
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
				suma += matriz[i][j];
				producto *= matriz[i][j];
				
			}
		}
		System.out.println("El mayor es "+mayor);
		System.out.println("El menor es "+menor);
		System.out.println("La suma es "+suma);
		System.out.println("El producto es "+producto);
		System.out.println("La media es "+(double)suma/(matriz.length*matriz[0].length));
	
	}

}
