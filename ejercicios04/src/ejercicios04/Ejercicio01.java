package ejercicios04;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("dame un letra");
		
		char letra = input.nextLine() .charAt(0);
		
		// si se quita break pasa por todos
		switch( letra) {
		case 'a':
		    System.out.println("la vacal es a");
		break;
		
		case 'e':
		    System.out.println("la vacal es e");
		break;
		
		case 'i':
		    System.out.println("la vacal es i");
		break;
		
		case 'o':
	        System.out.println("la vacal es o");
	    break;
	    
		case 'u':
            System.out.println("la vacal es u");
        default:
            System.out.println("no es vocal");
   
        
    

		
		}
		
		
		
		
		
		
		
		input.close();

	}

 } 
