package ejercicios01;

public class EjercicioPrevio04 {

	public static void main(String[] args) {
		
		// comparar cadenas
		String cadena1 ="hola"; // 
		String cadena2 ="caracola";
		
		// compara en funcion alfabetica
		int resultado = cadena1.compareTo(cadena2);
		
		System.out.println(resultado>0?cadena1+" es mayor que "+cadena2:
			(resultado==0? cadena1+ " es igual a "+cadena2: cadena1+" es menor que "+cadena2));
		
	}

}
