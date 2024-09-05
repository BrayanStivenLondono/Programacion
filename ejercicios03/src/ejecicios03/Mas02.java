package ejecicios03;

import java.util.Scanner;

public class Mas02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce tu edad");
		
		int edad = input.nextInt();
		 
		if(edad >= 18){
		   System.out.println("Tienes 18 o mas.");
		}
		else if(edad >= 15){
		   System.out.println("Tienes 15 años o mas pero menos de 18.");
		}
		else if(edad >= 10){
		   System.out.println("Tienes 10 años o mas pero menos de 15.");
		}
		else{
		   System.out.println("Eres un niño.");
		}
		
				
	
	
	
	
	
		
		
		
		
		
		
		
		input.close();
	}

}
