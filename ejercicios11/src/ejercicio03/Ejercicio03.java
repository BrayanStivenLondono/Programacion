package ejercicio03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Dame una cadena: ");
		String cadena = input.nextLine();
		
		System.out.print("Dame una ruta: ");
		String ruta = input.nextLine();
		
		try {
			escribeFichero(cadena, ruta);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		input.close();
	}
	
	public static void escribeFichero(String cadena, String ruta) throws FileNotFoundException {
		PrintWriter escritor = new PrintWriter(ruta);
		escritor.println(cadena);
		escritor.close();
	}

}
