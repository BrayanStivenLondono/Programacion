package clases;

import java.util.ArrayList;

public class Robo implements Comparable<Robo> {
	private String nombreBanco;
	private Inspectora inspectora;
	private ArrayList<Protagonista> listaProtagonistas;
	
	public Robo() {
		
	}
	
	public Robo(String nombreBanco, Inspectora inspectora) {
		this.nombreBanco = nombreBanco;
		this.inspectora = inspectora;
		this.listaProtagonistas = new ArrayList<Protagonista>();
		
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public Inspectora getInspectora() {
		return inspectora;
	}

	public void setInspectora(Inspectora inspectora) {
		this.inspectora = inspectora;
	}

	public ArrayList<Protagonista> getListaProtagonistas() {
		return listaProtagonistas;
	}

	public void setListaProtagonistas(ArrayList<Protagonista> listaProtagonistas) {
		this.listaProtagonistas = listaProtagonistas;
	}

	@Override
	public String toString() {
		return "Robo [nombreBanco=" + nombreBanco + ", inspectora=" + inspectora + ", listaProtagonistas="
				+ listaProtagonistas + "]";
	}

	@Override
	public int compareTo(Robo o) {
		return getNombreBanco().compareTo(o.getNombreBanco());
	}
	
}
