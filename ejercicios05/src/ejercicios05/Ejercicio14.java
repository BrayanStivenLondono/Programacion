package ejercicios05;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Programa para controlar el nivel de un dep�sito de agua. El programa inicialmente nos pedir� el volumen total en litros del dep�sito.

		System.out.println("Introduce el tama�o del deposito");
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
