package ejercicio05;

public class Principal {

	public static void main(String[] args) {
		Profesor profe1 = new Profesor ("Juan","Gomez",30,"DAW");
		Profesor profe2 = new Profesor ("Pedro","Gonzales",45,"ASIR");
		Profesor profe3 = new Profesor ("Maria","Lopez",40,"DAM");
		Profesor profe4 = new Profesor ("Eva","Morales",44,"DAW");
		
		System.out.println("\nProfe 1");
		profe1.mostrarDatosProfesor(profe1);
		System.out.println("\nProfe 2");
		profe2.mostrarDatosProfesor(profe2);
		System.out.println("\nProfe 3");
		profe3.mostrarDatosProfesor(profe3);
		System.out.println("\nProfe 4");
		profe4.mostrarDatosProfesor(profe4);
		
		ProfesorTitular profesor1 = new ProfesorTitular("Luis","Gonzales",45,"ASIR",15);
		System.out.println("\nProfesor titular");
		profesor1.mostrarDatosProfesor(profesor1);
		
		ProfesorInterino profesor2 = new ProfesorInterino("Rodrigo","Berenguer",30,"DAW",10);
		System.out.println("\nProfesor interino");
		profesor2.mostrarDatosProfesor(profesor2);
		
		System.out.println("\nSalario titular: "+profesor1.obtenerSalarioBase());
		System.out.println("Salario interino: "+profesor2.obtenerSalarioBase());
		
	}
}
