package clases;

public class Frutas {
	private String codigoFruta;
	private String tipoFruta;
	private double precio;
	private String fruteria;
	private Proveedor proveedor; //recibe un objeto
	
	public Frutas(String codigoFruta) {
		this.codigoFruta = codigoFruta;
	}
	public String getCodigoFruta() {
		return codigoFruta;
	}
	public void setCodigoFruta(String codigoFruta) {
		this.codigoFruta = codigoFruta;
	}
	public String getTipoFruta() {
		return tipoFruta;
	}
	public void setTipoFruta(String tipoFruta) {
		this.tipoFruta = tipoFruta;
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
		return "Frutas [codigoFruta=" + codigoFruta + ", tipoFruta=" + tipoFruta + ", precio=" + precio + ", fruteria="
				+ fruteria + ", proveedor=" + proveedor + "]";
	}
	

}
