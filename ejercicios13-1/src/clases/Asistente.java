package clases;

import java.time.LocalDate;

public class Asistente extends Personal {
	
	private static final long serialVersionUID = 1L;
	
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	
	
	public Asistente(String dni, String nombre, String fechaNacimiento, String nacionalidad) {
		super(dni, nombre);
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
		this.nacionalidad = nacionalidad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	@Override
	public String toString() {
		return "Asistente [fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int compareTo(Personal o) {
		return getDni().compareTo(o.getDni());
	}
	
	
}
