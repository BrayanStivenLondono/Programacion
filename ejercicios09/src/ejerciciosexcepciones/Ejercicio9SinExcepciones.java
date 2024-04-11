package ejerciciosexcepciones;

public class Ejercicio9SinExcepciones {

	public static void main(String[] args) throws Exception {
		comprobarDiaMes(35);

	}
	public static void comprobarDiaMes (int dia) throws Exception {
		if (dia >31 || dia<1) {
			Exception excepcion = new Exception ("Numero de dia fuera de rango");
			throw excepcion;
		}
	}

}
