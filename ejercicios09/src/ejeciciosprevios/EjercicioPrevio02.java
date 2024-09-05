package ejeciciosprevios;

import java.util.ArrayList;

public class EjercicioPrevio02 {

	public static void main(String[] args) {
		//array > primitivos
		//arrayList > objetos
		//primitivos > int, double, float, booleam, byte...
		//wrappers > Integer, Float, Double, Boolean, Byte...
		System.out.println("\nCreo un ArrayList");
		
		ArrayList<String> nombres = new ArrayList<String>();
		System.out.println("\nAñado y muestro");
		nombres.add("Brayan");
		nombres.add("Kevin");
		nombres.add("Andres");
		System.out.println(nombres);
		System.out.println("\nAñado uno mas");
		nombres.add(1,"Soraida");
		System.out.println(nombres);
		System.out.println("\nBorro el 0");
		nombres.remove(0);
		System.out.println(nombres);
		System.out.println("\nAgrego uno en el 0 a Brayan");
		nombres.add(0,"Brayan");
		System.out.println(nombres);
		System.out.println("\nBorro el ultimo");
		String uno = nombres.get(1);
		String ultimo = nombres.get(nombres.size()-1);
		System.out.println("\nMuestro");
		System.out.println(uno+" "+ultimo);
	}
}
