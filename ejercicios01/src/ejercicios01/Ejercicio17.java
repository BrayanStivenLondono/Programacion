package ejercicios01;

public class Ejercicio17 {

	public static void main(String[] args) {
		// String cadena1 = "23";
		String cadena1 = "Mundo";
		String cadena2 = "Hola";
		
		
		// compara en funcion del alfabeto
		int resultado =cadena1.compareTo(cadena2);
         
	    System.out.println(resultado>0? cadena1 +" es mayor que " + cadena2 
	    		:(resultado == 0? cadena1 + "es igual a" + cadena2 
	    		        : cadena1 + "es menor que" + cadena2));
	    
	}

}
