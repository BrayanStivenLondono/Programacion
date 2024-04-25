package figuras;

public abstract class Circulo  extends FiguraGeometrica{
	private double radio;
	
	public Circulo (double radio) {
		this.nombre = "circulo";
		this.radio = radio;
	}
	
	@Override
	public double area() {
		
		return 0;
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI;
	}
}
