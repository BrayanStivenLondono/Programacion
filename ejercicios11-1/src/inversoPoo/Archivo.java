package inversoPoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
	// 1.- atributos nombreArchivo
	String nombreArchivo;

	// 2.- constructores
	public Archivo() {
		this.nombreArchivo = "";
	}

	public Archivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	// 3.- metodo visualizar archivo
	public static void visualizarArchivo(String nombreArchivo) {
		try {
			// 1.- abro para lectura
			BufferedReader origen = new BufferedReader(new FileReader(nombreArchivo));
			// 2.- recorro linea a linea hasta null y muestro
			String linea = "";
			linea = origen.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = origen.readLine();
			}
			// 3.- cierro fichero
			origen.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Error de entrada salida");
			System.exit(0);
		}
	}

	// 4.- metodo crear archivo invertido
	public void crearArchivoInvertido() throws IOException {
		// 1.- abrir el fichero para leer y crear un ArrayList
		BufferedReader origen = new BufferedReader(new FileReader(nombreArchivo));
		ArrayList<String> v = new ArrayList<String>();
		// 2.- leo del primero y escribo en el vector(ArrayList)
		String linea = "";
		linea = origen.readLine();
		while (linea != null) {
			v.add(linea);
			linea = origen.readLine();
		}
		// 3.- cerrar el archivo
		origen.close();
		// 4.- abro el segundo para escribir
		PrintWriter destino = new PrintWriter(new FileWriter("nombreInvertido.txt", false));
		// 5.- leo del vector del reves y escribo
		for (int i = v.size() - 1; i >= 0; i--) {
			destino.println(v.get(i));
		}
		// 6.- cerrar el archivo
		destino.close();
	}
}
