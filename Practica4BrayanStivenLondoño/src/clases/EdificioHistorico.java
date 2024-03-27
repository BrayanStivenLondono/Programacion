package clases;

public class EdificioHistorico {
	private String nombre;
	private String ubicacion;
	private int edad;
	private String material;
	private Estilo estilo;

	/**
	 * Constructo de la clase EdificioHistorico
	 * 
	 * @param nombre    El nombre del EdificioHistorico
	 * @param ubicacion El pais donde esta el EdificioHistorico
	 * @param edad      anños de antiguedad del EdificioHistorico, anyos vividos en
	 *                  caso de no estar vivo
	 * @param estilo    El estilo aquitectonico del EdificioHistorico
	 * 
	 */
	public EdificioHistorico(String nombre, String ubicacion, int edad, String material, Estilo estilo) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.edad = edad;
		this.material = material;
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

	public void setUbicacion(String nacionalidad) {
		this.ubicacion = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nUbicación: " + ubicacion + "\nEdad: " + edad + "\nMaterial: " + material
				+ estilo;

	}

}
