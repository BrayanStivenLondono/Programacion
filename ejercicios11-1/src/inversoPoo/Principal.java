package inversoPoo;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		String nombreArchivo="datos.txt";
		Archivo miArchivo = new Archivo(nombreArchivo);
		miArchivo.crearArchivoInvertido();
		
		System.out.println("Visualizar archivo origen");
		Archivo.visualizarArchivo(nombreArchivo);
		System.out.println("Visualizar archivo destino");
		Archivo.visualizarArchivo("nombreInvertido.txt");

	}

}
