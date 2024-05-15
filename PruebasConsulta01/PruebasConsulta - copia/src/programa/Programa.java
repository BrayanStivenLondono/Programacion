
package programa;

import clases.Consulta;

public class Programa {

	public static void main(String[] args) {
		Consulta miConsulta = new Consulta();

		System.out.println("Alta paciente1");
		miConsulta.altaPaciente("pac1", "Andres");
		System.out.println("Alta paciente2");
		miConsulta.altaPaciente("pac2", "Carlota");
		System.out.println("Alta paciente ya existente");
		miConsulta.altaPaciente("pac1", "Maria");
		System.out.println();
		
		System.out.println("Listar pacientes");
		miConsulta.listarPacientes();
		System.out.println();

		System.out.println("Buscar paciente pac1");
		System.out.println(miConsulta.buscarPaciente("pac1"));
		System.out.println("Buscar paciente pac11");
		System.out.println(miConsulta.buscarPaciente("pac11"));
		System.out.println();

		System.out.println("Alta receta1");
		miConsulta.altaReceta("111", "Ibuprofeno");
		System.out.println("Alta receta2");
		miConsulta.altaReceta("222", "Paracetamol");
		System.out.println("Alta receta3");
		miConsulta.altaReceta("333", "Nolotil");
		System.out.println();
		
		System.out.println("Listar recetas");
		miConsulta.listarRecetas();		
		System.out.println();
		
		System.out.println("Asignar paciente pac1 a receta1");
		miConsulta.asignarPacienteReceta("pac1", "111");
		System.out.println("Asignar paciente pac2 a receta2");
		miConsulta.asignarPacienteReceta("pac2", "222");
		System.out.println();
	
		System.out.println("Listar recetas");
		miConsulta.listarRecetas();		
		System.out.println();
	}
}

