package ejerciciosexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7ConExcepciones {
	public static void main(String[] args) {
		lectura();
		
	}
	public static void lectura () {//otro Scanner
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Dame un frase");
		String frase;
			
		try {
			frase = input.readLine();
			System.out.println("La frase es: "+frase);
		} catch (IOException e) {
			System.err.println("Error de entrada de datos");
		}
	}
}

