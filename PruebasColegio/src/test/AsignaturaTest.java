package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Asignatura;
import clases.Colegio;

public class AsignaturaTest {
	
	static Colegio cole = new Colegio();
	
	@BeforeAll
	public static void insertarAsignaturas() {
		cole.altaAsignatura("111", "FOL");
		cole.altaAsignatura("222", "Inglés");
		cole.altaAsignatura("333", "Sistemas");
		System.out.println();
	}
	
	@Test
	public void buscarAsignaturaTest() {
		Asignatura materia = new Asignatura("444", "Bases");
		cole.getListaAsignaturas().add(materia);
		
		assertEquals(materia, cole.buscarAsignatura("444"));
	}
	
	@Test
	public void buscarAsignaturaTest2() {
		Asignatura materia = new Asignatura("555", "Mates");
		cole.getListaAsignaturas().add(materia);
		
		assertNotEquals(materia, cole.buscarAsignatura("55555"));
	}
	
	@AfterAll
	public static void mostrarAsignaturas() {
		System.out.println("Muestro las asignaturas");
		cole.listarAsignaturas();
		System.out.println();
	}
}
