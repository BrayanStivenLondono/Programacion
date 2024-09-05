package ejercicios04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame tu nota de 0 entre 10");
		int numero = input.nextInt();
		switch (numero) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("nota no valida");
			
		}
				
		
		input.close();

	}

}
