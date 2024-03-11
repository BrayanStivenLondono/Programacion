package refactorizar10; //cambio el nombre del paquete al correcto refactoriza10

import refactorizar10_1.MetodoSelectorPersonaAleatoria;

public class SelectorAleatorioDeAlumnos {
	public static final int CANTIDAD_ALUMNOS = 6;

	public static void main(String[] args) {
		// hago una constante con el tamaño del vector alumnos y ajusto el vector para que sea mas legible a primera vista
		String[] alumnos = {
				"Adrián Aguilar",
				"Manuel Alcántara",
				"Jorge Alcaraz",
				"Joaquín Bello",
				"María Margarita Benítez",
				"Francisco Casasola"};
	
		
		MetodoSelectorPersonaAleatoria.alumnoElegidoAleatoriamente(alumnos);
	}

}
