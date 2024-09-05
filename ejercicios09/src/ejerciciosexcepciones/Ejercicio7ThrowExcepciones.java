package ejerciciosexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7ThrowExcepciones {

	public static void main(String[] args) throws IOException {//NUEVO SCANNER
		lectura();
		
	}
	public static void lectura () throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Dame un frase");
		String frase = input.readLine();
		
		System.out.println("La frase es: "+frase);
	}
}
