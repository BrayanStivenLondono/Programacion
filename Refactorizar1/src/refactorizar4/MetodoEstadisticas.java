package refactorizar4;

public class MetodoEstadisticas {
	public void resultadoEstadisticasVectorDeNumeros(int[] vectorDeNumerosAOperar, int numeroMayor,
			int numeroMenor, int contadorNumerosPositivos, int sumaNumerosPositivos, int contadorNumerosNegativos,
			int sumaNumerosNegativos) {
		System.out.println("El mayor: " + numeroMayor);
		System.out.println("El menor: " + numeroMenor);
		System.out.println("Media de positivos: " + ((double) sumaNumerosPositivos / contadorNumerosPositivos));
		System.out.println("Media de negativos : " + ((double) sumaNumerosNegativos / contadorNumerosNegativos));
		System.out.println("Media total: " + ((double) (sumaNumerosPositivos + sumaNumerosNegativos) / (vectorDeNumerosAOperar.length)));
	}
}
