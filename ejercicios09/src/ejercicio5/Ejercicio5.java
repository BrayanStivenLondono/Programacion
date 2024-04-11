package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		ArrayList<String> listaCadenas = new ArrayList<String>();
		
		 listaCadenas.add("hola");
	     listaCadenas.add("mundo");
	     listaCadenas.add("hola");
	     listaCadenas.add("hola");
	     listaCadenas.add("adios");
	     listaCadenas.add("hola");
		
		System.out.println("Cadena a borrar ?");
		String cadenaBorrada = input.next();
		
		Ejercicio5.borrarCadenas(cadenaBorrada, listaCadenas);
		
		//muestro
		System.out.println("\nMuestro");
		for (String i : listaCadenas) {
			System.out.println(i);
		}
		
		input.close();
	}
	public static void borrarCadenas(String cadena, ArrayList<String> lista) {
		Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equals(cadena)) {
                iterador.remove();
              
            }
        }
        /* for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(cadena)) {
                lista.remove(i);
                i--; */
	}
}
