package ficheroraf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFicheroRaf {
	//FAR (fichero de acceso aleatorio-Random Access File)
	//No guardas textos, gurda registros
	//Perimite acceder a una posicion determinada IMP
	//me puedo resplazar por los registros
	//puedo leer y escribir a la vez
	//modo
	//r > read
	//w > write
	//Metodos /WriteIn, writelong, writenDouble, writeBytes)
	//getFilePinter devluve la poscion actual donde voy a hacer la operaciones
	//seek coloca el fichero en esa posicion
	//lenght tamaño del archivo
	
	public static void main(String[] args) {
		//abrir archivo raf
		//nos ponemos al final de fichero
		//escribo una cadena
		//cierro

		try {
			RandomAccessFile f = new RandomAccessFile("datos.txt", "rw");
			f.seek(f.length());
			f.writeBytes("Esto es un texto");
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
