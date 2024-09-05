package ejercicio08_7;

public class Frutas {
	private String nombre;
	private String color;
	private double precio;
	private String tama�o;
	private Proveedor proveedor;
	
	public Frutas(String nombre, String color, double precio, 
			String tama�o, Proveedor proveedor) {
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
		this.tama�o = tama�o;
		this.proveedor = proveedor;
	}

	public String getNombre() {
		return nombre;
	}
	//setter y getter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Frutas [nombre=" + nombre + ", color=" + color + ", precio=" + precio + ", tama�o=" + tama�o
				+ ", " + proveedor + "]";
	}
	
	
}