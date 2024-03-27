package ejerciciosexcepciones;

public class Ejercicio1ConExcepciones {

	public static void main(String[] args) {
		// CHEKED > obligatoria controlarla
		  //classNotFound, IOException, InterruptionException...
		
		// UNCHECKED > no-obligatorio controlarla
		  //StringIndexOutBoundException, ArrayIndexOutBoundException
		  //NullPointerException....
		
		int i;
		int valor;
		i = 3;
		valor = i/0;
		System.out.println(valor);

	}

}
