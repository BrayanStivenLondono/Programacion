package inversoPoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
	//1. atributo nombreArchivo
	String nombreArchivo;
	
	public Archivo() {
		this.nombreArchivo = "";
	}
	
	public Archivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
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
	//metodo crear archivo invertido
	public void crearArchivoInvertido() {
		//1. abri fichero para leer y crar un ArrayList
				BufferedReader origen = new BufferedReader(new FileReader(NombreArchivo));
				ArrayList<String> vector = new ArrayList<String>();
				
				//2. Leo en el primero y escribo un vector
				String linea ="";
				linea = origen.readLine();
				while (linea!=null) {
					vector.add(linea);
					linea = origen.readLine();
				}
				
				//3. cerrar los archivo
				origen.close();
				
				//4. abro el segundo para escibir
				PrintWriter destino = new PrintWriter (new FileWriter ("", false));
				
				//5. leo del vector del reves y escribo
				
				for (int i = vector.size()-1; i>=0; i--) {
					destino.println(vector.get(i));
				}
				
				//6. cerrar el archivo
				destino.close();
	}
}
