package ejercicio01;

public class SuperClase {
	private String nombre;
	
	public SuperClase() {
		this.nombre = "Clase Padre";
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "SuperClase [nombre=" + nombre + "]";
	}

}
