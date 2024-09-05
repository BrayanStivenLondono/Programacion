package ejercicios15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una serie de palabras "+"seperadas por un espacio");
		String palabras = input.nextLine();
		
		System.out.println("La palabra más larga es: "+Ejercicio15.palabrasMasLarga(palabras));	
		
		input.close();
	}
	private static String palabrasMasLarga (String palabras) {
		//si la cadena no contiene espacios
		//la palabra más larga es la unica que hay
		
		if (!palabras.contains(" ")) {
			return palabras;
		}
		//si hay espacios
		//cojo la primera palabra
		
		String palabraLarga = palabras.substring(0 ,palabras.indexOf(' '));
		String palabraEncontrada;
		
		int espacioInicio = palabras.indexOf(' ');
		//comienzo despues del primer espacio
		//recocrro toda mi cadena una a una 
		
		for (int i=espacioInicio+1; i<palabras.length(); i++) {
			palabraEncontrada = palabras.substring(espacioInicio+1,i+1);
			if (palabras.charAt(i)==' ' || i==palabras.length()-1) {
				palabraLarga = palabraEncontrada;
			}
		}
		return palabraLarga;
	}

}
