package clases;

import java.io.Serializable;

public abstract class Productos implements Comparable<Productos>, Serializable  {
	
	private static final long serialVersionUID = 1L;
	public abstract double calcularPrecio();
	
	protected String nombreProducto;
	protected double precio;
	
	public Productos(String nombreProducto, double precio) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [nombreProducto=" + nombreProducto + ", precio=" + precio + "]";
	}

}
