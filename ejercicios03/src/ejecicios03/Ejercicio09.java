package ejecicios03;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		int numero = input.nextInt();
		
		System.out.println("Dame otro numero");
		int numero2 = input.nextInt();
		
		if (numero>numero2) {
			System.out.println("es mayor");
		
         } else if (numero==numero2) {
        	 System.out.println("son iguales");
        
	     }else {
	 		System.out.println(numero2 + " es mayor");

	     }
	
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
