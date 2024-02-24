package practica3;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] arrayPueblos = {"Belchite","Botorrita","Cadrete","Gelsa","Pedrola","Quinto","Zuera"};
		
		System.out.println("Introduce un pueblo"); 
		String pueblo = input.nextLine();

		if (encontrado(pueblo, arrayPueblos)) {
			System.out.println("El pueblo esta dentro del array");
		} else {
			System.out.println("El pueblo no existe dentro del array");
		}
		
		input.close();
	}

	public static boolean encontrado (String pueblo, String [] array) {
		for (int i=0; i<array.length; i++) {
			if (array[i].equals(pueblo)) {
				return true;
			}
		}		
		return false;
	}

}
