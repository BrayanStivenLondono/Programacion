package ejercicios04;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("Dame un float");
	    float numero1 = input.nextFloat();
	    System.out.println("Dame otro float");
	    float numero2 = input.nextFloat();
	    // limpiar buffer // primero numero y luego caracter// asi que se limpia
	    
	    input.nextLine(); // BUFFER
	    
	    System.out.println("Introduce un caracter (+,-,*,/,%)");
	    char operador = input.nextLine () .charAt(0);

        switch (operador) { 
        
        case '+':
        	System.out.println(numero1 + numero2);
            break;
        case '-':
        	System.out.println(numero1 - numero2);
            break;
        case '*':
        	System.out.println(numero1 * numero2);
            break;
        case '/':
        	System.out.println(numero1 / numero2);
            break;
        case '%':
        	System.out.println(numero1 % numero2);
            break;
         default:
        	 System.out.println("La operación no es posible");
        }

		
		input.close();
	}

}
