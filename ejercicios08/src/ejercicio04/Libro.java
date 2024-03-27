package ejercicio04;

public class Libro {

	//atributos 
	private String titulo;
	private String autor;
	private int añoPublicacion;
	private String editorial;
	private float precio;
	
	//constructor vacio sin valores
	public Libro () {
		
	}
	//constrctor con parametros
	public Libro (String titulo, String autor, int añoPublicacion, String editorial, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
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
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
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
