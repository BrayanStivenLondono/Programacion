package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// contador de cifras

		System.out.println("Introduce un numero");
		String numero = input.nextLine();
		
		int cifras =0;
		
		for (int i=0; i<numero.length(); i++) {
			cifras++;
		}
		System.out.println("El numero de cifras es: "+cifras);

		input.close();
		
	}

}
