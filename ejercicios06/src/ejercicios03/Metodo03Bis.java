package ejercicios03;

import java.util.Scanner;

public class Metodo03Bis {

	public static void main(String[] args) {//EJERCICIO
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un caracter");
		char caracter = input.nextLine().charAt(0);
		
		System.out.println(Metodo03.esDigito(caracter));

		input.close();
	}
	static boolean esDigito (char caracter) {
		if (caracter>='0' && caracter<='9') {
			return true;
		}
		return false;
	}

}
