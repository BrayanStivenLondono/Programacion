package ficheroscadenas;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class ListaNombres {
	String archivo;
	
	public ListaNombres (String nombre) {
		this.archivo = nombre;
		
	}
	//int 4 bytes
	//double 8
	//cadena su longitud + 2 bytes
	
	public void rellenarArchivo() {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			RandomAccessFile f = new RandomAccessFile(archivo, "rw");
			f.seek(f.length());
			String respuesta = "";
			do {
				System.out.println("Nombre: ");
				String nombre = input.readLine();
				
				nombre = formatearNombre(nombre, 20);
				
				f.writeUTF(nombre);//PARA ESCRIBIR EN CADENA ES UTF (IMP)
				respuesta = input.readLine();
			} while (respuesta.equalsIgnoreCase("si"));
		} catch (IOException e) {
			
		}
	}
	private String formatearNombre(String nombre, int longitud) {
		if (nombre.length() > longitud) {
			return nombre.substring(0, longitud);
		} else {//relleno con espacios
			for (int i = nombre.length(); i<longitud; i++) {
				nombre = nombre+"";
			}
		}
		return nombre;
	}
	
	
	public void visualizarArchivo() {
		String nombre;
		try {
			RandomAccessFile f = new RandomAccessFile(archivo, "rw");
			boolean fin = true;
			do {
				try {
					nombre = f.readUTF();
					System.out.println("Nombre :"+nombre);
				} catch (EOFException e) {
					System.out.println("Fin Fichero");
					fin = true;
					f.close();
				}
			} while (!fin);
		} catch (IOException e) {
			System.out.println("No se puede escribir en el archivo");
			System.exit(0);
		}
	}
	
	public void modificarArchivo() {
		try {
			BufferedReader input = new BufferedReader(
					new InputStreamReader(System.in));
			String oldName = "Brayan";
			String newName = "Stiven";
			
			System.out.println("Nombre Modificado");
			oldName = input.readLine();
			System.out.println("Nombre nuevo");
			newName = input.readLine();
			String nombre;
			
			RandomAccessFile f = new RandomAccessFile(archivo, "rw");
			boolean fin = false;
			boolean encontrado = false;
			do {
				try {
					nombre = f.readUTF();
					
					if (nombre.trim().equals(oldName)) {
						f.seek(f.getFilePointer()-22);//todas las cadenas miden 20
						
						oldName = formatearNombre(newName, 20);
						f.writeUTF(newName);
						encontrado = true;
					}
					
				} catch (EOFException e) {
					System.out.println("Fin Fichero");
					fin = true;
					f.close();
				}
			} while (!fin);
		} catch (IOException e) {
			System.out.println("No se puede escribir");
			System.exit(0);
		}
	}
	
}
