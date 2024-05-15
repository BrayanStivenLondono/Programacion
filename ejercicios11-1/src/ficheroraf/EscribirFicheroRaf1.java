package ficheroraf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFicheroRaf1 {
	
	public static void main(String[] args) {
		try {
			RandomAccessFile f = new RandomAccessFile("datos", "rw");
			f.seek(f.length());
			
			f.writeBytes("Esto es un texto");
			
			f.close();
			System.out.println("Fichero actulizado");
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
