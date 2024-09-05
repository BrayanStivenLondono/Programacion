package ejercicios06;

public class Metodo06Bis {

	public static void main(String[] args) {
		Metodo06.mostrarTablaAscii();

	}
	static void mostrarTablaAscii() {
		for (int i=0; i<=256; i++) {
			System.out.println((char)i+ " - "+i);
		}
	}

}
