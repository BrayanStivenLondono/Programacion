package clases;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;

public class Conciertos implements Comparable<Conciertos>, Serializable {
	
	private static final long serialVersionUID = 1L;
	//base festival3ev
	private String codigo;
	private String nombre;
	private Time horaInicio;
	private Artista artista;
	private ArrayList<Asistente> asistentes;
	
	public Conciertos() {
		
	}
	
	public Conciertos(String codigo, String nombre, String horaInicio, Artista artista) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horaInicio = Time.valueOf(horaInicio);
		this.artista = artista;
		this.asistentes = new ArrayList<Asistente>();
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

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public ArrayList<Asistente> getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(ArrayList<Asistente> asistentes) {
		this.asistentes = asistentes;
	}

	@Override
	public String toString() {
		return "Conciertos [codigo=" + codigo + ", nombre=" + nombre + ", horaInicio=" + horaInicio + ", artista="
				+ artista + ", asistentes=" + asistentes + "]";
	}

	@Override
	public int compareTo(Conciertos o) {
		return getHoraInicio().compareTo(o.getHoraInicio());
	}
	
}
