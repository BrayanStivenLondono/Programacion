package ejerciciosexcepciones;

public class Ejercicio1SinExcepciones {

	public static void main(String[] args) {
		// CHEKED > obligatoria controlarla
		  //classNotFound, IOException, InterruptionException...
		
		// UNCHECKED > no-obligatorio controlarla
		  //StringIndexOutBoundException, ArrayIndexOutBoundException
		  //NullPointerException....
		
		int i = 3;
		int valor = i/0;
		System.out.println(valor);
	}
}
