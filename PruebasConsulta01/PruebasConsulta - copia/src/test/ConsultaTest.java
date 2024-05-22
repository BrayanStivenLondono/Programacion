package test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Consulta;

public class ConsultaTest {
	static Consulta consulta = new Consulta();

	//accerNotEquals para las negativas
	
	@BeforeAll
	public static void insertarPacientesRecetas() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos pacientes");
		consulta.altaPaciente("pac1", "Maria");
		consulta.altaPaciente("pac2", "Patricia");
		consulta.altaPaciente("pac3", "Jacinto");
		
		System.out.println("Insertaremos recetas");
		consulta.altaReceta("111","Paracetamol");
		consulta.altaReceta("222", "Ibuprofeno");
		consulta.altaReceta("333","Nolotil");
		System.out.println();
	}

	@Test
	public void asignarPacienteRecetaTest() {//positiva
		System.out.println("Asignar Paciente Receta ");
		consulta.asignarPacienteReceta("pac1", "111");                      //llamo al paciente de la receta
		assertEquals(consulta.buscarPaciente("pac1"), consulta.buscarReceta("111").getPaciente());
		
		System.out.println(consulta.buscarPaciente("pac1"));//opcional
		System.out.println(consulta.buscarReceta("111").getPaciente());//opcional
		System.out.println();
	}
	
	@Test
	public void asignarPacienteRecetaTest2() {//negativa
		System.out.println("Asignar Paciente Receta2 ");
		consulta.asignarPacienteReceta("pac2", "333");                     //no es el 222
		assertNotEquals(consulta.buscarPaciente("pac2"), consulta.buscarReceta("222").getPaciente());
		
		System.out.println(consulta.buscarPaciente("pac2"));
		System.out.println(consulta.buscarReceta("222").getPaciente());
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