package clases2;

import java.io.Serializable;

public class ProductosOferta extends Productos implements Serializable {

	private static final long serialVersionUID = 1L;
	public final static double DESCUENTO_SEMANAL = 0.10;
	public final static double DESCUENTO_DIARIO = 0.15;
	
	private String tipoOferta; 
	
	public ProductosOferta(String nombreProducto, double precio, String tipoOferta) {
		super(nombreProducto, precio);
		this.tipoOferta = tipoOferta;
	}

	public String getTipoOferta() {
		return tipoOferta;
	}
	public void setTipoOferta(String tipoOferta) {
		this.tipoOferta = tipoOferta;
	}
	
	@Override
	public String toString() {
		return "ProductosOferta [tipoOferta=" + tipoOferta + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Productos o) {
		return getNombreProducto().compareTo(o.getNombreProducto());
	}

	@Override
	public double calcularPrecio() {
		double precio = 0;
		if (tipoOferta.equalsIgnoreCase("Semanal")) {
			precio += PRECIO*DESCUENTO_SEMANAL;
		} else if (tipoOferta.equalsIgnoreCase("Diaria")) {
			precio += PRECIO*DESCUENTO_DIARIO;
		} else {
			precio += PRECIO;
		}
		return precio;
	}
	
}
