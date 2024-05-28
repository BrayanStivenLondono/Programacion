package clases;

import java.io.Serializable;
import java.sql.Time;

public class Carretillero extends Personal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Time costeHora;
	
	public Carretillero() {
		super();
	}

	public Carretillero(String dni, String nombre, String costeHora) {
		super(dni, nombre);
		this.costeHora = Time.valueOf(costeHora);
	}
	
	public Time getCosteHora() {
		return costeHora;
	}

	public void setCosteHora(Time costeHora) {
		this.costeHora = costeHora;
	}
	

	@Override
	public String toString() {
		return "Carretillero [costeHora=" + costeHora + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personal o) {
		return getDni().compareTo(o.getDni());
	}
	
	
}
