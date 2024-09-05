package ejercicios00;

public class Ejercicio06 {

	public static void main(String[] args) {
		// 6. Realizar un programa que declare una variable en euros, y la transforme a
		// libras y
		// visualice el resultado de las dos.
		// Realizar el mismo proceso para el cambio euros, dólares.
		// 1 euro = 0.91 libras esterlinas
		// 1 euro = 1.17 dólares
		
		final double CONVERSION_LIBRAS = 0.91;
		final double CONVERSION_DOLARES = 1.17;
		
	
		
		double euros = 125;
		double conversionALibras = euros * CONVERSION_LIBRAS;
		System.out.println("euros " + euros + " a libras " + conversionALibras);
		double conversionADolares = euros * CONVERSION_DOLARES;
		System.out.println("euros " + euros + " a dolares " + conversionADolares);
		
	}

}
