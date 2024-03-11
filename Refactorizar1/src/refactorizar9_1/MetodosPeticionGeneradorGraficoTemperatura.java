package refactorizar9_1;

import java.util.Scanner;

public class MetodosPeticionGeneradorGraficoTemperatura {
	
	public static void representacionGraficaTemperaturaIntroducida(int[] temperaturaAOperar) {
		for (int i = 0; i < temperaturaAOperar.length; i++) {
			System.out.print("Mes " + (i + 1) + ": ");
			for (int j = 0; j < temperaturaAOperar[i]; j++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}

	public static void peticionTemperaturaMediaMes(Scanner input, int[] temperaturaAOperar) {
		for (int i = 0; i < temperaturaAOperar.length; i++) {
			System.out.print("Introduce la temperatura media del mes " + (i + 1) + ": ");
			temperaturaAOperar[i] = input.nextInt();
		}
	}
}
