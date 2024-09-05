package refactorizar11; //cambio el nombre correcto de la clase

//jar import.metodos.Metodos;
public class CarreraReyesMagos {
	private static final int MELCHOR = 0;
	private static final int GASPAR = 1;
	private static final int BALTASAR = 2;
	private static final char[] ESTADO_INICIAL_CARRERA = {'-','-','-','-','-','-','-','P'};
	

//cambi1o el nombre de la clase a CarreraReyesMagos más descriptivo
	public static void main(String[] args) {
		// Crea el array de la pista de carreras y lo rellena
		
		//creo una contante del tamaño del pistaCarreas llamada ESTADO_INICIAL_CARRERA
		char[] pistaCarreras = ESTADO_INICIAL_CARRERA;
		
		//
		char[] melchor = new char[pistaCarreras.length];
		melchor[0] = 'M';
		char[] gaspar = new char[pistaCarreras.length];
		gaspar[0] = 'G';
		char[] baltasar = new char[pistaCarreras.length];
		baltasar[0] = 'B';
		// #LaCarrera
		int numeroDePasos = 1;
		int posicionMelchor = 0;
		int posicionGaspar = 0;
		int posicionBaltasar = 0;
		// Imprime la posición de salida
		
		mostrarSalida(pistaCarreras, melchor, gaspar, baltasar);
		mostrarEstadoCarrera(melchor, gaspar, baltasar);
		boolean ningunReyALlegadoAMeta = true;
		
		do {
			mostrarPasoActual(pistaCarreras, numeroDePasos);
			System.out.println();
			numeroDePasos++;
			// Quién avanza
			int queReyAvanza = (int) ((Math.random() * 3));
			switch (queReyAvanza) {
			case MELCHOR:
				posicionMelchor = pasoDeRey(melchor, posicionMelchor);
				break;
			case GASPAR:
				posicionGaspar = pasoDeRey(gaspar, posicionGaspar);
				break;
			case BALTASAR:
				posicionBaltasar = pasoDeRey(baltasar, posicionBaltasar);
				break;
			}
			// Imprime el avance
			mostrarEstadoCarrera(melchor, gaspar, baltasar);
			
		} while (ningunReyALlegadoAMeta);
		System.out.println();
		System.out.print("¡Ha ganado ");
		if (posicionMelchor == 7) {
			System.out.println("Melchor!");
		}
		if (posicionGaspar == 7) {
			System.out.println("Gaspar!");
		}
		if (posicionBaltasar == 7) {
			System.out.println("Baltasar!");
		}
	}

	private static void mostrarSalida(char[] pistaCarreras, char[] melchor, char[] gaspar, char[] baltasar) {
		System.out.printf("%-9s", "Salida");
		for (int i = 0; i < pistaCarreras.length; i++) {
			System.out.print(pistaCarreras[i]);
		}
		System.out.println();
		System.out.printf("%9s", "Gaspar:");
		for (int i = 0; i < gaspar.length; i++) {
			System.out.print(gaspar[i]);
		}
		System.out.println();
		System.out.printf("%9s", "Baltasar:");
		for (int i = 0; i < baltasar.length; i++) {
			System.out.print(baltasar[i]);
		}
		System.out.println();
	}

	private static void mostrarPasoActual(char[] pistaCarreras, int numeroDePasos) {
		System.out.printf("%s %-4d", "Paso", numeroDePasos);
		for (int i = 0; i < pistaCarreras.length; i++) {
			System.out.print(pistaCarreras[i]);
		}
	}

	private static int pasoDeRey(char[] melchor, int posicionMelchor) {
		melchor[posicionMelchor + 1] = melchor[posicionMelchor];
		melchor[posicionMelchor] = ' ';
		posicionMelchor++;
		return posicionMelchor;
	}

	private static void mostrarEstadoCarrera(char[] melchor, char[] gaspar, char[] baltasar) {
		mostrarEstadoRey(melchor,"Melchor:");
		mostrarEstadoRey(gaspar,"Gaspar:");
		mostrarEstadoRey(baltasar,"Baltasa:");

	}

	private static void mostrarEstadoRey(char[] rey, String nombre) {
		System.out.printf("%9s", nombre);
		for (int i = 0; i < rey.length; i++) {
			System.out.print(rey[i]);
		}
		System.out.println();
	}
}
