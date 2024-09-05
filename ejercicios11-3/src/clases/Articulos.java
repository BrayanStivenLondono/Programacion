package clases;

import java.io.Serializable;

public abstract class Articulos implements Comparable<Articulos>, Serializable {
	
	private static final long serialVersionUID = 1L;	

	private String isbn;
	private String titulo;
	
	//se calcula en las hijas
	public abstract int calcularPuntos();
	
	public Articulos(String isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Articulos [isbn=" + isbn + ", titulo=" + titulo + "]";
	}
	
}
