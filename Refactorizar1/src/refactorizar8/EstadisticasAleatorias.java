package refactorizar8;

import refactorizar8_1.MetodosOperacionesAleatorias;

//cambio el nombre de la clase a un mas descriptivo EstadisticasAleatorias

public class EstadisticasAleatorias {

	public static void main(String[] args) {
		
		//cambio el nombre de la constante de tipo int a uno mas descriptivo CantidadNumerosAleatorios
		
		final int cantidadNumerosAleatorios = 50;
		
		//cambio el nombre del int a uno mas descriptivo cifraMaximaAOperar
	    int cifraMaximaAOperar = 0;
	    
		//cambio el nombre del int a uno mas descriptivo cifraMinimaAOperar
	    int cifraMinimaAOperar = 200;
	    
		//cambio el nombre del int a uno mas descriptivo sumaNumerosAleatorios
	    int sumaNumerosAleatorios = 0;
	    
	    sumaNumerosAleatorios = MetodosOperacionesAleatorias.calcularEstadisticasDeAleatorios(cantidadNumerosAleatorios, cifraMaximaAOperar,
				cifraMinimaAOperar, sumaNumerosAleatorios, cifraMaximaAOperar, cifraMinimaAOperar);
	    
	    MetodosOperacionesAleatorias.resultadosEstadisticasAleatorios(cifraMaximaAOperar, cifraMinimaAOperar, sumaNumerosAleatorios);
	  }
}