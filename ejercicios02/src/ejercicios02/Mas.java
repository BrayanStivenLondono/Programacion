package ejercicios02;

import java.util.Scanner;

public class Mas {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero");
		
		double numero = input.nextDouble();
		
        double raiz = Math.sqrt(numero);
        
        System.out.println("Su raiz cuadrada es " + raiz);		
		
		
	    input.close();

	}

}

