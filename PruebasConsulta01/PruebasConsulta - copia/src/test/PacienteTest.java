package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Consulta;
import clases.Paciente;

public class PacienteTest {
	static Consulta consulta = new Consulta();
	
	@BeforeAll
	public static void insertarPacientes() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos clientes");
		consulta.altaPaciente("11111", "Maria");
		consulta.altaPaciente("22222", "Patricia");
		consulta.altaPaciente("33333", "Jacinto");
		consulta.listarPacientes();
		System.out.println();
	}

	@Test
	public void existePacienteTest() {
		System.out.println("Test de existencia de clientes ");
		boolean resultado = consulta.existePaciente("11111");
		assertTrue(resultado);
		System.out.println("Compruebo assertTrue");
		System.out.println(resultado);
		System.out.println();
	}
	
	@Test
	public void existePacientesTest2() {
		System.out.println("Test de existencia de clientes2 ");
		boolean resultado = consulta.existePaciente("44444");
		assertFalse(resultado);
		System.out.println("Compruebo assertFalse");
		System.out.println(resultado);
		System.out.println();
	}

	@Test
	public void buscarPacientesTest() {
		System.out.println("Test de busqueda de clientes ");
		Paciente cli = new Paciente ("44444", "Andres");
		consulta.getListaPacientes().add(cli);
		assertEquals(cli, consulta.buscarPaciente("44444"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 44444");
		System.out.println(cli);
		System.out.println(consulta.buscarPaciente("44444"));
		System.out.println();
	}

	@Test
	public void buscarPacientesTest2() {
		System.out.println("Test de busqueda de clientes2 ");
		Paciente cli = new Paciente("55555", "Olga");
		consulta.getListaPacientes().add(cli);
		assertNotEquals(cli, consulta.buscarPaciente("555554"));
		System.out.println("Compruebo, muestro primero objeto cli y luego busco cliente 555554");
		System.out.println(cli);
		System.out.println(consulta.buscarPaciente("555554"));
		System.out.println();
	}
	
	@AfterAll
	public static void mostrarPacientes() {
		System.out.println("AfterAll");
		consulta.listarPacientes();
		System.out.println("Mensaje fin");
	}
}
