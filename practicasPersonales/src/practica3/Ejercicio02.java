package practica3;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String[] pueblos = { "Biota", "Tauste", "Gallur", "Tarazona", "Trasmoz", "Ateca", "Jaraba", "Anento",
				"Gallocanta", "Belchite", "Cadrete", "Gelsa" };
		String[] comarcas = { "Ejea de los Caballeros", "Ejea de los Caballeros",  "Borja", "Borja", "Borja",
				"Calatayud", "Calatayud", "Daroca", "Daroca", "Zaragoza", "Zaragoza", "Zaragoza" };
		
		mostrarPueblos(pueblos, comarcas);
	}

	public static void mostrarPueblos (String[] pueblos, String[] comarcas) {
		
		for (int i = 0; i < pueblos.length; i++) {
			System.out.println("El pueblo " + pueblos[i]+ " pertenece a la comarca " +comarcas[i]);
		}
	}

}