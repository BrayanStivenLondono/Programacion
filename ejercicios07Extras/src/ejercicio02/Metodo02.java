package ejercicio02;

public class Metodo02 {//COMPLETAR
	
	public static void rellenarArrayAleatorio (int [] vector, int a, int b) {
		for (int i=0; i<vector.length; i++) {
			vector[i] = (int)Math.floor(Math.random()*(a-b)+b);
		}
	}
	
	public static void mostrarArray (int [] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("Indice "+i+" valor "+vector[i]);
		}
	}
}
