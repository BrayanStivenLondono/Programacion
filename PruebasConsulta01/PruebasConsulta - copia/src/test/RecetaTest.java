package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Receta;
import clases.Consulta;

public class RecetaTest {

	static Consulta consulta = new Consulta();
	
	//accerNotEquals para las negativas

	@BeforeAll
	public static void insertarAsignaturas() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos recetas");
		consulta.altaReceta("111", "Paracetamol");
		consulta.altaReceta("222", "Ibuprofeno");
		consulta.altaReceta("333", "Nolotil");
		System.out.println();
	}

	@Test
	public void buscarRecetasTest() {//positivo
		Receta rec = new Receta("444", "Reflex");
		consulta.getListaRecetas().add(rec);
		
		assertEquals(rec, consulta.buscarReceta("444"));
		System.out.println();
	}
	
	@Test
	public void buscarRecetasTest2() {//negativo
		Receta rec = new Receta("555", "Acetaminofen");
		consulta.getListaRecetas().add(rec);
		
		assertNotEquals(rec, consulta.buscarReceta("55555"));
		System.out.println();
	}

	@AfterAll
	public static void mostrarRecetas() {
		System.out.println("AfterAll");
		consulta.listarRecetas();
		System.out.println("Mensaje fin");
	}
}
