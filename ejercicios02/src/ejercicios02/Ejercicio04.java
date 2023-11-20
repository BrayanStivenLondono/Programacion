package ejercicios02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la circunferencia");
		double radio = input.nextDouble();
		
		double area = radio*radio*3.1415;
		double longitud = 2*3.1415*radio;
		
		System.out.println("el area es " + area);
		System.out.println("la longitud es " + longitud);
		
		
	
		input.close();
	

	}

}
