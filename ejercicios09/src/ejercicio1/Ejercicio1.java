package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		ArrayList<String> listaString = new ArrayList<String>();
		
		System.out.println("Cantidad de ArrayList");
		int cantidad = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i <cantidad; i++) {
			System.out.println("\nIntroduce la cadena "+(i+1));	
			String cadenas = input.nextLine();
			listaString.add(cadenas);
		}
		//Muestro
		for (String i : listaString) {
			System.out.println(i+" ");
		}
		//borro
		System.out.println("\nCual posicion deseas borrar");
		int posicionABorrar = input.nextInt();
		listaString.remove(posicionABorrar-1);
		
		//muestro actalizado
		for (int i = 0; i < listaString.size(); i++) {
			System.out.println(listaString.get(i)+" ");
		}
		//extra (borro el arrayList)
		System.out.println("\nLo borro");
		listaString.clear();
		
		input.close();
				
	}

}
