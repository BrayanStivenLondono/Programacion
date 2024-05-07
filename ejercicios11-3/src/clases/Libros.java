package clases;

import java.io.Serializable;

public class Libros extends Articulos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public final static int PUNTOS = 5;//constante
	private String editorial;//atributos de hija
	private String autor;

	public Libros(String isbn, String titulo, String editorial, String autor) {
		super(isbn, titulo);
		this.editorial = editorial;
		this.autor = autor;
	}
	
	//setter y getter
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	@Override
	public int compareTo(Articulos o) {
		return getSbn().compareTo(o.getSbn());
	}
	
	@Override
	public int calcularPuntos() {
		int totalPuntos = 0;
		totalPuntos += PUNTOS;
		
		return totalPuntos;
	}

	@Override
	public String toString() {
		return "Libros [editorial=" + editorial + ", autor=" + autor + ", toString()=" + super.toString() + "]";
	}
}
