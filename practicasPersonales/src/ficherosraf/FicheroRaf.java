package ficherosraf;


public class FicheroRaf {

	public static void main(String[] args)  {
		int[] vector = {1,4,7,2};
		
		int[][] matriz = {{1, 2, 3, 4} , {5, 6, 7, 5}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
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
}	


