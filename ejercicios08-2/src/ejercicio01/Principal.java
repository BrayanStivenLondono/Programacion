package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Profesor profe1 = new Profesor ("Juan","Gomez",30,"DAW");
		Profesor profe2 = new Profesor ("Pedro","Gonzales",45,"ASIR");
		Profesor profe3 = new Profesor ("Maria","Lopez",40,"DAM");
		Profesor profe4 = new Profesor ("Eva","Morales",44,"DAW");
		
		System.out.println("\nProfesor 1");
		System.out.println("Nombre: "+profe1.getNombre());
		System.out.println("edad "+profe1.getApellido());
		System.out.println("ciclo "+profe1.getEdad());
		System.out.println("Nombre "+profe1.getCiclo());
		
		System.out.println("\nProfesor 2");
		System.out.println("Nombre "+profe2.getNombre());
		System.out.println("edad "+profe2.getApellido());
		System.out.println("ciclo "+profe2.getEdad());
		System.out.println("Nombre "+profe2.getCiclo());
		
		System.out.println("\nProfesor 3");
		System.out.println("Nombre "+profe3.getNombre());
		System.out.println("edad "+profe3.getApellido());
		System.out.println("ciclo "+profe3.getEdad());
		System.out.println("Nombre "+profe3.getCiclo());
		
		System.out.println("\nProfesor 4");
		System.out.println("Nombre "+profe4.getNombre());
		System.out.println("edad "+profe4.getApellido());
		System.out.println("ciclo "+profe4.getEdad());
		System.out.println("Nombre "+profe4.getCiclo());
	}
}
