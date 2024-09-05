package clases;

public class Monumento {
	private String nombre;
	private String ubicacion;
	private int anyosAntiguedad;
	private String material;
	private String disponible;
	private Estilo estilo;


	public Monumento(String nombre, String ubicacion, int anyosAntiguedad, String material, String disponible,
			Estilo estilo) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.material = material;
		this.disponible = disponible;
		this.estilo = estilo;
	}

	// setter y getter
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
	 * Metodo que muestra los atributos por pantalla
	 */
	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nUbicacion: " + ubicacion + "\nAnyosAntiguedad: " + anyosAntiguedad
				+ "\nMaterial: " + material + "\nDisponible: " + disponible + estilo;
	}
}
