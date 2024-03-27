package ejerciciosexcepciones;

public class Ejercicio6ConExcepciones {
	public static int numerador = 10;
	public static Integer demonimador = null;
	public static float division;
	
	public static void main(String[] args) {
		
		try {//llamo los metodos (donde esta el error)
			metodo1();
		} catch (NullPointerException e) {
			division = 1;
			System.out.println("Mensaje de error "+e.getMessage());
		}
	}

	public static void metodo1() throws NullPointerException {//si lo controlo desde el metodo no necesito el throws
		division = numerador/demonimador;
		System.out.println(division);
	}
}
