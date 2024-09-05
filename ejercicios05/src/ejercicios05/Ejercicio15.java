package ejercicios05;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// debemos pedir numero enteros hasta introducir el 0
		// al finalizar debemos indicar el total de numero leidos y la suma total
		// total numero leidos > contador
		// suma total > acomulador
		
		int numLeido; // Lo creo aqui, para poder declarar el WHILE <-Importante
		int contadorNumLeidos=0;
		int sumaTotal=0;
		
		do {
			System.out.println("Introduce numero positivos o negaticos (termina con el 0)");
			numLeido = input.nextInt();
			
			contadorNumLeidos++; // CONTADOR
			sumaTotal += numLeido; // ACOMULADOR
		} while (numLeido!=0);
		
		System.out.println("El total de numeros es "+(contadorNumLeidos-1)); // (-1) para no contar el cero en el contador
		System.out.println("La suma de numeros es "+sumaTotal);
		
		input.close();

	}

}
