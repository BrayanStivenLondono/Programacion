package ejecicios03;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
        System.out.println("Dame el numero de mes");
        int mes = input.nextInt();
        
        if (mes<=1 || mes>=12) {
        	System.out.println("no existe ese mes");
      
	     } else { // el mes correcto
	    	 
	    	 if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
	    	     System.out.println("tiene 31");
	    	 } else if (mes==4 || mes==6 || mes==9 || mes==11) { 	
	    	     System.out.println("tiene 30");
	    	 } else {
	    		 // no es ninguno de los anteriores
	    		 // esta entre 1 y 12
	    	     System.out.println("tiene 28");
	    	     
	    	 }
			}

			input.close();

		}

	}

	    