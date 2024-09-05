package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		int numeroAleatorio = 0;
		for (int i = 0; i < 100; i++) {
            numeroAleatorio = (int)(Math.random()*20)+1; // Número aleatorio entre 1 y 20
            listaEnteros.add(numeroAleatorio);
        }
		for (Integer i : listaEnteros) {
			System.out.println(i);
		}
		//borro itearado
		Iterator<Integer> iterador = listaEnteros.iterator();
		while(iterador.hasNext()) {
			int borrador = iterador.next();
			if (borrador>=10 && borrador<=15) {
				iterador.remove();
			}
		}
		
		System.out.println("\nMuestro");
		for (Integer i : listaEnteros) {
			System.out.println(i);
		}
	}
}
