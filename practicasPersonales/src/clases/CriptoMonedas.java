package clases;

import java.io.Serializable;

public class CriptoMonedas extends Monedas implements Serializable{

	private static final long serialVersionUID = 1L;
	public final static String BANCO = "BBVA";
	public final static double DESCUENTO = 0.10;
	
	private String banco;

	public CriptoMonedas(String nombreMoneda, double cambio, String banco) {
		super(nombreMoneda, cambio);
		this.banco = banco;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "CriptoMonedas [banco=" + banco + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Monedas o) {
		return getNombreMoneda().compareTo(o.getNombreMoneda());
	}

	@Override
	public int calcularPrecio() {
		int precioFinal = PRECIO_MONEDA;
		if (banco.equalsIgnoreCase(BANCO)) {
			precioFinal += (double) PRECIO_MONEDA*DESCUENTO;
		}
		return precioFinal;
	}
	
}
