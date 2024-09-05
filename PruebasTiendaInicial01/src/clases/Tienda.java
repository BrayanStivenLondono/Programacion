package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {
	
	private ArrayList<Factura> listaFacturas;
	private ArrayList<Cliente> listaClientes;
	

	public Tienda() {
		listaFacturas = new ArrayList<Factura>();
		listaClientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(ArrayList<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public void altaCliente(String idCliente, String nombre) {
		if (!existeCliente(idCliente)) {
			Cliente cli = new Cliente(idCliente, nombre);
			cli.setFechaAlta(LocalDate.now());
			listaClientes.add(cli);
		}else {
			System.out.println("El cliente ya existe");
		}
	}
	
	public boolean existeCliente(String idCliente) {
		for (Cliente cli : listaClientes) {
			if (cli != null && cli.getIdCliente().equals(idCliente)) {
				return true;
			}
		}
		return false;
	}
	
	public void listarClientes() {
		for (Cliente cli : listaClientes) {
			if (cli != null) {
				System.out.println(cli);
			}
		}
	}
	
	public Cliente buscarCliente(String idCliente) {
		for (Cliente cli : listaClientes) {
			if (cli != null && cli.getIdCliente().equals(idCliente)) {
				return cli;
			}
		}
		return null;
	}
	
	public void altaFactura(String codigoFactura, double importeFactura, String fechaFactura) {
		Factura facturacion = new Factura(codigoFactura, importeFactura);
		facturacion.setFechaFactura(LocalDate.parse(fechaFactura));
		listaFacturas.add(facturacion);

	}
	
	public void asignarClienteFactura(String idCliente, String codigoFactura) {		
		if (buscarCliente(idCliente) != null && buscarFactura(codigoFactura) != null) {
			Cliente cli = buscarCliente(idCliente);
			Factura facturacion = buscarFactura(codigoFactura);
			facturacion.setCliente(cli);
		}
	}
	
	public Factura buscarFactura(String codigoFactura) {
		for (Factura facturacion : listaFacturas) {
			if (facturacion != null && facturacion.getCodigoFactura().equals(codigoFactura)) {
				return facturacion;
			}
		}
		return null;
	}
	
	public void listarFacturasAnno(int anno) {
		for (Factura facturacion : listaFacturas) {
			if (facturacion.getFechaFactura().getYear() == anno) {
				System.out.println(facturacion);
			}
		}
	}
	
	public void listarFacturas() {
		for (Factura facturacion : listaFacturas) {
				System.out.println(facturacion);
		}
	}	
}



