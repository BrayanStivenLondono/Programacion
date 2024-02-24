package ejercicios09;

import ejercicios08.Metodo08;

public class Metodo09 {
	 static String palabraAleatoria (int longitud) {
	String cadena = "";
		
		for (int i=0; i<longitud; i++) {
			
		cadena = cadena+(char)Metodo08.aleatorio(65, 90);
		
		}
		return cadena;
				
	}
	
}
