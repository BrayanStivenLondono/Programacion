package figuras;

public class Circulo extends Figura{
	private double radio;
	public Circulo(int x ,int y, double radio) {
		super(x,y);
		this.radio=radio;
	}
	//estoy obligado a implementar los metodos abstractos
	@Override
	public float getArea() {
		return (float)(Math.PI*Math.pow(radio, 2));
	}
	@Override
	public void dibujar() {
		System.out.println("Dibujo un circulo");
	}

}
