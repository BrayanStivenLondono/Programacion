package ejercicios02;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame la longitud de cateto1");
		double cateto1 = input.nextDouble();
		System.out.println("Dame la longiutd de cateto2");
		double cateto2 = input.nextDouble();
		
		double hipotenusa = Math.sqrt(cateto1*cateto1)+(cateto2*cateto2);
		
		System.out.println("La longitud de la hipotenusa "+hipotenusa);
		
		
		
		
		
		input.close();

	}

}
