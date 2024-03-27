package ejercicio08_7;

import java.time.LocalDate;

public class Proveedor {
	private String nombre;
	private String telefono;
	private LocalDate fechaOperacion;
	
	public Proveedor(String nombre, String telefono, LocalDate  fechaOperacion) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaOperacion = fechaOperacion;

	}
	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public LocalDate getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(LocalDate fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	
	@Override
	public String toString() {
		return "Proveedor=" + nombre + ", telefono=" + telefono + ", fechaOperacion=" + fechaOperacion +"]";
	}
	
	
}
