package clases;

import java.util.Date;

public class Persona {
	private int id;
	private String primerApellido;
	private String segundoApellido;
	private String email;
	private Date fechaNacimiento;
	
	public Persona() {
		
	}
	
	public Persona(int id, String primerApellido, String segundoApellido, String email, Date fechaNacimiento) {
		this.id = id;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
				+ ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
