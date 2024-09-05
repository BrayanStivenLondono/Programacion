package ficheroraf;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class LeerYEscribirEnRaf {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// escribir en el archivo
			// 1.- Abrir el acceso al archivo
			RandomAccessFile f = new RandomAccessFile("datos.txt", "rw");
			//2.- me coloco al final
			f.seek(f.length());
			String respuesta = "";
			do {
				System.out.println("Nombre= ");
				String nombre = in.readLine();
				// 3.- grabar el nombre del archivo
				f.writeUTF(nombre);
				System.out.println("¿Deseas continuar?(si/no)");
				respuesta = in.readLine();
			} while (respuesta.equalsIgnoreCase("si"));
			// 4- cerrar el archivo
			f.close();

			// leer el archivo
			// 1.- abrir el archivo
			RandomAccessFile f2 = new RandomAccessFile("datos.txt", "rw");
			String nombre = "";
			boolean finFichero = false;
			
			do {
				try {
					//2.- leo el nombre
					nombre = f2.readUTF();
					//3.- lo muestro
					System.out.println(nombre);
				} catch (EOFException e) {
					System.out.println("Fin fichero");
					finFichero = true;
					//4.- cerrar el archivo
					f2.close();
				}
			} while (!finFichero);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}