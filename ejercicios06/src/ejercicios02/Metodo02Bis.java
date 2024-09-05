package ejercicios02;

public class Metodo02Bis {

	public static void main(String[] args) {
		System.out.println("Maximo "+Metodo02.maximo(4,6));
		System.out.println("Minimo "+Metodo02.minimo(3,7));
		
		/* otra forma
		 * 
		 * int max = Metodos02.meximo(4,6);
		 * int min = metodos02.minimo(3,7);
		 */
	}
	static int maximo (int numero1, int numero2) {
		int mayor;
		if (numero1>numero1) {
			mayor = numero1;
		} else {
			mayor = numero2;
		}
		return mayor;
	}
	static int minimo (int numero1, int numero2) {
		int menor;
		if (numero1<numero2) {
			menor = numero1;
		} else {
			menor = numero2;
		}
		return menor;
	}

}
