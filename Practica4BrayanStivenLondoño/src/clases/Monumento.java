package clases;

public class Monumento {
	private String nombre;
	private String ubicacion;
	private int anyosAntiguedad;
	private String material;
	private String disponible;
	private Estilo estilo;
	
	/**
	 * Constructor de la clase Monumento
	 * 
	 * @param nombre El nombre del monumento
	 * @param ubicacion Pais donde esta en monumento
	 * @param anyosAntiguedad Antiguedad del monumento en anyos
	 * @param material El material principal del monumento
	 * @param disponible Indica si el monumento esta disponible para ser visitado (si/no)
	 * @param estilo El estilo arquitectonico del monumento
	 * 
	 */
	public Monumento(String nombre, String ubicacion, int anyosAntiguedad, String material, String disponible,
			Estilo estilo) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.material = material;
		this.disponible = disponible;
		this.estilo = estilo;
	}
	
	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}
	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	/**
	 * Metodo que muestra los atributos por pantall
	 */
	@Override
	public String toString() {
		return  "\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nAnyosAntiguedad: " + anyosAntiguedad + 
				"\nMaterial: " + material + 
				"\nDisponible: " + disponible + 
				estilo;
	}
}
