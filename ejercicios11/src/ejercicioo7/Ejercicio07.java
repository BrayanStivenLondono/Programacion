package ejercicioo7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("1 - crear un fichero");
		System.out.println("2 - crear un directorio");
		System.out.println("3 - comprobar si existe un archivo");
		System.out.println("4 - mostrar contenido de directorio");
		System.out.println("5 - borrar fichero o directorio");
		System.out.print("Selecciona una opcion: ");
		int opcion = input.nextInt();
		input.nextLine();

		String ruta;
		switch (opcion) {

		case 1:
			System.out.println("Introduce la ruta y nombre");
			ruta = input.nextLine();
			crearFichero(ruta);
			break;
		case 2:
			System.out.println("Introduce la ruta del directorio a crear");
			ruta = input.nextLine();
			crearDirectorio(ruta);
			break;
		case 3:
			System.out.println("Introduce la ruta del directorio o fichero");
			ruta = input.nextLine();
			existeRuta(ruta);
			break;
		case 4:
			System.out.println("Introduce la ruta del fichero a mostrar");
			ruta = input.nextLine();
			mostrarContenidoDirectorio(ruta);
			break;
		case 5:
			System.out.println("Introduce la ruta del fichero a borrar");
			ruta = input.nextLine();
			eliminarFichero(ruta);
			break;
		default:

		}

		input.close();
	}

	public static void crearFichero(String ruta) {
		File fichero = new File(ruta);
		try {
			if (!fichero.createNewFile()) {
				System.out.println("No se puedo crear el Fichero");

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void crearDirectorio(String ruta) {
		File fichero = new File(ruta);
		if (!fichero.mkdir()) {
			System.out.println("No se pudo crear el Directorio");
		}
	}

	public static void existeRuta(String ruta) {
		File fichero = new File(ruta);
		if (fichero.exists()) {
			System.out.println("La ruta existe");
		} else {
			System.out.println("La ruta no existe");
		}
	}

	public static void mostrarContenidoDirectorio(String ruta) {
		File fichero = new File(ruta);

		if (fichero.exists()) {
			String[] vector = fichero.list();
			for (int i = 0; i < vector.length; i++) {
				System.out.println(vector[i]);
			}
		} else {
			System.out.println("El directorio no existe");
		}
	}

	public static void eliminarFichero(String ruta) {
		File fichero = new File(ruta);

		if (fichero.exists()) {//aqui lo elimina
			if (!fichero.delete()) {
				System.out.println("No se puedo eleminar");
			}
		} else {
			System.out.println("El fichero no existe");
		}
	}
}
