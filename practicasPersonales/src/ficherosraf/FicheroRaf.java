package ficherosraf;

<<<<<<< HEAD
public class FicheroRaf {

	public static void main(String[] args)  {
		int[] vector = {1,4,7,2,3};
				
=======

public class FicheroRaf {

	public static void main(String[] args)  {
		int[] vector = {1,4,7,2};
		
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		int[][] matriz = {{1, 2, 3, 4} , {5, 6, 7, 5}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println();
		}
		
<<<<<<< HEAD
		System.out.println();
		System.out.println("Vector ordenado");
		organizarVector(vector);
		
=======
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
		
		System.out.println();
		visualizarMaximoPar(matriz);
		//ordenar
		
		System.out.println();
		System.out.println("La matriz con coordenadas es ");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				System.out.print("("+i+","+j+") "+matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void visualizarMaximoPar(int[][] matriz) {
		System.out.println();
		System.out.println("Maximo par");
		int maximo = matriz[0][0];
		int posicionI = 0;
		int posicionJ = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j]%2==0) {
					if (matriz[i][j] > maximo) {//par mas alto
						maximo = matriz[i][j];
						posicionI = i;
						posicionJ = j;
					}
				}
			}
			System.out.println("Fila "+i+" El maximo par es "+maximo);
			System.out.println("La posicion es ("+posicionI+","+ posicionJ+")");
		}
	}
<<<<<<< HEAD
	
	public static void organizarVector(int[] vector) {
		for (int i = 0; i < vector.length-1; i++) {
			for (int j = i+1; j < vector.length; j++) {
				if (vector[j] < vector[i]) {
					 int aux = vector[i];
						vector[i] = vector[j];
						vector[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
=======
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
}	


