package figuras;

public abstract class FiguraGeometrica {
	//una clase es abstracta si al menos tiene un metodo abstracto
	//no es necesario que todos sus metodos sean abstractos
	//pero si tiene uno, ya tiene que ser abstracta
	//una clase abstracta no puede ser instanciada
	//no puedo crear objetos de esa clase
	//los metodos abstractos se declaran con abstract
	//se indica su nombre, sus parametros, y no se implementan
	//solo se declaran
	//las clases hijas que hereden de una abstracta
	//estan obligados a implementar
	
	String nombre;
	public FiguraGeometrica() {
		this.nombre = "";
	}
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	//dos metodos abstractos, area, perimetro
	public abstract double area();
	public abstract double perimetro();
	
	//un metodo no abstracto
	public String dimeMiNombre() {
		return nombre;
	}
	
}