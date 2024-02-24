package principal;

import java.util.Scanner;

class OpcionesContraseña  {
	int opcion;
	int longitud;
}

public class Refactorizar3 {

	public static void main(String[] args) {
		
		OpcionesContraseña opciones = SeleccionarOpcionesContraseña();
		
		String password = "";
		switch (opciones.opcion) {
		case 1:
			password = generaPalabraAleatoria(opciones, password);
			break;
		case 2:
			password = GenerarNumerosAleatorios(opciones, password);
			break;
		case 3:
			password = letrasCaracteresAleatorios(opciones, password);
			break;
		case 4:
			password = letrasNumerosCaracteresAleatorios(opciones, password);
			break;
		}

		System.out.println(password);
	}

	private static String letrasNumerosCaracteresAleatorios(OpcionesContraseña opciones, String password) {
		for (int i = 0; i < opciones.longitud; i++) {
			int n;
			n = (int) (Math.random() * 3);
			if (n == 1) {
				char letra4;
				letra4 = (char) ((Math.random() * 26) + 65);
				password += letra4;
			} else if (n == 2) {
				char caracter4;
				caracter4 = (char) ((Math.random() * 15) + 33);
				password += caracter4;
			} else {
				int numero4;
				numero4 = (int) (Math.random() * 10);
				password += numero4;
			}
		}
		return password;
	}

	private static String letrasCaracteresAleatorios(OpcionesContraseña opciones, String password) {
		for (int i = 0; i < opciones.longitud; i++) {
			int n;
			n = (int) (Math.random() * 2);
			if (n == 1) {
				char letra3;
				letra3 = (char) ((Math.random() * 26) + 65);
				password += letra3;
			} else {
				char caracter3;
				caracter3 = (char) ((Math.random() * 15) + 33);
				password += caracter3;
			}
		}
		return password;
	}

	private static String GenerarNumerosAleatorios(OpcionesContraseña opciones, String password) {
		for (int i = 0; i < opciones.longitud; i++) {
			int numero2;
			numero2 = (int) (Math.random() * 10);
			password += numero2;
		}
		return password;
	}

	private static String generaPalabraAleatoria(OpcionesContraseña opciones, String password) {
		for (int i = 0; i < opciones.longitud; i++) {
			char letra1;
			letra1 = (char) ((Math.random() * 26) + 65);
			password += letra1;
		}
		return password;
	}
	
	private static int SeleccionarOpcionesContraseña() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Programa que genera passwords de la longitud indicada, y del rango de caracteres");
		System.out.println("1 - Caracteres desde A - Z");
		System.out.println("2 - Numeros del 0 al 9");
		System.out.println("3 - Letras y caracteres especiales");
		System.out.println("4 - Letras, numeros y caracteres especiales");
		System.out.println("Introduce la longitud de la cadena: ");
		int longitud = scanner.nextInt();
		System.out.println("Elige tipo de password: ");
		int opcion = scanner.nextInt();
		scanner.close();
		OpcionesContraseña resultado = new OpcionesContraseña ();
		resultado.longitud = longitud;
		resultado.opcion = opcion;
		return opcion;
	}

}