package programa;

import java.sql.SQLException;
import java.util.List;
import clases.OperacionesCrud;
import clases.Persona;

public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona(1, "Maria", "Martin", "maria@persona.com", new java.util.Date());
		Persona persona2 = new Persona(2, "Carlos", "Garcia", "carlos@persona.com", new java.util.Date());
		OperacionesCrud crud = new OperacionesCrud();
		try {
			// CREATE
			crud.insertamosPersona(persona1);
			crud.insertamosPersona(persona2);
			System.out.println("Personas insertadas en la BD");
			System.out.println("-----------------------------------------------------------------------");
			// READ
			List<Persona> personas = crud.recuperarPersonas();
			System.out.println("Recuperamos personas de la BD");
			for (Persona pers : personas) {
				System.out.println(pers);
			}
			System.out.println("-----------------------------------------------------------------------");
			// UPDATE
			System.out.println("Actualizamos primer apellido de la persona ");
			crud.actualizarPrimerApellidoPersona(persona1);
			persona1.setPrimerApellido("Apellido nuevo");
			System.out.println("Mostramos el apellido actualizado " + persona1);
			System.out.println("-----------------------------------------------------------------------");
			// READ (SOLO UNO)
			Persona tempPersona2 = crud.recuperamosPersona(2);
			System.out.println("Recuperamos persona2 de la BD " + tempPersona2);
			System.out.println("-----------------------------------------------------------------------");
			// DELETE
			crud.borramosPersona(2);
			System.out.println("Borramos persona2 de la BD ");
			System.out.println("-----------------------------------------------------------------------");
			// READ
			List<Persona> tempPersonas = crud.recuperarPersonas();
			System.out.println("Recuperamos personas de la BD. Persona2 no est�");
			for (Persona pers : tempPersonas) {
				System.out.println(pers);
			}
			System.out.println("-----------------------------------------------------------------------");
			// DELETE
			crud.borramosTodosRegistros();
			System.out.println("Borramos todos los registros de la BD. Tabla Personas");
		} catch (SQLException e) {
			System.out.println("Ha ocurrido una excepcion " + e.getMessage());
		}
	}
}
