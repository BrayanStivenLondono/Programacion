package ejercicio06;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Ejercicio06 {

	public static void main(String[] args) {
		//clase Object; la clase padre de todo Java
		ArrayList<Object> lista = new ArrayList<>();
		
		System.out.println("Añado String");
		lista.add("hola");
		
		System.out.println("LocalTime");
		lista.add(LocalTime.now());
		
		System.out.println("Coche");//en dos pasos
		Coche coche = new Coche ("JN2-D","Mazda",5,120.6);
		lista.add(coche);
		
		System.out.println("Avion");//en un paso
		lista.add(new Avion ("1223","Airbus",2,3));
		
		System.out.println("Empleado");
		lista.add(new Empleado("Juan"));
		
		System.out.println("Boolean");
		lista.add(true);
		
		System.out.println("Muestro");
		//mi clase ahora es Object (objeto)
		for (Object objeto : lista) {
			System.out.println("\n"+objeto);
		}	
		
	}
}
