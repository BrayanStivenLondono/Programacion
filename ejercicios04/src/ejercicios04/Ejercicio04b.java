package ejercicios04;

import java.util.Scanner;

public class Ejercicio04b {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame tu nota entre 0 y 10");
		int numero = input.nextInt();
		
		switch (numero) {
		case 0:
			System.out.println("Insuficiente");
			break;
		case 1:
			System.out.println("Insuficiente");
			break;
		case 2:
			System.out.println("Insuficiente");
			break;
		case 3:
			System.out.println("Insuficiente");
			break;
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
			System.out.println("notable");
			break;
		case 8: 
			System.out.println("notable");
			break;
		case 9: 
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Sobresaliente");
			break;
			
		default:
			System.out.println("Nota no disponible");
		
		}
		
		
		input.close();
	}

 }
