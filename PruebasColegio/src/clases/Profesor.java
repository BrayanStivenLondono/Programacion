package clases;

import java.time.LocalDate;

public class Profesor {
	
	private String codProfesor;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Profesor(String codProfesor, String nombre) {
		this.codProfesor = codProfesor;
		this.nombre = nombre;
	}
	
	public String getCodProfesor() {
		return codProfesor;
	}
	public void setCodProfesor(String codProfesor) {
		this.codProfesor = codProfesor;
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
		return "Profesor [codProfesor=" + codProfesor + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
}

