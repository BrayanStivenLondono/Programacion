package clases2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ventas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigoVenta;
	private LocalDate fechaVenta;
	private Clientes cliente;
	protected ArrayList<Productos> listaProductos;
	
	public Ventas(int codigoVenta, LocalDate fechaVenta, Clientes clientes) {
		this.codigoVenta = codigoVenta;
		this.fechaVenta = fechaVenta;
		this.cliente = clientes;
		this.listaProductos = new ArrayList<Productos>();
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	@Override
	public String toString() {
		return "Ventas [codigoVenta=" + codigoVenta + ", fechaVenta=" + fechaVenta + ", cliente=" + cliente
				+ ", listaProductos=" + listaProductos + "]";
	}

	public double precioTotal() {
		double precio = 0;
		for (Productos producto : listaProductos) {
			precio += producto.calcularPrecio();
		}
		return precio;
	}
	
	public boolean comprobarProductos(String nombreProducto) {
		for (Productos producto : listaProductos) {
			if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
				return true;
			}
		}
		return false;
	}
}
