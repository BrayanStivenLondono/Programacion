package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Compras implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigoCompra;
	private LocalDate fechaCompra;
	private Clientes cliente;
	protected ArrayList<Monedas> listaMonedas;

	public Compras(int codigoCompra, LocalDate fechaCompra, Clientes cliente) {
		this.codigoCompra = codigoCompra;
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
		this.listaMonedas = new ArrayList<Monedas>();
	}

	// setter y getter
	public int getCodigoCompra() {
		return codigoCompra;
	}

	public void setCodigoCompra(int codigoCompra) {
		this.codigoCompra = codigoCompra;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Monedas> getListaMonedas() {
		return listaMonedas;
	}

	public void setListaMonedas(ArrayList<Monedas> listaMonedas) {
		this.listaMonedas = listaMonedas;
	}
	
	public double calcularPrecioTotal() {
		double precioTotal = 0;
		for (Monedas monedas : listaMonedas) {
			precioTotal += monedas.calcularPrecio();
		}
		return precioTotal;
	}

	@Override
	public String toString() {
		return "Compras [codigoCompra=" + codigoCompra + 
				", fechaCompra=" + fechaCompra + 
				", precioTotal=" + calcularPrecioTotal() + 
				", cliente=" + cliente + 
				", listaMonedas=" + listaMonedas + "]";
	}

	public boolean comprobarMoneda(String nombreMoneda) {
		for (Monedas moneda : listaMonedas) {
			if (moneda.getNombreMoneda().equalsIgnoreCase(nombreMoneda)) {
				return true;
			}
		}
		return false;
	}
	
}
