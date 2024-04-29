package figuras;

public class Cuadrado extends Figura{
	private int lado;
	
	public Cuadrado(int x, int y, int lado) {
		super(x,y);
		this.lado=lado;
	}
	
	@Override
	public float getArea() {
		return this.lado*this.lado;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujo un cuadrado");
		
	}

}