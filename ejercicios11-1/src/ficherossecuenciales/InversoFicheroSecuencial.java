package ficherossecuenciales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class InversoFicheroSecuencial {

	public static final String archivo = "datos.txt";
	public static final String archivo2 = "inverso.txt";
	public static void main(String[] args) throws IOException {
		//1. abri fichero para leer y crar un ArrayList

		BufferedReader origen = new BufferedReader(new FileReader(archivo));
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
		PrintWriter destino = new PrintWriter (new FileWriter (archivo2, false));
		
		//5. leo del vector del reves y escribo
		
		for (int i = vector.size()-1; i>=0; i--) {
			destino.println(vector.get(i));
		}
		
		//6. cerrar el archivo
		destino.close();
		//7. veo el primero
		System.out.println("Veo archivo de origen");
		verArchivo(archivo);
		//8. veo el segundo
		System.out.println("Veo archivo de destino");
		verArchivo(archivo2);
		
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
