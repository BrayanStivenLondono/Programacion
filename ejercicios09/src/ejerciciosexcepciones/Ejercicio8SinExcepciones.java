package ejerciciosexcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio8SinExcepciones {

	public static void main(String[] args) throws FileNotFoundException {//no se controla, solo se lanza
		String ruta = "fichero.sql";
		
		leerFichero(ruta);
	}
	
	public static void leerFichero (String ruta) throws FileNotFoundException {
		Scanner lector = new Scanner (new File (ruta));
		while (lector.hasNextLine()) {
			System.out.println(lector.nextLine());
		}
		lector.close();
	}
}
