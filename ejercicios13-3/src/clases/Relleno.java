package clases;

import java.io.Serializable;

public class Relleno extends Personaje implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int cantidad_dinero;
	
	
	public Relleno() {
		super();
	}

	public Relleno(int id, String nombre, int cantidad_dinero) {
		super(id, nombre);
		this.cantidad_dinero = cantidad_dinero;
	}

	
	public int getCantidad_dinero() {
		return cantidad_dinero;
	}

	public void setCantidad_dinero(int cantidad_dinero) {
		this.cantidad_dinero = cantidad_dinero;
	}

	
	
	@Override
	public String toString() {
		return "Relleno [cantidad_dinero=" + cantidad_dinero + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personaje o) {
		return getNombre().compareTo(o.getNombre());
	}
	
}
