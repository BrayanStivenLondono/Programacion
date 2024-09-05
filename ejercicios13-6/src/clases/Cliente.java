package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Comida> comida;
	
	public Cliente() {
		super();
		
	}
	
	public Cliente(int id, String nombre) {
		super(id, nombre);
		this.comida = new ArrayList<Comida>();
	}

	public ArrayList<Comida> getComida() {
		return comida;
	}

	public void setComida(ArrayList<Comida> comida) {
		this.comida = comida;
	}

	
	@Override
	public String toString() {
		return "Clientes [comida=" + comida + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return getNombre().compareTo(o.getNombre());
	}
	
}
