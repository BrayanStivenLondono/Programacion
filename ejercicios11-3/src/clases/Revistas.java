package clases;

import java.io.Serializable;

public class Revistas extends Articulos implements Serializable{

	public final static int PUNTOS = 2;//constante
	private static final long serialVersionUID = 1L;
	
	private String editorial;
	private boolean disponible;

	public Revistas(String isbn, String titulo, String editorial, boolean disponible) {
		super(isbn, titulo);
		this.editorial = editorial;
		this.disponible = disponible;
	}

	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "Revistas [editorial=" + editorial + ", disponible=" + disponible + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int compareTo(Articulos o) {
		return getIsbn().compareTo(o.getIsbn());
	}
	
	@Override
	public int calcularPuntos() {
		int totalPuntos = 0;
		totalPuntos += PUNTOS;
		
		return totalPuntos;
	}
	
}
