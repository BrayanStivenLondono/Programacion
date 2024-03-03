package clases;

public class Monumento {
	private String nombre;
	private String ubicacion;
	private int anyosAntiguedad;
	private String material;
	private String estilo;
	private String disponible;
	
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
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public String isDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return  "\nNombre: " + nombre + 
				"\nUbicacion: " + ubicacion + 
				"\nAnyosAntiguedad: " + anyosAntiguedad + 
				"\nMaterial: " + material + 
				"\nEstilo: " + estilo + 
				"\nDisponible: " + disponible;
	}
}
