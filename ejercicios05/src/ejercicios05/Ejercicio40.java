package ejercicios05;


public class Ejercicio40 {

	public static void main(String[] args) {
		// Dise�a una aplicaci�n que muestre las tablas de multiplicar del 1 al 10.

		for (int i=1; i<=10; i++) {
			System.out.println("\nTabla de multiplicar del "+i);
			
			for (int j=1; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}			
	}
}
