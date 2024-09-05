package clases;

public class Verduras {
	private String codigoVerdura;
	private String tipoVerdura;
	private double precio;
	private String fruteria;
	private Proveedor proveedor;
	
	public Verduras(String codigoVerdura) {
		this.codigoVerdura = codigoVerdura;
	}

	//Setter y getter
	public String getCodigoVerdura() {
		return codigoVerdura;
	}
	public void setCodigoVerdura(String codigoVerdura) {
		this.codigoVerdura = codigoVerdura;
	}
	public String getTipoVerdura() {
		return tipoVerdura;
	}
	public void setTipoVerdura(String tipoVerdura) {
		this.tipoVerdura = tipoVerdura;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFruteria() {
		return fruteria;
	}
	public void setFruteria(String fruteria) {
		this.fruteria = fruteria;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	@Override
	public String toString() {
		return "Verduras [codigoVerdura=" + codigoVerdura + ", tipoVerdura=" + tipoVerdura + ", precio=" + precio
				+ ", fruteria=" + fruteria + ", proveedor=" + proveedor + "]";
	}
}
