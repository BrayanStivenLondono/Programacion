package ejerciciosexcepciones;

public class Ejercicio6ConExcepciones2 {

	public static int numerador = 10;
	public static Integer denominador = null;
	public static float division;

	public static void main(String[] args) {
		metodo1();
	}

	public static void metodo1() {
		try {
			division = numerador / denominador;
			System.out.println(division);
		} catch (NullPointerException e) {
			System.out.println("Error dato nulo");
		}

	}
}
