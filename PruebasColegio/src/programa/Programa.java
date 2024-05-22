
package programa;

import clases.Colegio;

public class Programa {

	public static void main(String[] args) {
		Colegio miCole = new Colegio();

		System.out.println("Alta profesor1");
		miCole.altaProfesor("prof1", "Andres");
		System.out.println("Alta profesor2");
		miCole.altaProfesor("prof2", "Carlota");
		System.out.println("Alta profesor ya existente");
		miCole.altaProfesor("prof1", "Maria");
		System.out.println();
		
		System.out.println("Listar profesores");
		miCole.listarProfesores();
		System.out.println();

		System.out.println("Buscar profesor prof1");
		System.out.println(miCole.buscarProfesor("prof1"));
		System.out.println("Buscar profesor prof11");
		System.out.println(miCole.buscarProfesor("prof11"));
		System.out.println();

		System.out.println("Alta asignatura1");
		miCole.altaAsignatura("Prog", "Programacion");
		System.out.println("Alta asignatura2");
		miCole.altaAsignatura("Ent", "Entornos de desarrollo");
		System.out.println("Alta asignatura3");
		miCole.altaAsignatura("Sis", "Sistemas informáticos");
		System.out.println();
		
		System.out.println("Listar asignaturas");
		miCole.listarAsignaturas();		
		System.out.println();
		
		System.out.println("Asignar profesor prof1 a asignatura1");
		miCole.asignarProfesorAsignatura("prof1", "Prog");
		System.out.println("Asignar profesor prof2 a asignatura2");
		miCole.asignarProfesorAsignatura("prof2", "Ent");
		System.out.println();
	
		System.out.println("Listar asignaturas");
		miCole.listarAsignaturas();		
		System.out.println();
	}
}

