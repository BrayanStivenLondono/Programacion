package ejerciciosprevios;

public class EjercicioPrevio06 {

	public static void main(String[] args) {
		//declaramos vector de tamaño 3
		int [] numeros = new int [3];
		
		//introducir valores
		
		numeros [0] = 25;
		numeros [1] = 44;
		numeros [2] = 33;
		//llamo a metodos para mostrar el valor
		mostrarNumeros(numeros); //sin corchete []
	}
	static void mostrarNumeros (int [] vectorNum) {
		for (int i=0; i<vectorNum.length; i++) {
			System.out.print(vectorNum[i]+ " "); //igual a Chart(i)
		}
		
	}

}
