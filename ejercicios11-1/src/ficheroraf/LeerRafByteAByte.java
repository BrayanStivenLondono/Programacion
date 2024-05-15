package ficheroraf;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

//en fichero hay sobre todo dos tipos de excepciones
 //FileNotFound > si no lo encuentra
 //IOExeption > excepcion general

public class LeerRafByteAByte {

	public static void main(String[] args) {
		try {
			// 1.- abrir el archivo
				RandomAccessFile f = new RandomAccessFile("datos1.txt","rw");		
			//2.- recorre caracter a caracter
			char letra;
			boolean finFichero=false;
			do {
				try {
					letra=(char)f.readByte();
					if (letra=='b') {
						//1.- desplazar el puntero hacia atras
						f.seek(f.getFilePointer()-1);
						//2.- escribir la B
						f.writeByte('B');
					}
				} catch (EOFException e) {		
					//3.- fin fichero
					finFichero=true;
					System.out.println("Fin fichero");
					f.close();
				} 
			}while (finFichero==false);

			} catch (IOException e) {
				System.out.println("Error de entrada salida");
			}
			
		}

	}
