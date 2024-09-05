package ejeciciosprevios;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPrevio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		int num;
		do {
			System.out.println("\nDame numeros enteros (0 para acabar)");
			System.out.println("Numero ");
			num = input.nextInt();
			if (num!=0) {//para no cantar el 0
				numeros.add(num);
			}
			
		} while (num!=0);
		System.out.println("Has introducido "+numeros.size()+" numeros");
		System.out.println("\nMuestro");
		System.out.println(numeros);
		double suma = 0;
		for (Integer i : numeros) {
			suma += i;
		}
		System.out.println("\nLa suma "+suma);
		System.out.println("La media "+suma/numeros.size());
		
		input.close();
	}

}
