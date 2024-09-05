package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[10][10];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random()*50);
			}
		}

		System.out.println("Introduce el numero a buscar");
		int numero = input.nextInt();
		Ejercicio13.buscarNumero(matriz, numero);
		
		input.close();;
	}

	private static void buscarNumero(int[][] matriz, int numero) {
		int contadorApariciones = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
<<<<<<< HEAD
=======
				//si la celda contiene el numero
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
				if (matriz[i][j]==numero) {
					contadorApariciones++;
					System.out.println("["+i+"]["+j+"]");
				}
			}
		}
		System.out.println("El numero "+numero+" se ha encontrado "+contadorApariciones+" veces");

	}

}
