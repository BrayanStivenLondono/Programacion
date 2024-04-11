package ejerciciosexcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio8ConExcepciones {

	public static void main(String[] args) {
		String ruta = "fichero.sql";
		//con ficheros, NO REPASAR AUN
		leerFichero(ruta);
	}
	
	public static void leerFichero (String ruta)  {
		Scanner lector = null;
		try {
			lector = new Scanner (new File (ruta));//c
			while (lector.hasNextLine()) {
				System.out.println(lector.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error: "+e.getMessage());
		} finally {
			if (lector!=null) {
				lector.close();
			}
		}
	}
}
