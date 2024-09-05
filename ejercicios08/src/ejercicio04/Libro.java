package ejercicio04;

public class Libro {

	//atributos 
	private String titulo;
	private String autor;
	private int a�oPublicacion;
	private String editorial;
	private float precio;
	
	//constructor vacio sin valores
	public Libro () {
		
	}
	//constrctor con parametros
	public Libro (String titulo, String autor, int a�oPublicacion, String editorial, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.a�oPublicacion = a�oPublicacion;
		this.editorial = editorial;
		this.precio = precio;
	}

	//setter y getter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getA�oPublicacion() {
		return a�oPublicacion;
	}
	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//metodo static precioConIva
	
	static float PrecioConIva (float precio, float iva){
		return (precio + (precio *iva/100)) ;
	}
}
