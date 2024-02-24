package ejerciciosprevios;

public class EjercicioPrevio07 {

	public static void main(String[] args) {
		
		int [] misNumeros = pedirNumeros();	
		mostrarNumeros(misNumeros);
		
		
	}
	static void mostrarNumeros (int [] vectorNum) {
		for (int i=0; i<vectorNum.length; i++) {
			System.out.print(vectorNum[i]+ " "); 
		}	
		
	}
	static int [] pedirNumeros () {
		int [] numeros = new int [3];
		
		numeros [0] = 25;
		numeros [1] = 44;
		numeros [2] = 33;
		
		return numeros;
	}

}
