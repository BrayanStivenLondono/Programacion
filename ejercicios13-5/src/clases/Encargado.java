package clases;

import java.util.ArrayList;

public class Encargado extends Personal {
	
	private ArrayList<Empleado> listaEmpleados;
	
	public Encargado() {
		super();
		
	}
	public Encargado(String nombre, String dni, int sueldo, int codigo, int anyosEsperiencia) {
		super(nombre, dni, sueldo, codigo, anyosEsperiencia);
		this.listaEmpleados = new ArrayList<Empleado>();
		
	}
	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	
	@Override
	public String toString() {
		return "Encargado [listaEmpleados=" + listaEmpleados + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Personal o) {
		return getNombre().compareTo(o.getNombre());
	}
}
