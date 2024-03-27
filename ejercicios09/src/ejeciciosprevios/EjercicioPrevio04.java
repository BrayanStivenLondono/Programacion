package ejeciciosprevios;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioPrevio04 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		System.out.println("\nAñado elementos");
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		lista.add("Elemento 5");
		lista.add("Elemento 1");
		
		System.out.println("\nMuestros con un for (size(), no-lenght)");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));//lista.get(i)
		}
		
		System.out.println("\nMuestro con Iterator");
		//intengo el iteratos
		Iterator<String> iterador = lista.iterator();
		while (iterador.hasNext()) {//compruebo si tiene algo
			String elementos = iterador.next(); //accedo a cada elemento
			System.out.println(elementos);
		}
		
		System.out.println("\nMuestro con foreach");
		for (String i : lista) {
			System.out.println(i);
		}
		
		System.out.println("\nAñado elemento a la posicion 1");
		lista.add(1,"Elementos insertado");
		for (String i : lista) {
			System.out.println(i);
		}
		System.out.println("\nDevuelvo el numero del elementos del ArrayLista");
		System.out.println(lista.size());
		
		System.out.println("\nDevuelvo el elemento 2 del arrayList");
		System.out.println(lista.get(2));
		
		System.out.println("\nCompruebo si el elemento (Elemento 1) existe");
		System.out.println(lista.contains("Elemento 1"));
		
		System.out.println("\nDevuelve la posicion de la primera ocurrencia de Elemento 2");
		System.out.println(lista.indexOf("Elemento 2"));
		
		System.out.println("\nDevuelve la posicion de la ultima ocurrencia de Elemento 4");
		System.out.println(lista.lastIndexOf("Elemento 5"));
		
		System.out.println("\nBorro el elemento de la posicion 5");
		lista.remove(5);
		for (String i : lista) {
			System.out.println(i);
		}
		System.out.println("\nBorro el elemento 'Elemento 2' ");
		lista.remove("Elemento 2");
		
		System.out.println("\nCopia un ArrayLista a otro (clone)");
		@SuppressWarnings("unchecked")
		ArrayList<String> copiaArray = (ArrayList<String>) lista.clone();
		for (String i : copiaArray) {
			System.out.println(i);
		}
		
		System.out.println("\nPaso a ArrayList a un array normal");
		String[] array = new String[lista.size()];
		array = lista.toArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\nBorra todos los elementos del array");
		lista.clear();//elemino su contenido
		for (String i : array) {
			System.out.println(i);
		}
		
		System.out.println("\nComprueba si esta vacio el ArrayList");
		System.out.println(lista.isEmpty());
	}

}
