package ejercicios02;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cadena");
		String cadena=input.nextLine();
		
		//crear una variable booleana (true/false)
		//que comprueba si tiene vocales
		
		// ?  "true" : "false"
		
		//CONTAINS > TIENE
		boolean contieneVocales = cadena.contains("a") || cadena.contains("e") || cadena.contains("i") || cadena.contains("o") || cadena.contains("u");
		System.out.println(contieneVocales?"contiene vocales":"no contiene vocales");
		
		//STARWITH > COMIENZA POR ()
		boolean comienzaVocal=cadena.startsWith("a") || cadena.startsWith("e") || cadena.startsWith("i") || cadena.startsWith("o") || cadena.startsWith("u");
		System.out.println(comienzaVocal?"comienza vocal":"no comienza vocal");
		
		//ENDWITH > TERMINA POR ()
		boolean terminaVocal = cadena.endsWith("a") || cadena.endsWith("e") || cadena.endsWith("i") || cadena.endsWith("o") || cadena.endsWith("u");
		System.out.println(terminaVocal?"termina vocal":"no termina vocal");
		
		//para completar este ejercicio se podr�a comparar con
		//letras sin acentos, con acentos, mayusculas sin acentos, mayusculas con acentos
		
		//usando length (puedo calcular la primera y ultima posicion) 
		//usando chartAt para comparar 
		//recordar charAt necesita para comparar =='' no "" -> =='a'

		input.close();

	}

}