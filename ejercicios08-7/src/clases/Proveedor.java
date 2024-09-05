package clases;

public class Proveedor {
	private String nombreProveedor;
	private String telefonoContacto;
	
	public Proveedor (String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	@Override
	public String toString() {
		return "Proveedor [nombreProveedor=" + nombreProveedor + ", telefonoContacto=" + telefonoContacto + "]";
	}
}
