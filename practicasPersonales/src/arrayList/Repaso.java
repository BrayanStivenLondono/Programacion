package arrayList;

import java.util.ArrayList;

public class Repaso {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		// Añadir elementos directamente
		String nombre = "Kevin";
		lista.add("hola");
		lista.add("mundo");
		lista.add("brayan");
		
		// Lo añado en una posicion
		lista.add(3,"adios");
		lista.add(1,nombre);
		
		// Lo busco con su posicion
		System.out.println(lista.get(2));
		
		// Comprobar si EXISTE
		System.out.println();
		System.out.println(lista.contains("brayan"));//true
		
		System.out.println();
		for (String i : lista) {
			System.out.println(i);
		}
		System.out.println();
		// Copio un Array a otro
		@SuppressWarnings({"unchecked"})//evito el warning
		ArrayList<String> copia = (ArrayList<String>) lista.clone();
		for (String i : copia) {
			System.out.println(i);
		}
		
		System.out.println();
		// Muestro su tamaño
		System.out.println(lista.size());
		
		// Paso un ArrayList a uno normal
		String[] array = new String[copia.size()];
		array = copia.toArray(array);
		
		// Elimino su contenido
		lista.clear();
		
		System.out.println();
		// Compruebo si esta vacio (true || false) syso
		System.out.println(lista.isEmpty());
	}
}
