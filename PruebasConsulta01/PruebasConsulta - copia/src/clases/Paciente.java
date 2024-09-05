package clases;

import java.time.LocalDate;

public class Paciente {
	
	private String codPaciente;
	private String nombre;
	private LocalDate fechaAlta;
	
	public Paciente(String codPaciente, String nombre) {
		this.codPaciente = codPaciente;
		this.nombre = nombre;
	}
	
	public String getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(String codPaciente) {
		this.codPaciente = codPaciente;
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
		return "Paciente [codPaciente=" + codPaciente + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
}

