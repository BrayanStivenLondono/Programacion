package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Compras implements Serializable{

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

	public ArrayList<Monedas> getListaMondeas() {
		return listaMonedas;
	}

	public void setListaMondeas(ArrayList<Monedas> listaMondeas) {
		this.listaMonedas = listaMondeas;
	}

	@Override
	public String toString() {
		return "Compras [codigoCompra=" + codigoCompra + ", fechaCompra=" + fechaCompra + ", cliente=" + cliente
				+ ", listaMondeas=" + listaMonedas + "]";
	}
	
	public int calcularPrecioTotal() {
		int precioTotal = 0;
		for (Monedas moneda : listaMonedas) {
			precioTotal += moneda.calcularPrecio();
		}
		return precioTotal;
	}
	
	public boolean comprobarMonedas(String nombreMoneda) {
		for (Monedas moneda : listaMonedas) {
			if (moneda.getNombreMoneda().equalsIgnoreCase(nombreMoneda)) {
				return true;
			}
		}
		return false;
	}
	
}
