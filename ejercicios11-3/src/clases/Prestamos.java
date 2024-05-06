package clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Prestamos implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idPrestamo;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	private Socios socio;
	private ArrayList<Articulos> listaArticulos;
	
	public Prestamos(int idPrestamo, LocalDate fechaPrestamo, LocalDate fechaDevolucion, Socios socio,
			ArrayList<Articulos> listaArticulo) {
		super();
		this.idPrestamo = idPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.socio = socio;
		this.listaArticulos = listaArticulo;
		
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Socios getSocio() {
		return socio;
	}

	public void setSocio(Socios socio) {
		this.socio = socio;
	}

	public ArrayList<Articulos> getListaArticulo() {
		return listaArticulos;
	}

	public void setListaArticulo(ArrayList<Articulos> listaArticulo) {
		this.listaArticulos = listaArticulo;
	}

	public int cancularPuntos() {
		int puntos = 0;
		for (Articulos articulos : listaArticulos) {
			puntos += articulos.calcularPuntos();//llama al metodo
		}
		return puntos;
	}
	
	//comprobar que no halla articulos con el mismo isbn
	public boolean comprobarArticulo(String isbn) {
		for (Articulos articulos : listaArticulos) {
			if (articulos.getSbn().equalsIgnoreCase(isbn)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Prestamos [idPrestamo=" + idPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion="
				+ fechaDevolucion + ", socio=" + socio + ", listaArticulos=" + listaArticulos + "]";
	}
}
