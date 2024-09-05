package clases;

import java.io.Serializable;

public class Empleados extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cargo;
	private double sueldo;
	
	public Empleados() {
		super();
		
	}
	
	public Empleados(int id, String nombre, String cargo, double sueldo) {
		super(id, nombre);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	@Override
	public String toString() {
		return "Empleados [cargo=" + cargo + ", sueldo=" + sueldo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return getNombre().compareTo(o.getNombre());
	}

}
