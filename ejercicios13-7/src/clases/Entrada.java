package clases;

public class Entrada implements Comparable<Entrada>{
	private String codigo;
	private double precio;
	private boolean vip;
	
	public Entrada() {
		
	}
	
	public Entrada(String codigo, double precio, boolean vip) {
		this.codigo = codigo;
		this.precio = precio;
		this.vip = vip;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Entrada [codigo=" + codigo + ", precio=" + precio + ", vip=" + vip + "]";
	}
	
	@Override
	public int compareTo(Entrada o) {
		return getCodigo().compareTo(o.getCodigo());
	}
	
	
}
