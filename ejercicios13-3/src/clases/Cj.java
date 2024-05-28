package clases;

import java.io.Serializable;
import java.sql.Date;

public class Cj extends Personaje implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Date fechaNacimiento;
	
	public Cj () {
		super();
		
	}
	
	public Cj (int id, String nombre, String fechaNacimiento) {
		super(id, nombre);
		this.fechaNacimiento = Date.valueOf(fechaNacimiento);
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimineto) {
		this.fechaNacimiento = fechaNacimineto;
	}

	@Override
	public String toString() {
		return "Cj [fechaNacimiento=" + fechaNacimiento + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personaje o) {
		return getNombre().compareTo(o.getNombre());
	}
	
}
