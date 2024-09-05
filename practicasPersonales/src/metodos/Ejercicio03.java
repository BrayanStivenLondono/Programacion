package metodos;

import java.util.Scanner;

public class Ejercicio03 {

	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String [][] matriz = new String [2][5];
	
		Ejercicio03.pedir(matriz);
		Ejercicio03.mostrar(matriz);
		Ejercicio03.mayorPuntos(matriz);
	
		input.close();
	}
	static String [][] pedir (String [][] matriz) {
		for (int i=0; i<5; i++) {
			System.out.println("Introduce los jugadores");
			matriz[0][i] = input.nextLine();//guarda jugadores en la posicion 0
			System.out.println("Introduce sus puntuaciones");
			matriz[1][i] = input.nextLine();//guarda su puntuacion en la posicion 1
		}
		return matriz;
		
	}
	static void mostrar (String [][] matriz) {
		for (int i=0; i<5; i++) {//5
			System.out.println("Jugador: "+matriz[0][i]+" Puntuacion: "+matriz[1][i]);
		}
	}
	static void mayorPuntos (String [][] matriz) {
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
		System.out.println("\nLa mayor puntacion es "+mayor);
	}

}
