package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.Consulta;

public class ConsultaTest {

	static Consulta consulta = new Consulta();
	
	@BeforeAll
	public static void insertarPacienteRecetas() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos paciente");
		consulta.altaPaciente("11111", "Maria");
		consulta.altaPaciente("22222", "Patricia");
		consulta.altaPaciente("33333", "Jacinto");
		consulta.listarPacientes();
	
		System.out.println("Insertaremos recetas");
		consulta.altaReceta("Receta1", "");
		consulta.altaReceta("Receta2", "");
		consulta.altaReceta("Receta3", "");
		consulta.listarRecetas();
		System.out.println();
	}

	@Test
	public void asignarPacienteRecetasTest() {
		System.out.println("Asignar Paciente Receta ");
		consulta.asignarPacienteReceta("11111", "Receta1");
		assertEquals(consulta.buscarPaciente("11111"), consulta.buscarReceta("Receta1").getPaciente());
		System.out.println("Compruebo, muestro primero objeto con idPaciente y luego busco Receta con idPaciente");
		System.out.println(consulta.buscarPaciente("11111"));
		System.out.println(consulta.buscarReceta("Receta1").getPaciente());
		System.out.println();
	}
	
	@Test
	public void asignarPacienteRecetasTest2() {
		System.out.println("Asignar Paciente Receta2 ");
		consulta.asignarPacienteReceta("22222", "Receta2");
		assertNotEquals(consulta.buscarPaciente("22222"), consulta.buscarReceta("Receta1").getPaciente());
		System.out.println("Compruebo, muestro primero objeto con idPaciente y luego busco Receta con idPaciente");
		System.out.println(consulta.buscarPaciente("22222"));
		System.out.println(consulta.buscarReceta("Receta1").getPaciente());
		System.out.println();
	}
	
	@AfterAll
	public static void mostrarPacientesRecetas() {
		System.out.println("AfterAll");
		consulta.listarPacientes();
		consulta.listarRecetas();
		System.out.println("Mensaje fin");
	}
}