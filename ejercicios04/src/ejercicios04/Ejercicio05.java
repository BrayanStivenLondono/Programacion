package ejercicios04;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    System.out.println("Dame un mes (minuscula)");

		String mes = input.nextLine();
		
		switch(mes) {
		case "enero":
		case "marzo": 
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			System.out.println("tiene 31 dias");
			break;
		case "febrero":
			System.out.println("tiene 28 dias");
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println("tiene 30 dias");
			break;		
		default:
			System.out.println("mes no aceptable");
		}

		input.close();

	}

}
