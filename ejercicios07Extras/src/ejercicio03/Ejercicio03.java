package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame el tamaño del vector");
		int tam = input.nextInt();
		int[] vectorNum = new int[tam];

		Metodo03.rellenarNumPrimosAleatorioArray(vectorNum, 1, 100);
		Metodo03.mostrarArray(vectorNum);

		// Saco el primo mayor
		int primoMayor = Metodo03.mayor(vectorNum);
		System.out.println("El primo más grande es el "+primoMayor);
		
		input.close();

	}

}
