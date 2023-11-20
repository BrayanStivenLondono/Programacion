package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dime tus puntos");
		
		int puntos = input.nextInt();
		
		if (puntos<50) {
			System.out.println("Tu eres hierro");
			 
		} else if (puntos>=50 && puntos< 70) { 
			System.out.println("Tu eres bronce");
		} else if (puntos>=75 && puntos< 100) {
			System.out.println("Tu eres plata");
		} else if (puntos>=100 && puntos< 125){
			System.out.println("Tu eres oro");	
		} else if (puntos>=125) {
			System.out.println("Tu eres platino");
		}
		

		input.close();

	}

}
