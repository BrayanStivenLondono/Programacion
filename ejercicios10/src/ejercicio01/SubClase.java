package ejercicio01;

public class SubClase extends SuperClase {
	private int cantidad;

	public SubClase(int cantidad) {
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
