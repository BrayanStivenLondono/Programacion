package ficherosraf;

public class Matriz {
	public static void main(String[] args) {
		 double[] vectorTriatlon1 = {10.5, 10.2, 11.8, 12.7, 12.3};
	     double[] vectorTriatlon2 = {11.8, 12.5, 13.7, 12.3, 11.9};
	        
	    
	    double media = mediaMarcas(vectorTriatlon1, vectorTriatlon2);
	    System.out.println("La media de las marcas es: " + media);
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
}
