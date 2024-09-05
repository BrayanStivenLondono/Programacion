package ejercicios05;

public class Ejercicio02 {
    final static String MENSAJE = "Fin del programa";
	public static void main(String[] args) {
		// Programa que muestre los números del 100 al 1 utilizando la instrucción while.
		
		// WHILE (condicion) {
		// Hace algo 
		// }
		// Condicion esta antes de entrar
		
		int numero = 100;
		while (numero>0) {
			System.out.println(numero);
			numero--; // numero=numero-1;
			
		}
		// Si pusiera el mensaje dentro del while lo repetiria 100 veces
		System.out.println(MENSAJE);
		

	}

}
