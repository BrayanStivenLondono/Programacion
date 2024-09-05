package clases;

import java.io.Serializable;
import java.time.LocalDate;

public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigoCliente;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Clientes(int codigoCliente, String nombre, LocalDate fechaAlta) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
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
		return "Clientes [codigoCliente=" + codigoCliente + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + "]";
	}
	
}
