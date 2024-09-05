/*
* Autor: Guillermo Reloba
* Licencia: De conducir, de armas no
* Licencia del código: GPL
* */
//bajo el import innncesario y lo elimino

//llamo el paquete examen
package examen;

import java.util.Random;
import java.util.Scanner;
import metodosgeneradores.MetodosGeneradorContrasenas;

public class GeneradorContrasenas {

	/*
	 * creo un segundo Scanner con el objetivo de darselo a los valores numericos y
	 * evitar llenar el codigo con input.nextLine(); para limpiar buffer
	 */
	static Scanner inputNumerico = new Scanner(System.in);

	public static void main(String[] args) {
		//elimino la variable contraseñaIntroducidad y la creo e inicializo donde la vor a utilizar

		// cambio el nombre del Scanner input, lo importo, y donde lo creo lo inicialzo
		Scanner input = new Scanner(System.in);

		/*
		 * agrego 4 syso para darle la oportunidad de elegir de forma mas legible, en
		 * vez de ponerlo en una linea, ademas creo una variable opcionMenu que la
		 * recibira el switch, y como ultimo elimino el syso
		 */

		System.out.println("Menu de opciones");
		System.out.println("1. Introducir una contraseña");
		System.out.println("2. Generar contraseña aleatoria");
		System.out.print("Elige una opcion: ");
		int opcionMenu = inputNumerico.nextInt();

		switch (opcionMenu) {
		case 1:
			int[] vectorContraseñaIntroducida;
			Random generadorAleatorio;
			MetodosGeneradorContrasenas.opcionMenuIntroducirContrasena(input);

		case 2:
			Random generadorAleatorioOpcion2;
			int tamanoContrasenaAGenerar = MetodosGeneradorContrasenas.opcionMenuGeneradorContrasena(input);
			break;
		default:
			System.out.println("Opcion no valida");
			System.out.println("Fin del programa");
			}
		input.close();
	}
}