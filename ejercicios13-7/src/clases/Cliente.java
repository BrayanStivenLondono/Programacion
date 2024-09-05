package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;
	private ArrayList<Entrada> entradas;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String dni, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.entradas = new ArrayList<Entrada>();
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}

	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", entradas="
				+ entradas + "]";
	}
	
}
