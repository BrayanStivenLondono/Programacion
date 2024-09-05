package ejercicios05;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero binario (8 cifras)");
		int binario = input.nextInt();

		int resultado = 0;
		
		for (int i=0; i<8; i++) {
			
			int bit = binario%10;
			binario /= 10;

			resultado = resultado + (int)(Math.pow(2, i)*bit);
		}
	System.out.println("la conversion es: "+resultado);

		input.close();

	}

}
