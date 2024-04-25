package figuras;

public abstract class Circulo  extends Figura{
	private double radio;
	
	public Circulo (int x, int y, double radio) {
		super(x,y);
		this.radio = radio;
	}
	
	@Override
	public float GetArea() {
		
		return (float)(Math.PI*Math.pow(radio, 2));
	}
	
	@Override
	public void dibujar() {
		return 2*Math.PI;
	}
}
