package clases;

import java.io.Serializable;

public class ProductosEspeciales extends Productos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private boolean fragil;

	public ProductosEspeciales(String nombreProducto, double precio, boolean fragil) {
		super(nombreProducto, precio);
		this.fragil = fragil;
	}
	
	public boolean isFragil() {
		return fragil;
	}
	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}
	
	@Override
	public String toString() {
		return "ProductosEspeciales [fragil=" + fragil + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Productos o) {
		return getNombreProducto().compareTo(o.getNombreProducto());
	}

	@Override
	public double calcularPrecio() {		
		double precioFinal = 0;
		if (fragil) {
			precioFinal += precio*10;
		} else {
			precioFinal += precio;
		}
		return precioFinal;
	}
	
}
