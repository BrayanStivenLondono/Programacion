package figuras;

public class Triangulo extends Figura{
	float base;
	float altura;
	public Triangulo(int x, int y, float base, float altura) {
		super(x,y);
		this.base=base;
		this.altura=altura;
	}
	//sobreescribo los metodos abstractos
	@Override
	public float getArea() {
		return (this.base*this.altura)/2;
	}
	@Override
	public void dibujar() {
		System.out.println("Dibujo un triangulo");
		
	}

}
