package clases;

import java.io.Serializable;

public class ProductosOferta extends Productos implements Serializable {

	private static final long serialVersionUID = 1L;
	public final static double DESCUENTO_SEMANAL = 0.10;
	public final static double DESCUENTO_DIARIO = 0.15;
	
	private String tipo;
	
	public ProductosOferta(String nombreProducto, double precio, String tipo) {
		super(nombreProducto, precio);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ProductosOferta [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int compareTo(Productos o) {
		return getNombreProducto().compareTo(o.getNombreProducto());
	}

	@Override
	public double calcularPrecio() {
		int precioFinal = 0;
		if (tipo.equalsIgnoreCase("Semanal")) {
			precioFinal += (double) precio*DESCUENTO_SEMANAL;
		} else {
			precioFinal += (double) precio*DESCUENTO_DIARIO;
		}
		return precioFinal;
	}
	
}
