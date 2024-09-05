package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
		
		// Realizar un programa que nos da informaci�n acerca del uso de un 
        // ordenador. El programa solicitar� dos datos: el n�mero de horas de uso de ordenador y si m�s
		// del 50% de las horas es de uso de ordenador o no (si/no).
		
		System.out.println("Dime tus horas de juego a la semana");
		int horas = input.nextInt();
		
		System.out.println("Dime si el mas del 50% de las horas son jugando(True/False)");
		boolean juego = input.nextBoolean();
		
		if (horas<4) {
			System.out.println("Bajo");
		} else if (((horas>=4) && (horas<8)) && juego==false) {
			System.out.println("Moderado");
		} else if (((horas>=4) && (horas<8)) && juego==true) {
			System.out.println("Moderado y muchas horas de juego");
		} else if (((horas>=8) && (horas<12)) && juego==false) {
			System.out.println("Alto");
		} else if (((horas>=8) && (horas<12)) && juego==true) {
			System.out.println("Alto y muchas horas de juego");
		} else if (((horas>=12) && (horas<20)) && juego==false) {
			System.out.println("Muy alto");
		} else if (((horas>=12) && (horas<20)) && juego==true) {
			System.out.println("Muu alto y muchas horas de juego");	
		} else if (horas>20) {
			System.out.println("Extramadamente alto");
		}

		input.close();
	}

}
