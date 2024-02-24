package ejecicios03;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int numero =0;
		do {
			
		System.out.println("Dame un numero entero");
		numero = input.nextInt();
		
		System.out.println((char)numero);

		} while (numero>0);
		
		input.close();
	}

}


