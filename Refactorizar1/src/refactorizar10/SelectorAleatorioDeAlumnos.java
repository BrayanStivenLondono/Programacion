package refactorizar10; //cambio el nombre del paquete al correcto refactoriza10

import refactorizar10_1.MetodoSelectorPersonaAleatoria;

public class SelectorAleatorioDeAlumnos {
	public static final int CANTIDAD_ALUMNOS = 6;

	public static void main(String[] args) {
		// hago una constante con el tama�o del vector alumnos y ajusto el vector para que sea mas legible a primera vista
		String[] alumnos = {
				"Adri�n Aguilar",
				"Manuel Alc�ntara",
				"Jorge Alcaraz",
				"Joaqu�n Bello",
				"Mar�a Margarita Ben�tez",
				"Francisco Casasola"};
	
		
		MetodoSelectorPersonaAleatoria.alumnoElegidoAleatoriamente(alumnos);
	}

}
