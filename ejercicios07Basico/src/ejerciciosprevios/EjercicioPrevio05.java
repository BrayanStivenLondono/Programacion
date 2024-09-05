package ejerciciosprevios;

public class EjercicioPrevio05 {

	public static void main(String[] args) {
		// vector con datos directamente
		// pidiendo y dando valor a la vez. || numero [1] = 3; (el espacio 1 vale 3)
		
		int [] numeros = {1,2,3,4,5};
		
		char [] letras = {'a','e','i','o'};

		String [] cadena = {"Zaragoza"};
		
		//mostrar datos
		
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<letras.length; i++) {
			System.out.print(letras[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<cadena.length; i++) {
			System.out.print(cadena[i]+ " ");
		}

				

	}

}
