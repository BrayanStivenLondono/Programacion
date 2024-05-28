package clases;

public class Entrada implements Comparable<Entrada> {

	private String codigo;
	private float precio;
	private boolean vip;
	
	//Constructor
	public Entrada(String codigo, float precio, boolean vip) {
		this.codigo = codigo;
		this.precio = precio;
		this.vip = vip;
	}
	
	//Getters y setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	//To String
	@Override
	public String toString() {
		return "Entrada [codigo=" + codigo + ", precio=" + precio + ", vip=" + vip + "]";
	}

	@Override
	public int compareTo(Entrada o) {
		return getCodigo().compareTo(o.getCodigo());
	}
	
}