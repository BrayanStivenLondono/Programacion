package programa;

import figuras.Circulo;
import figuras.Triangulo;

public class FigurasAbstractas {

	public static void main(String[] args) {
		// Las clases abstractas no pueden ser instanciadas
		Triangulo triangulo = new Triangulo(20,12);
		Circulo circulo = new Circulo(2);
		
		System.out.println("Nombre: "+circulo.dimeMiNombre());
		System.out.println("Area circulo: "+circulo.area());
		System.out.println("Nombre: "+triangulo.dimeMiNombre());
		System.out.println("Area triangulo: "+triangulo.area());
	}

}