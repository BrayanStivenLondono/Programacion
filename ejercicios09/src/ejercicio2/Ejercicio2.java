package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		
		ArrayList<String> listaString = new ArrayList<String>();
		
		String cadenas ="";
		
		do {
			System.out.println("Introduce la cadena");
			cadenas = input.nextLine();
			listaString.add(cadenas);
			
		} while (!cadenas.equalsIgnoreCase("fin"));
		
		//muestro
		System.out.println("\nMuestro");
		Iterator<String> iterador = listaString.iterator();
		while(iterador.hasNext()) {
			String elementos = iterador.next();
			System.out.println(elementos);
		}
		
		borrarCadena(cadenas, listaString);
		
		//muestro
		for (String i : listaString) {
			System.out.println(i);
		}
		input.close();
	}
	
	public static void borrarCadena(String cadena, ArrayList<String> lista) {
		System.out.println("\nPosicion a borrar");
		int borrar = input.nextInt();
		lista.remove(borrar);
	}
}
