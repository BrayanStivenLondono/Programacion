package ejercicios05;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Pasa un numero de binario a decimal // for07 // eje:22 los mismo pero con cualquier binario
		System.out.println("Introduce un decimal");
		String binario = input.nextLine();
		
		int exponente =0; //contador
		long acomulador =0;
		for (int i=binario.length()-1; i>=0; i--) {
			if (binario.charAt(i)=='1') {
				acomulador = acomulador + (long) (Math.pow(2, exponente));
			}
			exponente++;
		}
		System.out.println("La conversion es: "+acomulador);
		
		
		
		input.close();
		
		

	}

}
