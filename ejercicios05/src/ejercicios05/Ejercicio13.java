package ejercicios05;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Programa que permite calcular la potencia de un número. Pedirá por teclado la base y el
		// exponente y mostrará el resultado de la potencia.
		//la base se eleva al exponente
		// for
		// 14  DO-WHILE
		// 15  DO-WHILE

		System.out.println("Dame la base");
		int base = input.nextInt();

		System.out.println("Dame el exponente");
		int exponente = input.nextInt();
		
		// 5 elevado a exponente
		// base elevada a exponente
		int resultado =1;
		// inicializar suma a 0, multiplicaciones a 1
		for (int i=0; i<exponente; i++) {
			resultado = resultado*base; // ACOMULADOR (IMPORTANTE) (guarda el resultado y lo multiplica por el siguiente
		}
		System.out.println("el resultado es "+resultado);
		
		// resultado  = 1*5
		// resultado  = 5*5
		// multiplica = 25*5
	
		input.close();
		

	}

}
