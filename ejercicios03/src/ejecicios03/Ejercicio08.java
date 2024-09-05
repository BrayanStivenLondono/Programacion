package ejecicios03;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		System.out.println("Dame el dividendo (entero)");
		int dividendo = input.nextInt();
		
		System.out.println("Dame el divisor (entero)");
		int divisor = input.nextInt();
		
		
		// solo se hace la operacion si el divisor el distinto a 0
		
		if (divisor!=0) {
			System.out.println(dividendo/divisor);

		}else {
			System.out.println("no se puede hacer la operacion");

		}
	
		input.close();

	}

}
