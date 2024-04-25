package figuras;

public abstract class FiguraGeometrica {
	//una clase es abtracta si al menos tiene un metodo abstracto
	//no es necesario que todos sus metodos sean abstractos
	//pero si tiene uno, ya es abstracta
	
	//esta clase se puede instanciar
	//no se puede crear objetos de ella
	
	//los metodos abstractos se daclaran con abstract
	//se indica su nombre, parametros, y no se implementan, solo se declara
	
	//las clase hijas que heredan de una abstracta
	//estan obligadas a implementar
	
	String nombre;
	public FiguraGeometrica()  {
		this.nombre = nombre;
	}
	public FiguraGeometrica(String nombre)  {
		this.nombre = nombre;
	}
	public abstract double area();
	public abstract double perimetro();
	
	public String DimeMiNombre()  {
		return nombre;
	}
}
