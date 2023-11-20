package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame un numero");
		int numero = input.nextInt();
		
		for (int i=1; i<=10; i++) {		
			System.out.println(numero + "x" + i + "=" + numero*i);
			
		}

		input.close();

	}

}
