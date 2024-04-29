package ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		String ruta = "src/ejercicio02/fichero.sql";
		leerFichero(ruta);
	}
	
	public static void leerFichero(String ruta) {
		//con fichero siempre debo controlar las exepciones
		Scanner input = null;
		try {
			input = new Scanner (new File(ruta));
			while (input.hasNextLine()) {//lee linea a linea el fichero
				System.out.println(input.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//comprueba que el lector esta abiero
			//y se cierra en el finally
			if (input!=null) {
				input.close();
			}
		}
	}
}
