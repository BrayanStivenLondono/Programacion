package matriz;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] matriz = new int[2][3];
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.println("Dame la componente ("+i+","+j+")");
				matriz[i][j] = input.nextInt();
			}
		}
		
		visualizarMatriz(matriz);
		visualizarMaximoPar(matriz);
		visualizarMinimoImpar(matriz);
		input.close();
	}

	public static void visualizarMatriz(int[][] matriz) {//mostra matriz
		System.out.println("La matriz es");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("La matriz con coordenadas es ");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print("("+i+","+j+") "+matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void visualizarMaximoPar(int[][] matriz) {
		System.out.println("Maximo par");
		int maximo = matriz[0][0];
		int posicionI = 0;
		int posicionJ = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j]%2==0) {
					if (matriz[i][j] > maximo) {//par mas alto
						maximo = matriz[i][j];
						posicionI = i;
						posicionJ = j;
					}
				}
			}
			System.out.println("Fila "+i+" El maximo par es "+maximo);
			System.out.println("La posicion es ("+posicionI+","+ posicionJ+")");
		}
	}

	public static void visualizarMinimoImpar(int[][] matriz) {
		System.out.println("Minimo impar");
		int minimo = matriz[0][0];
		int posicionI = 0;
		int posicionJ = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j]%2!=0) {//impar pas bajo
					if (matriz[i][j] < minimo) {
						minimo = matriz[i][j];
						posicionI = i;
						posicionJ = j;
					}
				}
			}
			System.out.println("Fila "+i+" El minimo impar es "+minimo);
			System.out.println("La posicion es ("+posicionI+","+posicionJ+")");
		}
	}
}
