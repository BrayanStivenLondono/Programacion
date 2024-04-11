package personales;

public class Proveedor {
	private String nombre;
	private String ciudad;
	
	public Proveedor(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	//Setter y Getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
}
