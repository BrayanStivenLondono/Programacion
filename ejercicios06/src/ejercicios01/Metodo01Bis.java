package ejercicios01;

import java.util.Scanner;

public class Metodo01Bis {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce la edad");
		int edadLeida = input.nextInt();
		
		boolean resultado = Metodo01.esAdulto(edadLeida);
		
		if (resultado) { //true
			System.out.println("Es Mayor");
		} else { //false
			System.out.println("Es Menor");
		}
		input.close();

	}
	static boolean esAdulto (int edad) {
		if (edad>=18) {
			return true;
		}
		return false;
	}
}
