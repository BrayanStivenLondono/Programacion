package ejercicios04;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame una cantidad de gramos");
		
		int gramos = input.nextInt();
		
		if (gramos>=0) {
			System.out.println("1.- Kilogramos");
			System.out.println("2.- Hectagramos");
			System.out.println("3.- Decagramos");
			System.out.println("4.- Decigramos");
			System.out.println("5.- Centigramos");
			System.out.println("6.- Miligramos");
			System.out.println(" ¿A que unidad quieres convertirlos ?");
			int opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				double kg=gramos/1000.0;
				System.out.println("kg");
				break;
				
			case 2:
				double Hectagramos=gramos/100.0;
				System.out.println("hectagramos");
				break;
				
			case 3:
				double Decagramos=gramos/10.0;
				System.out.println("decagramos");
				break;
				
			case 4:
				double Decigramos=gramos*10;
				System.out.println("Decigramos");
				break;
				
			case 5:
				double centigramos=gramos*100;
				System.out.println("Centigramos");
				break;
				
			case 6:
				double miligramos=gramos*1000;
				System.out.println("Miligramos");
				break;
				
			default:
				System.out.println("opcion no contemplada");
				break;

			}


		} else {
			System.out.println("los gramos no pueden ser negativos");
		}
		
		
		
		
		
		
		
		input.close();


	}

}
