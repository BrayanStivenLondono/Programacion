package ejercicio17;

public class Ejercicio17 {

	public static void main(String[] args) {
		int[] vectorNumeros= {5,6,3,10,1};
		Ejercicio17.ordenar(vectorNumeros);
	}
	public static void ordenar (int[] vector) {
		System.out.println("Sin ordenar");
		for (int i=0; i<vector.length; i++)  {
			System.out.print(vector[i]+" ");
		}
		System.out.println();
		for (int i=0; i<vector.length-1; i++) {
			for (int j=i+1; j<vector.length; j++) {
				if (vector[j]>vector[i]) {
					int aux  = vector[i];
					vector[i]= vector[j];
					vector[j]= aux;
				}
			}
		}
		System.out.println("Ordenado");
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}	
}
