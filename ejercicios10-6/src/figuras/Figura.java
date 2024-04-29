package figuras;

public abstract class Figura {
	private int x;
	private int y;

	public Figura(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract float getArea();
	public abstract void dibujar();
	//un metodo no abstracto
	public void mover(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}

