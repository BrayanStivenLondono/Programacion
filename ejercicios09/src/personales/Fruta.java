package personales;

import java.time.LocalDate;

public class Fruta {
	private int codigo;
	private String nombre;
	private String color;
	private LocalDate fechaLlegada;
	private Proveedor proveedorFruta;
	
	public Fruta(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	//setter y getter
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDate getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(LocalDate fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public Proveedor getProveedorFruta() {
		return proveedorFruta;
	}
	public void setProveedorFruta(Proveedor proveedorFruta) {
		this.proveedorFruta = proveedorFruta;
	}

	@Override
	public String toString() {
		return "Fruta [codigo=" + codigo + ", nombre=" + nombre + ", color=" + color + ", fechaLlegada=" + fechaLlegada
				+ ", proveedorFruta=" + proveedorFruta + "]";
	}
	
}
