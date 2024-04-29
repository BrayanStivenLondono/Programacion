package programa;

import java.util.ArrayList;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.Rectangulo;
import figuras.Triangulo;

public class FigurasAbstractas {

	public static void main(String[] args) {
		// Las clases abstractas no pueden ser instanciadas
		Triangulo triangulo = new Triangulo(0,0,20,12);
		Circulo circulo = new Circulo(0,0,2);
		Rectangulo rectangulo = new Rectangulo(0,0,5,3);
		Cuadrado cuadrado = new Cuadrado(0,0,3);
		
		//creo un ArrayList de figuras
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		//introduzco las figuras en el arrayList
		listaFiguras.add(rectangulo);
		listaFiguras.add(cuadrado);
		listaFiguras.add(circulo);
		listaFiguras.add(triangulo);
		
		System.out.println("Muevo las figuras");
		for (int i=0;i<listaFiguras.size();i++)  {
			Figura fig = listaFiguras.get(i);
			fig.mover(i, i);
		}
		
		System.out.println("Muestro las coordenadas");
		for (int i=0;i<listaFiguras.size();i++) {
			Figura fig = listaFiguras.get(i);
			System.out.println("x "+fig.getX()+ " y "+fig.getY());
		}
		
		System.out.println("Muestro el area de las figuras");
		for (int i=0;i<listaFiguras.size();i++) {
			Figura fig = listaFiguras.get(i);
			System.out.println("Area "+fig.getArea());
		}
		
		System.out.println("Dibujo las figuras");
		for (int i=0;i<listaFiguras.size();i++) {
			Figura fig = listaFiguras.get(i);
			fig.dibujar();
		}
	}
}