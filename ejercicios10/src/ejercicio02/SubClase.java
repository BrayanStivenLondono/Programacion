package ejercicio02;

public class SubClase extends SuperClase {
	private int cantidad;

	public SubClase(String nombre, int cantidad) {
		//super esta llamando al constructor de la clase padre
		//tiene un atributo nombre
		super(nombre);
		this.cantidad = cantidad;
	}

	//setter y getter
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override //coge el super de arriba
	public String toString() {
		return "SubClase [cantidad=" + cantidad + ", toString()=" + super.toString() + "]";
	}
}
