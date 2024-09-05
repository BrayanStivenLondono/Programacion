package refactorizar4; //cambio el nombre del paquete a refactorizar4

import java.util.Scanner;

//cambio de el nombre de la clase a VectorDeEstadisticas
public class VectorDeEstadisticas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//cambio el nombre del vector a una mas descriptivo vectorDeNumerosAOperar
		
		int[] vectorDeNumerosAOperar = new int[5];
		
		//creo una instancia de MetodoEstadisticas para llamar a resultadoEstadisticasVectorDeNumeros
		MetodoEstadisticas estadisticas = new MetodoEstadisticas();

		for (int i = 0; i < vectorDeNumerosAOperar.length; i++) {
			System.out.println("Introduce un numero");
			vectorDeNumerosAOperar[i] = input.nextInt();
		}

		//cambio el nombre mas descriptivo numeroMayor
		int numeroMayor = 0;
		
		//cambio el nombre mas descriptivo numeroMenor
		int numeroMenor = 0;
		
		//cambio el nombre mas descriptivo contadorNumerosPositivos
		int contadorNumerosPositivos = 0;
		
		//cambio el nombre mas descriptivo sumaNumerosPositivos
		int sumaNumerosPositivos = 0;
		
		//cambio el nombre mas descriptivo contadorNumerosNegativos
		int contadorNumerosNegativos = 0;
		
		//cambio el nombre mas descriptivo sumaNumerosNegativos
		int sumaNumerosNegativos = 0;

		for (int i = 0; i < vectorDeNumerosAOperar.length; i++) {
			if (i == 0) {
				numeroMayor = vectorDeNumerosAOperar[i];
				numeroMenor = vectorDeNumerosAOperar[i];
				
			} else if (vectorDeNumerosAOperar[i] > numeroMayor) {
				numeroMayor = vectorDeNumerosAOperar[i];
				} else if (vectorDeNumerosAOperar[i] < numeroMenor) {
				numeroMenor = vectorDeNumerosAOperar[i];
				}
		
			
			if (vectorDeNumerosAOperar[i] >= 0) {
				contadorNumerosPositivos++;
				sumaNumerosPositivos += vectorDeNumerosAOperar[i];
			} else {
				contadorNumerosNegativos++;
				sumaNumerosNegativos += vectorDeNumerosAOperar[i];
				}
			}
		
		estadisticas.resultadoEstadisticasVectorDeNumeros(vectorDeNumerosAOperar, numeroMayor, numeroMenor, contadorNumerosPositivos,
				sumaNumerosPositivos, contadorNumerosNegativos, sumaNumerosNegativos);

		input.close();
	}
}