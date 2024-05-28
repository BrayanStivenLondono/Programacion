package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Departamento implements Comparable<Departamento>, Serializable {

	private static final long serialVersionUID = 3852925526538813766L;
	private String codigo;
	private String nombre;
	private JefeSeccion jefe;
	private ArrayList<Trabajador> listaTrabajadores;

	public Departamento(String codigo, String nombre, JefeSeccion jefe) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.jefe = jefe;
		this.listaTrabajadores = new ArrayList<Trabajador>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public JefeSeccion getJefe() {
		return jefe;
	}

	public void setJefeSeccion(JefeSeccion jefe) {
		this.jefe = jefe;
	}

	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}

	public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}

	// abstract en Personal
	public double calcularSalarioTotal() {
		double salarioTotal = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			salarioTotal += trabajador.calcularSalario();
		}
		return salarioTotal;
	}

	@Override
	public int compareTo(Departamento o) {
		return getCodigo().compareTo(o.getCodigo());
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", jefe=" + jefe + 
				", listaTrabajadores="+ listaTrabajadores + 
				",salarioTotal=" + calcularSalarioTotal() + "]";
	}

}
