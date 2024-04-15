package ejercicio07;

public class Ejercicio07 {

	public static void main(String[] args) {
		ListaPersonas lista = new ListaPersonas();
		lista.add(null);
		
		lista.add(1,new Persona("Juan","12345"));
		lista.add(1,new Persona("Maria","12345"));
		lista.add(1,new Persona(null,null));
		lista.add(1,new Persona("Pedro","12345"));
		
		for (Persona i : lista) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("toString de ArrayList");
		System.out.println(lista);
	}
	
}
