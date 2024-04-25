package figuras;

public abstract class Triangulo extends Figura {
	double base;
	double altura;
	
	public Triangulo (int x ,int y, double base, double altura) {
		super(x,y);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float getArea() {
		return (this.base*this.altura)/2;
	}
	
	@Override
	public void dibujar() {
		System.out.println("Dibujo un triangulo");
	}
}
