package ejecicios03;

import java.util.Scanner;

public class Mas {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Dias de la semana
		
		System.out.println("Introduce un dia de la semana");
		int dia = input.nextInt(); 
		
		
		if (dia==1) {
			System.out.println("Lunes");	
		}
		else if(dia==2) {
			System.out.println("Martes");
		}
		else if(dia==3) {
			System.out.println("Miercoles");
		}
		else if(dia==4) {
			System.out.println("Jueves");
		}
		else if(dia==5) {
			System.out.println("Viernes");
		}
		else if(dia==6) {
			System.out.println("Sabado");
		}
		else if(dia==7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("No es un dia");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}
