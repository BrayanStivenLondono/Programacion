package ejerciciosexcepciones;

public class Ejercicio4ConExcepciones {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("B");
			System.out.println(numero);
			
		} catch (NumberFormatException e) { //err sale en rojo
			System.err.println("Cadena no se puede convertir a Int");
		}
	}
}
