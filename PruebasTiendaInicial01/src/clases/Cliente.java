package clases;

import java.time.LocalDate;

public class Cliente {
	
	private String idCliente;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Cliente(String idCliente, String nombre) {
		this.idCliente = idCliente;
		this.nombre = nombre;
	}
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + "]";
	}
}

