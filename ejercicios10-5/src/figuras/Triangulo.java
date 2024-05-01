package figuras;

public class Triangulo extends FiguraGeometrica {

	double base;
	double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// sobreescribo los metodos abstractos
	@Override
	public double area() {
		return base * altura / 2;
	}

	@Override
	public double perimetro() {
		return 0;
	}

}