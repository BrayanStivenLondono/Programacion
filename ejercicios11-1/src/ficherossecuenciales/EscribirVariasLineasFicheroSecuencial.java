package ficherossecuenciales;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirVariasLineasFicheroSecuencial {

	//creamos una variable para guardar el nombre del archivo
	public static String archivo = "datos1.txt";
	
	public static void main(String[] args) throws IOException {
		
		//1. abrimos fichero para escribir
		PrintWriter fichero = new PrintWriter(new FileWriter(archivo,true));
		Scanner input = new Scanner(System.in);
		
		//2. escribir en el fichero
		System.out.print("Escribe varias lineas (fin): ");
		String linea = input.nextLine();
		
		while(!linea.equalsIgnoreCase("fin")) {
			fichero.println("\n"+linea);
			linea = input.nextLine();
		}
		
		//3. cierro el fichero
		input.close();
		fichero.close();
	}
}
