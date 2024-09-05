package ejercicio12;

public class Ejercicio12 {

	public static void main(String[] args) {
		int[] vector = {1,2,3,4,5};
		int[] vectorInvertido = Ejercicio12.invertirVector(vector);
		
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
		for (int i=0; i<vector.length; i++) {
			System.out.print(vectorInvertido[i]+" ");
		}
	}
	public static int[] invertirVector (int[] numeros) {
		int[] vectorInvertido = new int[numeros.length];
		
		int indiceVector =0;
		
		for (int i=numeros.length-1; i>=0; i--) {
			vectorInvertido[indiceVector++] = numeros[i];
		}
		return vectorInvertido;
	}
}
