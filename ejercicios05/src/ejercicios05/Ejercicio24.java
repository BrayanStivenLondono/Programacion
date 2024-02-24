package ejercicios05;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// 24) Programa que pida el largo y el ancho (valores enteros)
		// DIBUJO DE UN RECTANGULO
		System.out.println("Introduce el alto");
		int alto = input.nextInt();
				
		System.out.println("Introduce el ancho");
		int ancho = input.nextInt();
				
		for (int i=0; i<alto; i++) {
			for (int j=0; j<ancho; j++) {
				System.out.print(("* ").replace('*', 'X'));
				
				}
				System.out.println(); // IMPORTANTE (Si pone para que salga uno encima de otro)
			}
	
		input.close();

	}

}
