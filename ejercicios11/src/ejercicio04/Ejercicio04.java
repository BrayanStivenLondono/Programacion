package ejercicio04;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Dame la cantidad de cadenas: ");
		int cantidad = input.nextInt();
		
		String[] cadenas = new String[cantidad];
		
		for (int i = 0; i < cadenas.length; i++) {
			System.out.print("Dame una cadena: ");
			cadenas[i] = input.nextLine();
		}
		
		try {
			escribeCadechasFichero(cadenas, "src/ejercicio04/cadenas.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 		
		input.close();
	}
	
	public static void escribeCadechasFichero (String[] cadenas, String ruta) throws FileNotFoundException {
		PrintWriter escritor = new PrintWriter(ruta);
		for (int i = 0; i < cadenas.length; i++) {
			escritor.print(cadenas[i]);
			}	
		escritor.close();
	}
}
