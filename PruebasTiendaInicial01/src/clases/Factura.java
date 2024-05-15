package clases;

import java.time.LocalDate;

public class Factura {
	
	private String codigoFactura;
	private double importeFactura;
	private LocalDate fechaFactura;
	private Cliente cliente;
	
	public Factura(String codigoFactura, double importeFactura) {
		this.codigoFactura = codigoFactura;
		this.importeFactura = importeFactura;
	}
	
	public String getCodigoFactura() {
		return codigoFactura;
	}
	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	public double getImporteFactura() {
		return importeFactura;
	}
	public void setImporteFactura(double importeFactura) {
		this.importeFactura = importeFactura;
	}
	public LocalDate getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", importeFactura=" + importeFactura + ", fechaFactura="
				+ fechaFactura + ", cliente=" + cliente + "]";
	}	
}
