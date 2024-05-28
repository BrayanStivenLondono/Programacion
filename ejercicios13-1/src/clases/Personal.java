package clases;

import java.io.Serializable;

public abstract class Personal implements Comparable<Personal>, Serializable{

	private static final long serialVersionUID = 1L;
	
	protected String dni;
	protected String nombre;
	
	
	public Personal(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Personal [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
