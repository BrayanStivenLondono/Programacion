package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//vector
		int [] entero;

		//llamar metodo
		entero = Ejercicio01.pedi10Numeros();
		
		// lo muestro de manera inversa
<<<<<<< HEAD
		for (int i = entero.length-1; i >= 0; i--) {//cadena inversa
=======
		for (int i=entero.length-1; i>=0; i--) {//cadena inversa
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
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
