package clases;

import java.util.ArrayList;

public class Empleado extends Personal {
	
	private ArrayList<Atraccion> listaAtracciones;

	public Empleado() {
		super();
		
	}

	public Empleado(String nombre, String dni, int sueldo, int codigo, int anyosEsperiencia) {
		super(nombre, dni, sueldo, codigo, anyosEsperiencia);
		this.listaAtracciones = new ArrayList<Atraccion>();
		
	}
	
	public ArrayList<Atraccion> getListaAtracciones() {
		return listaAtracciones;
	}

	public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
		this.listaAtracciones = listaAtracciones;
	}

	@Override
	public String toString() {
		return "Empleado [listaAtracciones=" + listaAtracciones + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personal o) {
		return getNombre().compareTo(o.getNombre());
	}

}
