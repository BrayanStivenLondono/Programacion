import java.util.Scanner;

public class ClasseString06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Creacion de una cadena String
		String cadena = "Hola mundo";
		
		// Los Strings son objetos, por lo que adem�s de un estado (valor)... 
		//..tienen unas operaciones (m�todos)
		
		// Los m�todos (o funciones) son un tipo de instrucci�n que puede..
		//..devolver (dar como resultado) un valor de un tipo de datos,
		// funcionar. Los valores que reciben los m�todos se conocen como par�metros, 
		// escriben entre los par�ntesis finales de la llamada al m�todo m�todo.
		
		// lenght(). 
		//devuelve el numero de caracteres de una cadena (int)
		
		//mostrar longitud con un int
		System.out.println(cadena.length() ); //Res. 10 (caracteres) (Hola Mundo)
        
		//mostrar el caracter de 4 de la cadena
		System.out.println(cadena.charAt(3)); // a
		System.out.println();
		
		// OPERADOR DE CONCATENACION.
		// el operador + permite unir cadenas 
		String cadena1 = "mi";
		String cadena2 = "primer";
		String cadena3 = cadena1+cadena2+"programa"; // mi primer programa

		
	

		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
