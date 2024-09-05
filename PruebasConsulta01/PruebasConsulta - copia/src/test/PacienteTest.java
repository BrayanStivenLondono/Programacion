package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import clases.Paciente;
import clases.Consulta;

public class PacienteTest {

	static Consulta consulta = new Consulta();
	
	//accerNotEquals para las negativas

	
	/*@BeforeAll
	public static void insertarPacientes() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos pacientes");
		miConsulta.altaPaciente("pac1", "Maria");
		miConsulta.altaPaciente("pac2", "Patricia");
		miConsulta.altaPaciente("pac3", "Jacinto");
		miConsulta.listarPacientes();
		System.out.println();
	}*/
	
	@BeforeEach
	public void insertarPacientes() {
		System.out.println("BeforeEach");
		System.out.println("Insertaremos pacientes");
		consulta.altaPaciente("pac1", "Maria");
		consulta.altaPaciente("pac2", "Patricia");
		consulta.altaPaciente("pac3", "Jacinto");
		System.out.println();
	}
	
	@AfterEach
	public void limpiarPacientes() {
		consulta.getListaPacientes().clear();
	}
	
	@Test
	public void existePacienteTest() {//positiva
		assertTrue(consulta.existePaciente("pac1"));
		System.out.println();
	}
	
	@Test
	public void existePacienteTest2() {//negativa
		assertFalse(consulta.existePaciente("pac5"));//el pac5 no existe
		System.out.println();
	}

	@Test
	public void buscarPacientesTest() {//positiva
		Paciente paciente = new Paciente("pac4", "Andres");//lo creo
		consulta.getListaPacientes().add(paciente);//lo agrego a las lista
		
		assertEquals(paciente, consulta.buscarPaciente("pac4"));
		System.out.println();
	}

	@Test
	public void buscarProfesoresTest2() {//negativa
		Paciente pac = new Paciente("pac5", "Olga");
		consulta.getListaPacientes().add(pac);
		
		assertNotEquals(pac, consulta.buscarPaciente("pac55"));
		System.out.println();
	}
	
	@Test
	public void altaPacienteTest() {//existe paciente positiva
		int numPacientesAnterior = consulta.getListaPacientes().size();
		consulta.altaPaciente("123", "Guillermo");
		//Compruebo que ahora hay uno más que antes en la lista
		assertEquals(numPacientesAnterior+1, consulta.getListaPacientes().size());
		//Compruebo que los datos del último son los que he puesto
		assertEquals("Guillermo", consulta.getListaPacientes().get(numPacientesAnterior).getNombre());
		assertEquals("123", consulta.getListaPacientes().get(numPacientesAnterior).getCodPaciente());
	}
	
	@Test
	public void altaPacienteTest2() {//existe paciente negativa
		int numPacientesAnterior = consulta.getListaPacientes().size();
		consulta.altaPaciente("1234", "Federico");
		//Comprueba que no se ha borrado la consulta... Mucho la hemos
			//liado si nuestro código hace eso
		assertNotNull(consulta);
		//Compruebo que no he sobreescrito los datos del paciente anterior
		assertNotEquals("1234",consulta.getListaPacientes().get(numPacientesAnterior-1).getCodPaciente());
	}
	
	@Test
	public void altaPacienteTest3() {
		int numPacientesAnterior = consulta.getListaPacientes().size();
		consulta.altaPaciente("pac1", "Marta");
		//Compruebo que la lista sigue siendo del mismo tamaño
		assertEquals(numPacientesAnterior, consulta.getListaPacientes().size());
		//Compruebo que el nombre sigue siendo Maria
		assertEquals("Maria",consulta.getListaPacientes().get(0).getNombre());
	}
	
	@Test
	public void altaPacienteTest4() {
		int numPacientesAnterior = consulta.getListaPacientes().size();
		consulta.altaPaciente("pac1", "Marta");
		//Compruebo que la lista sigue siendo del mismo tamaño
		assertEquals(numPacientesAnterior, consulta.getListaPacientes().size());
		//Compruebo que el nombre sigue siendo Maria
		assertEquals("Maria", consulta.getListaPacientes().get(0).getNombre());
	}
	
	@AfterAll
	public static void mostrarPacientes() {
		System.out.println("AfterAll");
		consulta.listarPacientes();
		System.out.println("Mensaje fin");
	}
}