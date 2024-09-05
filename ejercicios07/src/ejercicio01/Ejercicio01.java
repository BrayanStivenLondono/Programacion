package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//vector
		int [] entero;

		//llamar metodo
		entero = Ejercicio01.pedi10Numeros();
		
		// lo muestro de manera inversa
		for (int i = entero.length-1; i >= 0; i--) {//cadena inversa
			System.out.print(entero[i]+" ");
		}
	}
	static int [] pedi10Numeros () {
		Scanner input = new Scanner (System.in);
		//pido vector
		int [] array = new int [10];
		
		for (int i=0; i<array.length; i++) {
			System.out.println("Dame un numero");
			array [i] = input.nextInt();
		}
		//devuelve
		input.close();
		return array;//el return siempre de ultimo, despues del (close)
	}

}
