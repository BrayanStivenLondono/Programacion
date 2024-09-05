package ejercicio03;

public class Metodo03 {
	
	public static void rellenarNumPrimosAleatorioArray(int[] vector, int a, int b) {
		int i=0;
		// Usamos mejor un while, ya que solo aumentara cuando genere un primo
		while (i<vector.length) {
			int num = ((int) Math.floor(Math.random()*(a-b)+b));
			if (esPrimo(num)) {
				vector[i] = num;
				i++;
			}
		}
	}

	public static boolean esPrimo(int num) {
		boolean esPrimo = true;
		for(int i=2; i<num; i++){
			if(num%i==0){
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}

	public static void mostrarArray(int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println("En el indice "+i+" esta el valor "+vector[i]);
		}
	}

	public static int mayor(int[] vector) {
		int mayor = 0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		return mayor;
	}

}
