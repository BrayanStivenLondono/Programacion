package clases;

import java.io.Serializable;

public abstract class Monedas implements Comparable<Monedas>, Serializable{

	private static final long serialVersionUID = 1L;
	public abstract int calcularPrecio();
	public final static int PRECIO_MONEDA = 100;

	private String nombreMoneda;
	private double cambio;
	
	public Monedas(String nombreMoneda, double cambio) {
		this.nombreMoneda = nombreMoneda;
		this.cambio = cambio;
	}
	

	public String getNombreMoneda() {
		return nombreMoneda;
	}
	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Monedas [nombreMoneda=" + nombreMoneda + ", cambio=" + cambio + "]";
	}
	
}
