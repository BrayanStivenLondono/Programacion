package refactorizar10_1;

public class MetodoSelectorPersonaAleatoria {
	public static void alumnoElegidoAleatoriamente(String[] alumnos) {
		System.out.print("Le ha tocado salir a... ");
		int alumnoAleatorio = (int) ((Math.random() * 6));
		System.out.print(alumnos[alumnoAleatorio]);
	}
}
