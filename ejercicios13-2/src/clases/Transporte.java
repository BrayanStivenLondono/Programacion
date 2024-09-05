package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Transporte implements Comparable<Transporte>, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String empresa;
	private LocalDate fechaTransporte;
	private Conductor conductor;
	private ArrayList<Carretillero> listaCarretilleros;
	
	public Transporte() {
		
	}
	
	public Transporte(String codigo, String empresa, String fechaTransporte, Conductor conductor) {
		this.codigo = codigo;
		this.empresa = empresa;
		this.fechaTransporte = LocalDate.parse(fechaTransporte);
		this.conductor = conductor;
		this.listaCarretilleros = new ArrayList<Carretillero>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public LocalDate getFechaTransporte() {
		return fechaTransporte;
	}

	public void setFechaTransporte(LocalDate fechaTransporte) {
		this.fechaTransporte = fechaTransporte;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public ArrayList<Carretillero> getListaCarretilleros() {
		return listaCarretilleros;
	}

	public void setListaCarretilleros(ArrayList<Carretillero> listaCarretilleros) {
		this.listaCarretilleros = listaCarretilleros;
	}

	@Override
	public String toString() {
		return "Transporte [codigo=" + codigo + ", empresa=" + empresa + ", fechaTransporte=" + fechaTransporte
				+ ", conductor=" + conductor + ", listaCarretilleros=" + listaCarretilleros + "]";
	}

	@Override
	public int compareTo(Transporte o) {
		return getFechaTransporte().compareTo(o.getFechaTransporte());
	}
	
	
	
}
