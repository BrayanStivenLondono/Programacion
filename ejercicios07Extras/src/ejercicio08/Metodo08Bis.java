package ejercicio08;

import java.util.Scanner;

public class Metodo08Bis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dame el tamaņo del vector");
		int tan = input.nextInt();
		int[] num = new int[tan];

		int ultimoDigito;
		do {
			System.out.println("Introduce un numero entre 0 y 9");
			ultimoDigito = input.nextInt();
		} while (!(ultimoDigito >= 0 && ultimoDigito <= 9));

		// rellenamos el array
		Metodo08Bis.rellenarNumAleatorioArray(num, 1, 300);
		// creamos un array que contenga los numeros terminados en el num especificado
		int[] terminadosEn = Metodo08Bis.numTerminadosEn(num, ultimoDigito);
		// mostramos el resultado
		Metodo08Bis.mostrarArrayTerminadosEn(terminadosEn);

		input.close();
	}

	public static void rellenarNumAleatorioArray(int[] vector, int a, int b) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}
	}

	public static void mostrarArrayTerminadosEn(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			// no incluimos las posiciones que tienen un 0
			if (vector[i] != 0) {
				System.out.println("El numero " + vector[i] + " acaba en el numero deseado");
			}
		}
	}

	public static int[] numTerminadosEn(int[] vectorNum, int ultimoNumero) {
		// Array que almacenará los numeros terminados en el numero pedido
		int[] terminadosEn = new int[vectorNum.length];
		int numeroFinal = 0;
		for (int i = 0; i < terminadosEn.length; i++) {
			// obtenemos las unidades usando el resto
			numeroFinal = vectorNum[i] % 10;
			// si el numero obtenido es el buscado, lo añadimos
			if (numeroFinal == ultimoNumero) {
				terminadosEn[i] = vectorNum[i];
			}
		}
		return terminadosEn;
	}

}
