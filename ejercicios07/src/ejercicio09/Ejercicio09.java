package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] entero = {0,10,20,30,40,50,60,70,80,90};
		
		System.out.println("Introduce un numero");
		int numero = input.nextInt();

		Ejercicio09.insertarOrdenado(entero, numero);
		
		for (int i=0; i<entero.length; i++) {
			System.out.print(entero[i]+" ");
		}
		
		input.close();
	}
	private static void insertarOrdenado (int [] enteros, int num) {
		for (int i=0; i<enteros.length; i++) {
			if (enteros[i] > num) {
				enteros[i] = num;
				return;//evita que todos sean el numero ingresado
			}
		}
		enteros[enteros.length-1] = num;//evita que el numero ingresado se coma al siguiente
	}
}