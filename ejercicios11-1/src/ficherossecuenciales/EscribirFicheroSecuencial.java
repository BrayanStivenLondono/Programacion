package ficherossecuenciales;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFicheroSecuencial {

	//creamos una variable para guardar el nombre del archivo
	public static String archivo = "datos.txt";
	
	public static void main(String[] args) {
		
		try {
			//1. abrimos fichero para escribir
			PrintWriter fichero = new PrintWriter(new FileWriter(archivo,true));
			Scanner input = new Scanner(System.in);
			//2. escribir en el fichero
			System.out.print("Dame la cadena a guardar: //1. abrimos fichero para escribir//1. abrimos fichero para escribir//1. abrimos fichero para escribir");
			String linea = input.nextLine();
			
			fichero.print("\n"+linea);//para que salte
			
			//3. cierro el fichero
			input.close();
			fichero.close();
		} catch (IOException e) {
			System.err.println("Error de entrada salida");
		}
	}
}
