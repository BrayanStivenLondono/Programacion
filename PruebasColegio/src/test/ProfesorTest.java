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

public class ProfesorTest {
	static Colegio cole = new Colegio();
	
	@BeforeAll
	public static void insertarProfesores() {
		System.out.println("ALta Profesores");
		cole.altaProfesor("11", "Maria");
		cole.altaProfesor("22", "Juan");
		cole.altaProfesor("33", "Alberto");
		System.out.println();
		
	}
	
	@Test
	public void existeProfesorTest() {
		assertTrue(cole.existeProfesor("11"));
		System.out.println();
	}
	
	@Test
	public void existeProfesorTest2() {
		assertFalse(cole.existeProfesor("2222"));
		System.out.println();
	}
	
	@Test
	public void buscarProfesorTest() {
		Profesor profe = new Profesor("44","Lucia");
		cole.getListaProfesores().add(profe);
		
		assertEquals(profe, cole.buscarProfesor("44"));
	}
	
	@Test
	public void buscarProfesorTest2() {
		Profesor profe = new Profesor("55","Pedro");
		cole.getListaProfesores().add(profe);
		
		assertNotEquals(profe, cole.buscarProfesor("5555"));
	}

	@AfterAll
	public static void mostrarAsignaturas() {
		System.out.println("Muestro los profesores");
		cole.listarProfesores();
		System.out.println();
	}
}
