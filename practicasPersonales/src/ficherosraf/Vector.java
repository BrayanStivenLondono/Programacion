package ficherosraf;

public class Vector {
	public static void main(String[] args) {
		int[] vector = {1,5,2,3,9};
		int[] vector2 = {1,8,7,6,9};
		
		char[] vectorLetras = {'a','r','b','o','z'};
		
		invertirOrden(vector);
		
		System.out.println();
		System.out.println();
		System.out.println("Vector ordenado");
		ordenarVectorLetras(vectorLetras);
		
		System.out.println();
		sumarVectores(vector, vector2);
	}
	
	public static void invertirOrden (int[] vector) {
		for (int i = vector.length-1; i>=0; i--) {
			System.out.print(vector[i]+" ");
		}
	}
	
	public static void ordenarVectorLetras(char[] vector) {
		for (int i = 0; i < vector.length-1; i++) {//-1
			for (int j = i+1; j < vector.length; j++) {//i+1
				if (vector[j] < vector[i]) {
				 	 char aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	public static void sumarVectores(int[] vector1, int[] vector2) {
		int[] sumaTotal = new int [5];
		for (int i = 0; i < sumaTotal.length; i++) {
			sumaTotal[i] = vector1[i]+vector2[i];
			System.out.println();
			System.out.print("Suma de los vectores: "+sumaTotal[i]);
		}
	}
}
