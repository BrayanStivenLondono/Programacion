package ejecicios03;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//
		
		Scanner input = new Scanner (System.in);
		System.out.println("Dame una letra");
		char letra1 = input.nextLine().charAt(0);
		
		System.out.println("Dame otras letra");
		char letra2 = input.nextLine().charAt(0);
		
		input.nextLine();
	
		// tambien // if (primeraMinus && segundaMinus)

		if (letra1>='a' && letra2<='z') {
			System.out.println("Las dos minusculas");
			
		} else { 
			System.out.println("no lo son");
		}
		
	
			input.close();
	  }

	  }
		
	


