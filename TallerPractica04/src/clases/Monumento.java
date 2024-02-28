package clases;

public class Monumento {
	private String nombre;
	private String ubicacion;
	
	
	public Monumento(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Monumento [nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
	
}
