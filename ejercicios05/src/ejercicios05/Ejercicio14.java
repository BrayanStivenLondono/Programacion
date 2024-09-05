package ejercicios05;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa para controlar el nivel de un depósito de agua. El programa inicialmente nos pedirá el volumen total en litros del depósito.

		System.out.println("Introduce el tamaño del deposito");
		float volumenTotal = input.nextFloat();
		
		float litrosActuales=0; //
		
		do {// pido litros
			//creo un acumulador que sirva para sumar y restar
			// acomulador=acomulador+litros
			System.out.println("Introduce litros (positivos echo, negativos extraigo)");
			litrosActuales += input.nextFloat(); // acomulador
			
			if (litrosActuales<volumenTotal) {
				System.out.println("Faltan " +(volumenTotal-litrosActuales) + " litros para llenar deposito");
			}
		} while (litrosActuales<volumenTotal); 
		System.out.println("Se ha llenado el deposito");
	
	
		
		input.close();

	}

}
