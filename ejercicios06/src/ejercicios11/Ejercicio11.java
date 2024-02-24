package ejercicios11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String palabra = input.nextLine().toLowerCase();
		
		String palabraResultado = cifrar (palabra, 2);
		System.out.println(palabraResultado);
		
		input.close();
		
	}
	static String cifrar (String palabra, int desfase) {
		String resultado ="";
		// si pongo un numero mayor de 26
		// se quedara con el desfase correspondiente
		
		desfase = desfase%26;//para que gire
		//caracterDesfasado, (guarda el dato perdido)
		
		for (int i=0; i<palabra.length(); i++) {
			char caracterDesfasado = (char)(palabra.charAt(i)+desfase);
			
			if (caracterDesfasado >'z') {
				caracterDesfasado = (char)('a'+desfase-1);
			}
			resultado += caracterDesfasado;
		}
		return resultado;
	}

}
