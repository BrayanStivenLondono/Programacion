package ejercicios02;

import java.util.Scanner;

public class Mas02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame una palabra");
		String cadena1 = input.nextLine();
		
		System.out.println("Dame otra palabra");
		String cadena2 = input.nextLine();
		
		System.out.println("Iguales ? " + cadena1.equals(cadena2));
		
		
		
		
		input.close();
		
		
	}

}
