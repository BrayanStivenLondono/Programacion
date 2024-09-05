package clases;

import java.io.Serializable;

public class Comida implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nombre;
	private float precio;
	
	public Comida() {
		
	}
	
	public Comida(int codigo, String nombre, float precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comida [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
