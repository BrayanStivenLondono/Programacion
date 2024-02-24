package ejercicios14;

import ejercicios10.Ejercicio10;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Interger.parseInt("123");
		int numero1 = Ejercicio14.deCadenaEntero("23224");
		int numero2 = Ejercicio14.deCadenaEntero("2-4");
		
		System.out.println(numero1);
		System.out.println(numero2);
		

	}
	private static int deCadenaEntero (String cadena) {
		int resultado =0;
		
		if (Ejercicio10.esEntero(cadena));
		
		int exponente =0;
		//345
		//-346
		//el for llega hasta el caracter 0, pero no lo evalua
		
		for (int i=cadena.length()-1; i>0; i--) {
			resultado += (cadena.charAt(i)-48)*(int)Math.pow(10,exponente);
			
		}
		if (cadena.charAt(0)=='-') {
			resultado = -resultado;
		} else {
			resultado += (cadena.charAt(0)-48)*(int)Math.pow(10,exponente);
		}
		return resultado;
	}
}
