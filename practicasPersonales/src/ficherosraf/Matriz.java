package ficherosraf;

public class Matriz {
	public static void main(String[] args) {
<<<<<<< HEAD
		double[] vectorTriatlon1 = {10.5, 10.2, 11.8, 12.7, 12.3};
	    double[] vectorTriatlon2 = {11.8, 12.5, 13.7, 12.3, 11.9};
	        
	    double media = mediaMarcas(vectorTriatlon1, vectorTriatlon2);
	    System.out.println("La media de las marcas es: " + media);
	    
	    System.out.println();
	    buscarNumeroMatriz();
=======
		 double[] vectorTriatlon1 = {10.5, 10.2, 11.8, 12.7, 12.3};
	     double[] vectorTriatlon2 = {11.8, 12.5, 13.7, 12.3, 11.9};
	        
	    
	    double media = mediaMarcas(vectorTriatlon1, vectorTriatlon2);
	    System.out.println("La media de las marcas es: " + media);
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
	}
	
	public static double mediaMarcas(double[] vector1, double[] vector2) {
		double[][] matriz = {vector1, vector2};
		
		// Calcular la suma de todas las marcas
        double suma = 0;
        int contador = 0;
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                contador++;
            }
        }
        media = suma/contador;
        return media;
	}
<<<<<<< HEAD
	
	public static void buscarNumeroMatriz () {
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*50);
			}
		}
		int apariciones = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 7) {
					apariciones++;
				}
			}
		}
		System.out.println("El numero 7 apararece "+apariciones+" veces");
	}
=======
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
}
