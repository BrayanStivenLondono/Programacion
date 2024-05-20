package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Consulta;
import clases.Paciente;

public class PacienteTest {
	static Consulta c = new Consulta();
	
	@BeforeAll
	public static void insertarPacientes() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos pacientes");
		c.altaPaciente("pac1", "Maria");
		c.altaPaciente("pac2", "Patricia");
		c.altaPaciente("pac3", "Jacinto");
		c.listarPacientes();
		System.out.println();
	}

	@Test
	public void existePacienteTest() {
		System.out.println("Test de existencia de paciente ");
		boolean resultado = c.existePaciente("pac1");
		assertTrue(resultado);
		System.out.println("Compruebo assertTrue");
		System.out.println(resultado);
		System.out.println();
	}
	
	@Test
	public void existePacientesTest2() {
		System.out.println("Test de existencia de 22222 ");
		boolean resultado = c.existePaciente("44444");
		assertFalse(resultado);
		System.out.println("Compruebo assertFalse");
		System.out.println(resultado);
		System.out.println();
	}

	@Test
	public void buscarPacientesTest() {
		System.out.println("Test de busqueda de clientes ");
		Paciente cli = new Paciente ("44444", "Andres");
		c.getListaPacientes().add(cli);
		assertEquals(cli, c.buscarPaciente("44444"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 44444");
		System.out.println(cli);
		System.out.println(c.buscarPaciente("44444"));
		System.out.println();
	}

	@Test
	public void buscarPacientesTest2() {
		System.out.println("Test de busqueda de clientes2 ");
		Paciente cli = new Paciente("55555", "Olga");
		c.getListaPacientes().add(cli);
		assertNotEquals(cli, c.buscarPaciente("555554"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 555554");
		System.out.println(cli);
		System.out.println(c.buscarPaciente("555554"));
		System.out.println();
	}
	@Test
	public void altaPacienteTest() {//positiva
		//cuando se introduce uno nuevo el tamaño del vector aumenta 1
		int pacienteAnterior = c.getListaPacientes().size();
		c.altaPaciente("111", "Juan");
		assertEquals(pacienteAnterior+1, c.getListaPacientes().size());
		assertEquals("Juan", c.getListaPacientes().get(pacienteAnterior).getNombre());
		assertEquals("111", c.getListaPacientes().get(pacienteAnterior).getCodPaciente());
		
	}
	
	
	public void altaPacienteTest2() {//negativa
		//comprobamos que el anterior sea diferente
		//o que no se haya sobreescrito
		int pacienteAnterior = c.getListaPacientes().size();
		c.altaPaciente("111", "Juan");
		assertNotNull(c);
		assertNotEquals("1234", c.getListaPacientes().get(pacienteAnterior-1).getCodPaciente());
	}
	
	public void altaPacienteTest3() {
		int pacienteAnterior = c.getListaPacientes().size();
		c.altaPaciente("pac1", "Maria");
		//compruebo que la lista es del mismo tamaño
		assertEquals(pacienteAnterior, c.getListaPacientes().get(0).getNombre());
		//compruebo que el nombre sigue siendo maria
		assertEquals("Maria", c.getListaPacientes().get(0).getNombre());
		
	}
	/*  
	@AfterAll
	public static void mostrarPacientes() {
		System.out.println("AfterAll");
		consulta.listarPacientes();
		System.out.println("Mensaje fin");
	} */
}
