package ficherossecuenciales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LecturaEscrituraFicheroSecuencial {

	public static void main(String[] args) throws IOException {
		//1. abri fichero para leer y segundo para escribir
		//leer
		BufferedReader origen = new BufferedReader(new FileReader("datos.txt"));
		//escribir
		PrintWriter destino = new PrintWriter(new FileWriter("datosMayuscula.txt"));

		//2. Leo en el primero y leo en el segundo
		String linea ="";
		linea = origen.readLine();
		while (linea!=null) {
			destino.println(linea.toUpperCase());
			linea = origen.readLine();
		}
		
		//3. cerrar los archivo
		origen.close();
		destino.close();
		
		//4. ver archivos origen
		System.out.println("Ver archivo origen");
		verArchivo("datos.txt");
		//6. ver archivos destino
		System.out.println();
		System.out.println("Ver archivo destino");
		verArchivo("datosMayuscula.txt");
	}
	
	public static void verArchivo(String nombreArchivo) {
		//1. abro lectura
		try {
			BufferedReader origen = new BufferedReader(new FileReader(nombreArchivo));
			String linea ="";
			
			//2. recorro linea a linea hasta null y muestro

			linea = origen.readLine();
			while (linea!=null) {
				System.out.println(linea);
				linea = origen.readLine();
			}
			
			//3. cierro el fichero
			origen.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
			System.exit(0);//cierro el programa
		} catch (IOException e) {
			System.out.println("Error de entrda salida");
		}
	}
}
