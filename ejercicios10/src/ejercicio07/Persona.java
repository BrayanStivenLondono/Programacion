package ejercicio07;

public class Persona {
	private String nombre;
	private String dni;
	
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	//settery getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
}
