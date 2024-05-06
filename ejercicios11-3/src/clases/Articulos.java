package clases;

import java.io.Serializable;

public abstract class Articulos implements Comparable<Articulos>, Serializable{
	
	private static final long serialVersionUID = 1L;	

	private String sbn;
	private String titulo;
	
	//se calcula en las hijas
	public abstract int calcularPuntos();
	
	public Articulos(String sbn, String titulo) {
		this.sbn = sbn;
		this.titulo = titulo;
	}

	public String getSbn() {
		return sbn;
	}

	public void setSbn(String sbn) {
		this.sbn = sbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Articulos [sbn=" + sbn + ", titulo=" + titulo + "]";
	}
	
}
