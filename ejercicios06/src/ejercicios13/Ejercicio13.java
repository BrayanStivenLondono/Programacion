package ejercicios13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println(Ejercicio13.leeCadenas());
		
	}
	private static String leeCadenas () {
		String cadenaResultado = "";
		
		String cadenaLeida;
		Scanner input = new Scanner (System.in);
		
		do {
			System.out.println("Introduce una cadena");
			cadenaLeida = input.nextLine();
			
			cadenaResultado += cadenaLeida+":";
			
		} while (!cadenaLeida.equals("fin"));
		
		input.close();
		return cadenaResultado;
	}

}
