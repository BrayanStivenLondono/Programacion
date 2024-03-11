package refactorizar9;// cambio el nombre del paquete al correcto refactorizar9

import java.util.Scanner;

import refactorizar9_1.MetodosPeticionGeneradorGraficoTemperatura;

//cambio el nombre del vector a uno mas descriptivo a GeneradorGraficoDeTemperatura

public class GeneradorGraficoDeTemperatura {

	private static final int CANTIDAD_TEMPERATURAS = 5;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		//cambio el nombre del vector a uno mas descriptivo temperaturaAOperar y su tamaño la hago 
		
		//una conatante llamada CANTIDAD_TEMPERATURAS con valor de 5
		int[] temperaturaAOperar = new int[CANTIDAD_TEMPERATURAS];
		
		MetodosPeticionGeneradorGraficoTemperatura.peticionTemperaturaMediaMes(input, temperaturaAOperar);
		
		MetodosPeticionGeneradorGraficoTemperatura.representacionGraficaTemperaturaIntroducida(temperaturaAOperar);
		
		input.close();
	}

}