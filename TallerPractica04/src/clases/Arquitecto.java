package clases;

public class Arquitecto {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private int edad;
	private Estilo estilo;

	/** 
	 * Constructo de un arquitecto
	 * 
	 * @param nombre El nombre del arquitecto
	 * @param apellido El apellido del arquitecto
	 * @param nacionalidad El pais donde nacio el arquitecto
	 * @param edad Edad del arquitecto, anyos vividos en caso de no estar vivo
	 * @param estilo El estilo aquitectonico del arquitecto
	 * 
	 */
	public Arquitecto(String nombre, String apellido, String nacionalidad, int edad, Estilo estilo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.estilo = estilo;
	}
	
	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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

	/**
	 * Metodo que muestra los atributos por pantall
	 */
	@Override
	public String toString() {
		return  "\nNombre: " + nombre + 
				"\nApellido: " + apellido + 
				"\nNacionalidad: " + nacionalidad + 
				"\nEdad: " + edad +
				estilo;
	}
	
}
