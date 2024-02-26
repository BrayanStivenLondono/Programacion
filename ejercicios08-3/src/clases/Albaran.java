package clases;

import java.time.LocalDate;

public class Albaran {
	private String codAlbaran;
	private double precio;
	private String codVehiculo;
	private LocalDate fecha; // LocalDate.parse(fechaNacimiento)
	
	//constructor
	public Albaran (String codAlbaran) {
		this.codAlbaran = codAlbaran; //lo inicializo
	}
	
	//setter y getter
	public String getCodAlbaran() {
		return codAlbaran;
	}
	public void setCodAlbaran(String codAlbaran) {
		this.codAlbaran = codAlbaran;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodVehiculo() {
		return codVehiculo;
	}
	public void setCodVehiculo(String codVehiculo) {
		this.codVehiculo = codVehiculo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Albaran [codAlbaran=" + codAlbaran + ", precio=" + precio + ", codVehiculo=" + codVehiculo + ", fecha="
				+ fecha + "]";
	}
	
}
