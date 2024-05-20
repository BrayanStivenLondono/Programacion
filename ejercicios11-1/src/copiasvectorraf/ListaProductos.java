package copiasvectorraf;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaProductos {
	private ArrayList<Producto> p;
	
	public ListaProductos() {
		p = new ArrayList<Producto>();
	}
	
	public void rellenarLista() {
		Scanner input = new Scanner(System.in);
		String respuesta = "";
		do {
			Producto producto = new Producto();
			producto.rellenarProducto();
			p.add(producto);
			System.out.println("Quieres continuar (si/no)");
			respuesta = input.nextLine();
		} while (respuesta.equalsIgnoreCase("si"));
	}
	
	public void visualizarLista() {
		for (Producto producto : p) {
			producto.visualizarProducto();
		}
	}
	
	public void copiarListaArchivo(String nombre) {
		try {
			RandomAccessFile f = new RandomAccessFile(nombre, "rw");
			//me pongo al final
			f.seek(f.length());//seek me posiciono
			//leo vector y vector y escribo en el archivo
			for (Producto producto : p) {
				f.writeInt(producto.getCodigo());
				f.writeDouble(producto.getPrecio());
				
				f.close();
			}
		} catch (IOException e) {
			System.out.println("No se puede escribir el producot");
			System.exit(0);
		}
	}
	
	public void visualizarArchivo(String archivo) {
		int codigo;
		double precio;
		try {
			RandomAccessFile f = new RandomAccessFile(archivo, "rw");
			boolean fin = false;
			do {
				try {
					codigo = f.readInt();//talves pida castearlo
					precio = f.readDouble();
					System.out.println("Codigo: "+codigo);
					System.out.println("Precio: "+precio);
				
				} catch (EOFException e) {
					System.out.println("Fin del Fichero");
					fin = true;
				}
			} while (!fin);
			f.close();
		
		} catch (IOException e) {
			System.out.println("No se puede escribir el producot");
			System.exit(0);
		}
	}
	public void modificarPrecioArchivo(String archivo) {
		int codigo;
		double precio;
		try {
			RandomAccessFile f = new RandomAccessFile(archivo, "rw");
			boolean fin = false;
			do {
				try {
					codigo = f.readInt();//talves pida castearlo
					precio = f.readDouble();
					
					if (precio>100) {
						//double ocupa 8 bytes
						f.seek(f.getFilePointer()-8);//Hecho para atras 8 posiciones
						//cambio
						f.writeDouble(precio-precio*50/100);
					} else {
						f.seek(f.getFilePointer()-8);//Hecho para atras 8 posiciones
						//cambio
						f.writeDouble(precio+precio*50/100);
					}
				
				} catch (EOFException e) {
					System.out.println("Fin Fichero");
					fin = true;
					f.close();
				}
			} while (!fin);
		
		} catch (IOException e) {
			System.out.println("No se puede escribir el producto");
			System.exit(0);
		}
	}
}
