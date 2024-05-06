package clases;

import java.io.Serializable;
import java.time.LocalDate;

public class Socios implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idSocio;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Socios(int idSocio, String nombre, LocalDate fechaAlta) {
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
	}
	
	//
	public int getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
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
		return "Socios [idSocio=" + idSocio + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + "]";
	}

	
}
