package menuficheros;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int opcion;
		// 1.- pido el nombre archivo
		System.out.println("Introduce el nombre del archivo");
		String nombreArchivo = in.nextLine();

		// 2.- creare un archivo usando OperacionesArchivos
		OperacionesConArchivos miArchivo = new OperacionesConArchivos(nombreArchivo);

		// menu

		do {
			// llamo al menu y devuelvo un entero
			opcion = menu();
			switch (opcion) {
			case 1:
				miArchivo.crearArchivo();
				break;
			case 2:
				miArchivo.visualizarArchivo();
				break;
			case 3:
				// mayusculas
				miArchivo.convertirMayusMinus(1);
				break;
			case 4:
				// minusculas
				miArchivo.convertirMayusMinus(2);
				break;
			case 5:
				int cantidadLineas = miArchivo.numeroLineas();
				System.out.println("Cantidad lineas " + cantidadLineas);
				break;
			case 6:
				System.out.println("Introduce la palabra a buscar");
				in.nextLine();
				String valorABuscar = in.nextLine();
				miArchivo.buscarPalabra(valorABuscar);
				break;
			}
		} while (opcion < 7);
		in.close();
	}

	public static int menu() {
		int opcion = 0;
		boolean error = false;
		do {
			try {
				System.out.println("MENU");
				System.out.println("1.- Crear archivo desde teclado (* para salir)");
				System.out.println("2.- Visualizar archivo");
				System.out.println("3.- Convertir a mayusculas");
				System.out.println("4.- Convertir a minusculas");
				System.out.println("5.- Numero de lineas");
				System.out.println("6.- Buscar palabra en un fichero");
				System.out.println("7.- Salir");
				opcion = in.nextInt();
				if (opcion < 1 || opcion > 7) {
					System.out.println("Error el valor debe estar entre 1 y 7");
					error = true;
				} else {
					error = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Error, debes introducir un numero");
				in.nextLine();
				error = true;
			} catch (Exception e) {
				System.out.println("Error de acceso a la informacion del teclado");
				System.exit(0);
			}
		} while (error);
		return opcion;
	}

}
