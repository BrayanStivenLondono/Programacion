package ejerciciosexcepciones;

public class Ejercicio1ConExcepciones {

	public static void main(String[] args) {
		// CHECKED > obligatoria controlarla
		  //classNotFound, IOException, InterruptionException...
		
		// UNCHECKED > no-obligatorio controlarla
		  //StringIndexOutBoundException, ArrayIndexOutBoundException
		  //NullPointerException....
		
		try {
			int i = 3;
			int valor = i/0;
			System.out.println(valor);

		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Esto se imprime siempre");
		}
		
		//try: contiene el codigo regular de nuestro programa 
		//que puede producir una excepcion en caso de error
		
		//catch: contiene el codigo con el que trataremos en error
		//en el caso de producirse
		
		//finally: este bloque contiene el codigo que se ejecuta al
		//final tanto si hay excepciones como sino
	}

}
