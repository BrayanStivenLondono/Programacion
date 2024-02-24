package ejercicio06;

public class Principal {

	public static void main(String[] args) {
		//crear persona con 2 parametros
		//mostrar datos
		Persona usuario1 = new Persona("Juan","Valdez");//instancia
		
		System.out.println("Usuario 1");
		System.out.println("Nombre: "+usuario1.getNombre());
		System.out.println("Apellido: "+usuario1.getApellidos());

		//crear persona con 4 parametros
		//mostrar datos
		Persona usuario2 = new Persona("Juan","Gomez","1983-05-03",true);
		
		System.out.println("\nUsuario 3");
		System.out.println("Nombre: "+usuario2.getNombre());
		System.out.println("Apellido: "+usuario2.getApellidos());
		System.out.println("fecha nacimiento: "+usuario2.getFechaNacimiento());
		System.out.println("Es hombre: "+usuario2.isEsHombre());
	
		//crear persona con 6 parametros
		//mostrar datos
		Persona usuario3 = new Persona("Maria","Gonzales","1983-05-03",false, 1.50,59);

		System.out.println("\nUsuario 3");
		System.out.println("Nombre: "+usuario3.getNombre());
		System.out.println("Apellido: "+usuario3.getApellidos());
		System.out.println("fecha nacimiento: "+usuario3.getFechaNacimiento());
		System.out.println("Es hombre: "+usuario3.isEsHombre());//boolean es diferente
		System.out.println("Altura: "+usuario3.getAltura());
		System.out.println("Peso: "+usuario3.getPeso());
	}

}
