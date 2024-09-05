package clases;

import java.sql.Date;

public class Entrada {
	private int codigo;
	private Date fechaEntrada;
	private int precio;
	private Cliente cliente;
	
	public Entrada() {
		
	}
	
	public Entrada(int codigoEntrda,int precio ,Cliente cliente) {
		this.codigo  = codigoEntrda;
		this.precio = precio;
		this.cliente = cliente;
	}
	
	public Entrada(int codigo, String fechaEntrada, int precio, Cliente cliente) {
		this.codigo = codigo;
		this.fechaEntrada = Date.valueOf(fechaEntrada);
		this.precio = precio;
		this.cliente = cliente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	@Override
	public String toString() {
		return "Entrada [codigo=" + codigo + ", fechaEntrada=" + fechaEntrada + ", precio=" + precio + ", cliente="
				+ cliente + "]";
	}

	public void comprobarEntrada(int codigoEntrada) {
		
	}
}
