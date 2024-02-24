package ejerciciosprevios;

public class EjercicioPrevio01 {//nombre de clase

	// metodo main
	// cabecera del metodo
	// public = forma de acceso
	// static = no tener que creae objetos
	// void = no divuelve nada
	// main = nombre del metodo
	// (String [] args) = lo que recibe
	public static void main(String[] args) {
		// Math.pow.....
		// Clase.metodo
		EjercicioPrevio01.suma();
		EjercicioPrevio01.resta();

	}
	// metodo public (acessible desde todos lo sitios)
	// static (no requiere crear objeto)
	// void (no devuelve nada)
	// se llama suma y no recibe nada ()
	public static void suma () {
		int numero1 = 3;
		int numero2 = 4;
		System.out.println("La suma es "+(numero1+numero2));
		
	}
	public static void resta () {
		int numero1 = 8;
		int numero2 = 7;
		System.out.println("La suma es "+(numero1-numero2));
		
	}

}
