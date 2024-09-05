package clases;

import java.io.Serializable;

public class Divisas extends Monedas implements Serializable{

	private static final long serialVersionUID = 1L;
	public final static double DESCUENTO = 0.05;
	
	
	private boolean online;
	
	public Divisas(String nombreMoneda, double cambio, boolean online) {
		super(nombreMoneda, cambio);
		this.online = online;
	}
	
	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	
	@Override
	public String toString() {
		return "Divisas [online=" + online + ", toString()=" + super.toString() + "]";
	}

	@Override//Si ordeno necesito el compareTo
	public int compareTo(Monedas o) {
		return getNombreMoneda().compareTo(o.getNombreMoneda());
	}

	@Override
	public int calcularPrecio() {
		int precioFinal = PRECIO;
		if (online) {
			precioFinal += (double) PRECIO*DESCUENTO;
		} 
		return precioFinal;
	}
	
}
