package ficheroraf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFicheroRaf2 {
	
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile f = new RandomAccessFile("datos", "rw");
			
		f.seek(f.length());
			
		f.writeBytes("Esto es un texto");
			
		f.close();
		System.out.println("Fichero actulizado");
		
	}
}
