package ficherossecuenciales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheroSecuencual {
//cualquiero flujo de informacion en java necesita un Stream (flujo)
//flujo de conexion entre programa y dispositivo (entrada o salida)

//Tipos de Flujo
	//caracteres (tecto)
	//bytes (banarios)
	
//Tipos de Archivo
	//texto (no enriquesidos), abrimos con blog notas, wordpad
	//binarios (enriquesidos), video, texto con imagen
	//clases bytes > Reader, Writer
	//clase caracteres > InputStreamReader, OutStreamReader
//Existen dos modos de Accesos (secuencial, aleatorio)
	//lectura (BufferedReader), Escritura (PrintWriter)
	public static void main(String[] args) {
		try {
			//1. Crar el puntero del archivo
			@SuppressWarnings("resource")
			BufferedReader fichero = new BufferedReader(new FileReader("datos.txt"));
			//cuando pongo el nombre, pongo el fichero a la misma altura del src
			//pero si se pone ruta > "c:\\documentos\\datos.txt"
			//2. Recorro el archivo linea a linea
			String nombre = "";
			nombre = fichero.readLine();
			
			while (nombre!=null) {
				System.out.println(nombre);
				nombre = fichero.readLine();
			}
			//el proceso de leer un fichero secuencual
			//finaliza cuando se lee el fin del fichero
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		} catch (IOException e) {
			System.out.println("Error, el fichero no es accesible");
		}
	}
}
