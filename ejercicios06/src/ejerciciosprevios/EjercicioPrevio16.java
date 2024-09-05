package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce el radio de circulo");
		double radio = input.nextDouble();
		
			EjercicioPrevio16.longitudCirculo(radio);
			
			EjercicioPrevio16.areaCirculo(radio);
		
		input.close();
	}
	static void longitudCirculo (double radio) {
		System.out.println("La longitud del circulo es "+(2*Math.PI*radio));
		
	}
	static void areaCirculo (double radio) {
		System.out.println("El area del circulo es "+(Math.pow(radio, 2)*Math.PI));
		
	}

}
