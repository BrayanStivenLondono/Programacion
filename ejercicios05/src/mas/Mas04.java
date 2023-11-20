package mas;

import java.util.Scanner;

public class Mas04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// DO-WHILE > Menu
		// INICIO DE EXAMEN (ELEGIR OPCION) (MUY-IMPORTANTE)
		
		int opcion =0; // lo creo desde aqui para poder declarar el WHILE (mientras)
		do {
			System.out.println("1. Opcion1");
			System.out.println("2. Opcion2");
			System.out.println("3. Salir");
			System.out.println("1. Selecciona la opcion que quieras");
			opcion = input.nextInt(); // lo declaro definitivamente
			switch (opcion) {
			case 1: 
				System.out.println("Opcion-1");
				break;
			case 2:
				System.out.println("Opcion-2");
				break;
			case 3:
				System.out.println("Adiós");
				break;
			}

		} while (opcion!=3);
		
		//  forma (char) (comprobar caracter, abece)
				for (char i = 'A'; i <= 'Z'; i++) {
					System.out.println(i);
					//ademas de imprimir todas
					//cuando la encuentra la N, pone la N y la Ñ
					if (i == 'N') {
						System.out.println("Ñ");
					}
				}
		
	
		input.close();

	}

}
