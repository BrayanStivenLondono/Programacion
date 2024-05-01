package figuras;

public class Circulo extends FiguraGeometrica {
	private double radio;

	public Circulo(double radio) {
		this.nombre = "Circulo";
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio * radio;
	}

}
