package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Partida implements Comparable<Partida>, Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int recompensa;
	private Cj cj;
	private ArrayList<Relleno> listaRelleno;
	
	
	public Partida() {

	}
	
	public Partida(String nombre, int recompensa, Cj cj) {
		this.nombre = nombre;
		this.recompensa = recompensa;
		this.cj = cj;
		this.listaRelleno = new ArrayList<Relleno>();
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}

	public Cj getCj() {
		return cj;
	}
	public void setCj(Cj cj) {
		this.cj = cj;
	}

	public ArrayList<Relleno> getListaRelleno() {
		return listaRelleno;
	}

	public void setListaRelleno(ArrayList<Relleno> listaRelleno) {
		this.listaRelleno = listaRelleno;
	}

	@Override
	public String toString() {
		return "Partida [nombre=" + nombre + ", recompensa=" + recompensa + ", cj=" + cj + ", listaRelleno="
				+ listaRelleno + "]";
	}

	@Override
	public int compareTo(Partida o) {
		return getNombre().compareTo(o.getNombre());
	}
	

}
