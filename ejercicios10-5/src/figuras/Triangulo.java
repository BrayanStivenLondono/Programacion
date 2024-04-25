package figuras;

public abstract class Triangulo extends FiguraGeometrica {
	double base;
	double altura;
	
	public Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return base*altura/2;
	}
	@Override
	public double perimetro() {
		return 0;
	}
}
