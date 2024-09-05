package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Inversion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Monedas> monedas;
	private ArrayList<Compras> compras;
	private ArrayList<Clientes> clientes;
	
	public Inversion() {
		monedas = new ArrayList<Monedas>();
		compras = new ArrayList<Compras>();
		clientes = new ArrayList<Clientes>();
	}
	
	public void altaCliente(String nombreCliente) {
		clientes.add(new Clientes(clientes.size()+1, 
				nombreCliente, LocalDate.now()));
		
	}
	
	public void altaMoneda(String nombreMoneda, double cambio, boolean online) {
		monedas.add(new Divisas(nombreMoneda, cambio, online));
		Collections.sort(monedas);
	}
	
	public void hacerCompraCliente(int codigoCliente) {
		compras.add(new Compras(compras.size()+1, 
				LocalDate.now(), 
				buscarCliente(codigoCliente)));
	}
	
	public void introducirMonedaClientes(int codigoCompra, String nombreMoneda) {
		if (existeCompra(codigoCompra) && (existeMoneda(nombreMoneda))) {
			if (!buscarCompras(codigoCompra).comprobarMonedas(nombreMoneda)) {
				buscarCompras(codigoCompra).listaMonedas.add(buscarMoneda(nombreMoneda));
			}
		}
	}
	
	public void mostrarClienteCompras(int codigoCliente) {
		for (Compras compra : compras) {
			if (compra.getCliente().equals(buscarCliente(codigoCliente))) {
				
			}
		}
	}
	
	public Clientes buscarCliente(int codigoCliente) {
		for (Clientes cliente : clientes) {
			if (cliente.getCodigoCliente()==codigoCliente) {
				return cliente;
			}
		}
		return null;
	}
	
	public Monedas buscarMoneda(String nombreMoneda) {
		for (Monedas moneda : monedas ) {
			if (moneda.getNombreMoneda().equalsIgnoreCase(nombreMoneda)) {
				return moneda;
			}
		}
		return null;
	}
	
	public Compras buscarCompras(int codigoCompras) {
		for (Compras compra : compras) {
			if (compra.getCodigoCompra()==codigoCompras) {
				return compra;
			}
		}
		return null;
	}
	
	public boolean existeMoneda(String nombreMoneda) {
		for (Monedas moneda : monedas) {
			if (moneda.getNombreMoneda().equalsIgnoreCase(nombreMoneda)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existeCliente(int codigoCliente) {
		for (Clientes cliente : clientes) {
			if (cliente.getCodigoCliente()==codigoCliente) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existeCompra(int codigoCompra) {
		for (Compras compra : compras) {
			if (compra.getCodigoCompra()==codigoCompra) {
				return true;
			}
		}
		return false;
	}
	
}
