package refactorizar8_1;

public class MetodosOperacionesAleatorias {
	public static void resultadosEstadisticasAleatorios(int cifraMaximaAOperar, int cifraMinimaAOperar,
			int sumaNumerosAleatorios) {
		System.out.println("");
	    double cifraMediaAOperar = ((double)(sumaNumerosAleatorios)/50.0);
	    System.out.println("El máximo par es: " + cifraMaximaAOperar);
	    System.out.println("El mínimo impar es: " + cifraMinimaAOperar);
	    System.out.println("La media es: " + cifraMediaAOperar);
	}

	public static int calcularEstadisticasDeAleatorios(final int cantidadNumerosAleatorios, int cifraMaximaAOperar,
			int cifraMinimaAOperar, int sumaNumerosAleatorios, int cifraMaximaAOperar1, int cifraMinimaAOperar1) {
		for (int i = 0; i < cantidadNumerosAleatorios; i++){
			//cambio el nombre del int a uno mas descriptivo numerosAleatorios
	    	int numerosAleatorios = (int)((Math.random()*300)-100);
	    	System.out.print(numerosAleatorios + " ");
	    	sumaNumerosAleatorios += numerosAleatorios;
	    	
	    	if (numerosAleatorios%2 == 0){
	    		if (cifraMaximaAOperar1 < numerosAleatorios){
	    			cifraMaximaAOperar1 = numerosAleatorios;
	    			}
	    		
	    	} else {
	    		if (cifraMinimaAOperar1 > numerosAleatorios) {
	    			cifraMinimaAOperar1 = numerosAleatorios;
	    			}
	    		}
	    	}
		return sumaNumerosAleatorios;
	}
}
