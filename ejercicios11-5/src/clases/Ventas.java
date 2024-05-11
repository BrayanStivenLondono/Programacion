package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ventas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int codigoVenta;
	private Clientes cliente;
	private LocalDate fechaVenta;
	protected ArrayList<Productos> listaProductos;
	
	public Ventas(int codigoVenta, Clientes cliente, LocalDate fechaVenta) {
		this.codigoVenta = codigoVenta;
		this.cliente = cliente;
		this.fechaVenta = fechaVenta;
		this.listaProductos = new ArrayList<Productos>();
	}
	public int getCodigoVenta() {
		return codigoVenta;
	}
	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Productos> getListaProdcutos() {
		return listaProductos;
	}
	public void setListaProdcutos(ArrayList<Productos> listaProdcutos) {
		this.listaProductos = listaProdcutos;
	}
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	@Override
	public String toString() {
		return "Ventas [codigoVenta=" + codigoVenta + 
				", precioTotal=" + precioTotal() + 
				", cliente=" + cliente + 
				", listaProdcutos=" + listaProductos
				+ "]";
	}
	
	public double precioTotal() {
		double precioTotal = 0;
		for (Productos producto : listaProductos) {
			precioTotal =+ producto.calcularPrecio();
		}
		return precioTotal;
	}
	
	public boolean comprobarProducto(String nombreProducto) {
		for (Productos producto : listaProductos) {
			if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
				return true;
			}
		}
		return false;
	}
}
