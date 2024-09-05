package clases;

public abstract class Protagonista implements Comparable<Protagonista>{
	
	protected abstract double calcularDinero();
	
	private String nombre;
	private String nombreSerie;
	
	public Protagonista() {
		
	}
	
	public Protagonista(String nombre, String nombreSerie) {
		this.nombre = nombre;
		this.nombreSerie = nombreSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreSerie() {
		return nombreSerie;
	}

	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}

	@Override
	public String toString() {
		return "Protagonista [nombre=" + nombre + ", nombreSerie=" + nombreSerie + "]";
	}
	
}
