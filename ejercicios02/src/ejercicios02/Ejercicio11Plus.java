package ejercicios02;

import java.util.Scanner;

public class Ejercicio11Plus {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una cadena");
		String cadena=input.nextLine();
	
		//crear una variable booleana (true/false)
		//que comprueba si tiene vocales
		//cadena.contains("texto") permite comprobar si contiene una cadena
		boolean contieneVocales=cadena.contains("a")||cadena.contains("e")||
				cadena.contains("i")||cadena.contains("o")||cadena.contains("u");
		System.out.println(contieneVocales?"contiene vocales":"no contiene vocales");
		
		//comienza por -> cadena.charAt(0)=='a' ....
		boolean comienzaVocal=cadena.charAt(0)=='a'||cadena.charAt(0)=='e'||
				cadena.charAt(0)=='i'||cadena.charAt(0)=='o'||cadena.charAt(0)=='u';
		System.out.println(comienzaVocal?"comienza vocal":"no comienza vocal");
		
		//posicion final -> cadena.length()-1
		//cadena.charAt(posicionFinal)
		int posicionFinal=cadena.length()-1;
		boolean terminaVocal=cadena.charAt(posicionFinal)=='a'||cadena.charAt(posicionFinal)=='e'||
				cadena.charAt(posicionFinal)=='i'||cadena.charAt(posicionFinal)=='o'||
				cadena.charAt(posicionFinal)=='u';
		System.out.println(terminaVocal?"termina vocal":"no termina vocal");
		//para completar este ejercicio se podr�a comparar con
		//letras sin acentos, con acentos, mayusculas sin acentos, mayusculas con acentos
		
		
		
		
		input.close();

	}

}
