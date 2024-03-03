package clases;

public class Arquitecto {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private String estilo;
	private int edad;
	
	public Arquitecto (String nombre) {
		this.nombre = nombre;
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
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return  "\nNombre: " + nombre + 
				"\nApellido: " + apellido + 
				"\nNacionalidad: " + nacionalidad +
				"\nEstilo: " + estilo + 
				"\nEdad: " + edad;
	}
	
}
