package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Colegio;
import clases.Profesor;

public class ColegioTest {
static Colegio cole = new Colegio();
	
	@BeforeAll
	public static void insertarProfesoresAsignaturas() {
		cole.altaAsignatura("asi1", "Español");
		cole.altaAsignatura("asi2", "Ingles");
		cole.altaAsignatura("asi3", "Arte");
		cole.altaProfesor("Profe1", "Juan");
		cole.altaProfesor("Profe2", "Maria");
		cole.altaProfesor("Profe3", "Luis");

	}
	@Test
	public void asignarProfesorAsignaturaTest() {
		cole.asignarProfesorAsignatura("Profe1", "asi2");
		
		assertEquals(cole.buscarProfesor("Profe1"), cole.buscarAsignatura("asi2").getProfesor());
		System.out.println(cole.buscarProfesor("Profe1"));
		System.out.println(cole.buscarAsignatura("asi2").getProfesor());
		System.out.println();
		
		
	}
	@Test
	public void asignarProfesorAsignaturaTest2() {
		cole.asignarProfesorAsignatura("Profe2", "asi3");
		
		assertNotEquals(cole.buscarProfesor("Profe2"), cole.buscarAsignatura("asi1").getProfesor());
		System.out.println(cole.buscarProfesor("Profe2"));
		System.out.println(cole.buscarAsignatura("asi3").getProfesor());
		System.out.println();
	}

	@AfterAll
	public static void mostrarProfesoresAsignaturas() {
		System.out.println("Muestro las asignatura de los profesores");
		cole.listarAsignaturas();
		System.out.println();
	}
}
