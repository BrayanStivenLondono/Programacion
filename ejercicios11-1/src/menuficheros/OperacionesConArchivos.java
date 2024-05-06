package menuficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Vector;

public class OperacionesConArchivos {
	private String archivo;

	public OperacionesConArchivos(String archivo) {
		this.archivo = archivo;
	}

	// metodo crearArchivo
	public void crearArchivo() throws IOException {
		System.out.println("\nCREAR ARCHIVO");
		// 1. abro para lectura y entrada de teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;

		// 2. abrp para escritura con el buffer de lectura
		// creamos el fichero de escritura usando
		PrintWriter fuente = new PrintWriter(
				// O new BufferedWriter
				new BufferedWriter(new FileWriter(this.archivo)));
		System.out.println("Creacion de un archivo");
		System.out.println("Introduce las lineas (*)");
		// 3. recorro linea a linea hasta *
		linea = in.readLine();
		while (!linea.equalsIgnoreCase("*")) {
			fuente.println(linea);
			linea = in.readLine();
		}

		// 4. cerra el archivo
		fuente.close();
	}

	// lee la informacion del archivo y lo muestra
	public void visualizarArchivo() throws IOException {
		System.out.println("\nVER ARCHIVO");
		String linea;
		// abro para lectura, recorro hasta null, muestro y cierro
		BufferedReader fuente = new BufferedReader(new FileReader(this.archivo));
		linea = fuente.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = fuente.readLine();
		}
		fuente.close();
	}

	// convertir mayuscula minuscula
	public void convertirMayusMinus(int opcionElegida) {
		System.out.println("\nCONVERTIR MAYUS A MINUS");
		String linea;
		if (opcionElegida == 1) {
			System.out.println("Mayusculas");
		} else {
			System.out.println("Minusculas");
		}

		ArrayList<String> vectorMayMin = new ArrayList<String>();
		try {
			// conecto modo lectura
			BufferedReader fuente = new BufferedReader(new FileReader(this.archivo));
			// guardo linea
			linea = fuente.readLine();
			while (linea != null) {
				vectorMayMin.add(linea);
				linea = fuente.readLine();
			}
			// cierro archivoOrigen
			fuente.close();
			// leo y pasa a mayus o minus
			PrintWriter fuenteMayMin = new PrintWriter(new FileWriter(this.archivo));
			for (int i = 0; i < vectorMayMin.size(); i++) {
				if (opcionElegida == 1) {
					fuenteMayMin.println(vectorMayMin.get(i).toUpperCase());
				} else {
					fuenteMayMin.println(vectorMayMin.get(i).toLowerCase());
				}
			}
			// cierro archivo MayMin
			fuenteMayMin.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// contar numero de linas
	public int numeroLineas() {
		String linea;
		int contador = 0;
		// abro para leer, recorro linea a linea hasta null y cuento, y cerrar
		try {
			BufferedReader fuente = new BufferedReader(new FileReader(this.archivo));
			linea = fuente.readLine();
			while (linea != null) {
				contador++;
				linea = fuente.readLine();
			}
			fuente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contador;
	}

	// buscar palabra
	public void buscarPalabra(String palabraABuscar) {
		System.out.println("\nBUSCAR PALABRA");
		String linea;
		// vector (nueva clase)
		Vector<String> vector = new Vector<String>();
		// abro para leer, leo linea a linea, meto palabras en el vector y cierro
		try {
			BufferedReader fuente = new BufferedReader(new FileReader(this.archivo));
			linea = fuente.readLine();
			while (linea != null) {
				String letra;
				String palabra = "";
				for (int j = 0; j < linea.length(); j++) {
					// extraigo una a una las letras
					// y las acomulamos en una palabra
					// al finalizar cada vuelta tengo una palabra
					letra = linea.substring(j, j + 1);
					if (letra.equalsIgnoreCase(" ") == false) {
						palabra += letra;
					} else {
						vector.add(palabra);
						palabra ="";
					}
				}
				vector.add(palabra);
				// la vacio para el siguiente for
				linea = fuente.readLine();

			}
			System.out.println("Palabra buscada");
			System.out.println(palabraABuscar);
			System.out.println("Vector a buscar");
			System.out.println(vector);
			// busco palabra
			int contador = 0;
			for (int j = 0; j < vector.size(); j++) {
				String palabraEnVector = vector.elementAt(j).toString();
				if (palabraEnVector.equalsIgnoreCase(palabraABuscar) == true) {
					contador++;
				}
			}

			if (contador == 0) {
				System.out.println("La palabra no se encontro");
			} else {
				System.out.println("La palabras se encuentra " + contador + " veces");
			}
			
			fuente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
