package clases;

public class Artista extends Personal {
	
	private static final long serialVersionUID = 1L;
	
	private String estilo;
	private double cache;
	
	
	public Artista(String dni, String nombre, String estilo, double cache) {
		super(dni, nombre);
		this.estilo = estilo;
		this.cache = cache;
	}
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getCache() {
		return cache;
	}

	public void setCache(double cache) {
		this.cache = cache;
	}

	@Override
	public String toString() {
		return "Artista [estilo=" + estilo + ", cache=" + cache
				+ ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int compareTo(Personal o) {
		return getDni().compareTo(o.getDni());
	}
	
}
