package clases;

import java.io.Serializable;

public abstract class Personaje implements Comparable<Personaje>, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int id;

	public Personaje() {
	}
	
	public Personaje(int id, String nombre) {
		this.nombre = nombre;
		this.id = id;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", id=" + id + "]";
	}
	
}
