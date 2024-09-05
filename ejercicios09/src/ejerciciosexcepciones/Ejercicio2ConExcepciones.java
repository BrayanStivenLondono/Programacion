package ejerciciosexcepciones;

public class Ejercicio2ConExcepciones {

	public static void main(String[] args) {
		String[] cadena = {
				"cadena1",
				"cadena2",
				"cadena3",
				"cadena4" };
		try {
			for (int i = 0; i <=4; i++) {
				System.out.println(cadena[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nError fuera del indice del Array");
		} finally {
			System.out.println("Esto se imprime siempre");

		}
	}
}
