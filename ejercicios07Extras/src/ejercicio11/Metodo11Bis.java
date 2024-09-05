package ejercicio11;

import java.util.Scanner;

public class Metodo11Bis {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		String numero = input.nextLine();
		
		Metodo11Bis.esCapicua(numero);
		
		input.close();
	}
	public static void esCapicua (String numero) {
		String num ="";
		for (int i=numero.length()-1; i>=0; i--) {
			num += numero.charAt(i);
		}
		if (num.equals(numero)) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No capicua");
		}
	}

}
