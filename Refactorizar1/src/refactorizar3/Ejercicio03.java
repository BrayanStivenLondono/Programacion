package refactorizar3;//cambio el nombre del paquete a uno mas descriptivo

import java.util.Scanner; 

public class Ejercicio03 {//cambio el nombre de la clase a Ejercicio03

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//cambio el nombre de Scanner a input
		
		System.out.println("Programa que genera passwords de la longitud indicada, y del rango de caracteres");
		System.out.println("Elige tipo de password: "); //cambio de posicion el syso para antes de las opciones
		System.out.println("1 - Caracteres desde A - Z");
		System.out.println("2 - Numeros del 0 al 9");
		System.out.println("3 - Letras y caracteres especiales");
		System.out.println("4 - Letras, numeros y caracteres especiales");
		int opcionMenu = input.nextInt();//cambio a nombre descrptivo la variable de opcion del menu y la ubico despues de las opciones
		
		System.out.println("Introduce la longitud de tu passwork: ");//cambio cadena por passwork
		int longitudPassword = input.nextInt(); //cambio el nombre de la variable a uno mas descriptivo de longitud a logitudPasswork
		
		String passworkFinal = "";
		switch (opcionMenu) {
		case 1:
			OpcionesMenu.passworkCaracteres(longitudPassword);
			break;
		case 2:
			for (int i = 0; i < longitudPassword; i++) {
				int numero2;
				numero2 = (int) (Math.random() * 10);
				passworkFinal += numero2;
			}
			break;
		case 3:
			for (int i = 0; i < longitudPassword; i++) {
				int n;
				n = (int) (Math.random() * 2);
				if (n == 1) {
					char letra3;
					letra3 = (char) ((Math.random() * 26) + 65);
					passworkFinal += letra3;
				} else {
					char caracter3;
					caracter3 = (char) ((Math.random() * 15) + 33);
					passworkFinal += caracter3;
				}
			}
			break;
		case 4:
			for (int i = 0; i < longitudPassword; i++) {
				int n;
				n = (int) (Math.random() * 3);
				if (n == 1) {
					char letra4;
					letra4 = (char) ((Math.random() * 26) + 65);
					passworkFinal += letra4;
				} else if (n == 2) {
					char caracter4;
					caracter4 = (char) ((Math.random() * 15) + 33);
					passworkFinal += caracter4;
				} else {
					int numero4;
					numero4 = (int) (Math.random() * 10);
					passworkFinal += numero4;
				}
			}
			break;
		}

		System.out.println(passworkFinal);
		input.close();
	}

}