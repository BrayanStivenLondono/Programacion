package ejecicios03;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame un numero entero");
		int numero1 = input.nextInt();
		
		System.out.println("Dame otro numero entero");
		int numero2 = input.nextInt();
		
		System.out.println("Dame un numero entero");
        int numero3 = input.nextInt();
 
        if (numero1>numero2 && numero1>numero3) {
            
    		System.out.println(numero1 + " es mayor");
    		System.out.println(numero3 + " es mayor");
    	} 
	    else if(numero2>numero3){
    		System.out.println(numero2 + " es mayor");
    	} 
	    else {
	    	System.out.println(numero3 + " es mayor");
	    }

		input.close();

	}

}
