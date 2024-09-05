package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio4 {

	public static void main(String[] args) {//igual al ejercicio3
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		int numeroAleatorio = 0;
		for (int i = 0; i < 100; i++) {
			numeroAleatorio = (int)(Math.random()*20)+1;
			listaEnteros.add(numeroAleatorio);
		}
		//recorro y muestro
		for (Integer i : listaEnteros) {
			System.out.println(i);
		}
		//borro con iterator
		Iterator<Integer> iterador = listaEnteros.iterator();
		while(iterador.hasNext()) {
			int borrados = iterador.next();
			if (borrados>=10 && borrados<=15) {
				iterador.remove();
			}
		}
		//Muestro
		System.out.println("\nMuestro");
		for (int i = 0; i < listaEnteros.size(); i++) {
			System.out.println(listaEnteros.get(i));
		}
	}
}
