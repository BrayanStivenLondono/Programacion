package figuras;

public class Rectangulo extends Figura{
	private int largo;
	private int alto;
	
	public Rectangulo(int x, int y, int largo, int alto) {
		super(x,y);
		this.alto=alto;
		this.largo=largo;
	}
	
	@Override
	public float getArea() {
		return this.largo*this.alto;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujo un rectangulo");
		
	}

}