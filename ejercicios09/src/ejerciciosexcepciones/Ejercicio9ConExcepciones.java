package ejerciciosexcepciones;

public class Ejercicio9ConExcepciones {

	public static void main(String[] args)  {
		//creo mi propia excepcion
		try {
			comprobarDiaMes(35);
		} catch (Exception e) {
			System.out.println("Mensaje de error: "+e.getMessage());
		}

	}
	public static void comprobarDiaMes (int dia) throws Exception {
		if (dia >31 || dia<1) {
			//la creo
			Exception excepcion = new Exception ("Numero de dia fuera de rango");
			//la llevo a la  excepcion de Java
			throw excepcion;//throws sin S
		}
	}

}
