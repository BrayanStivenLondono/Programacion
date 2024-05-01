package ficherossecuenciales;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirVariasLineasFicheroSecuencial2 {

	//creamos una variable para guardar el nombre del archivo
	public static String archivo = "datos1.txt";
	
	public static void main(String[] args) {
		
		//1. abrimos fichero para escribir
		PrintWriter fichero;
		try {
			Scanner input = new Scanner(System.in);
			fichero = new PrintWriter(new FileWriter(archivo,true));
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
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
