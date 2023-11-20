package ejecicios03;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame la hora");
		int horas = input.nextInt();
		
		System.out.println("Dame los minutos");
		int minutos = input.nextInt();
		
		System.out.println("Dame los segundos");
		int segundos = input.nextInt();
		
		if (horas>=0 && horas <=23) {
			if (minutos>=0 && segundos<=59) {
				if (segundos>=0 && segundos<=59) {
					System.out.println("formato correcto");
					
				} else {
					System.out.println("formato incorrecto");
				}
			} else { 
				System.out.println("formato incorrecto");
			}
		} else {
			System.out.println("formato incorrecto");

		}
		
		
		
		
		
		
		
		
		input.close();

	}

}
