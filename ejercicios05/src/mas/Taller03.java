package mas;

import java.util.Scanner;

public class Taller03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Ordenar datos
		
		//visita1
		System.out.println("Introduce el NOMBRE de la visita");
		String visita1=input.nextLine();
		System.out.println("Introduce el nombre del GUIA");
		String guia1=input.nextLine();
		System.out.println("Introduce el precio FREE TOUR que le quieres dar a la visita");
		double precio1 = input.nextDouble();
		input.nextLine(); //BUFFER
		
		//visita2
		System.out.println("Introduce el NOMBRE de la visita");
		String visita2 = input.nextLine();
		System.out.println("Introduce el nombre del GUIA");
		String guia2 = input.nextLine();
		System.out.println("Introduce el precio FREE TOUR que le quieres dar a la visita");
		double precio2 = input.nextDouble();
		
		String completo1 = visita1+ " , "+guia1+ " , "+precio1;
		String completo2 = visita2+ " , "+guia2+ " , "+precio2;		
		
		if (precio1>precio2) {
			System.out.println(completo1);
			System.out.println(completo2);
		} else if (precio2>precio1) {
			System.out.println(completo2);
			System.out.println(completo1);
		}

		
		input.close();
	}

}
