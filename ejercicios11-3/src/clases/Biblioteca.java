package clases;

import java.io.Serializable;

public class Biblioteca implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	public Biblioteca() {

	}

	public void altaSocio(String nombre) {

	}

	public void altaArticulo(String ibsn, String titulo, String editorial, String autor) {

	}

	public void altaArticulo(String ibsn, String titulo, String editorial, boolean online) {

	}

	public void listarArticulos() {

	}

	public void crearPrestamoSocio(int idSocio) {

	}

	public void mostrarPrestamosSocio(int idSocio) {

	}

	public boolean socioExiste(int idSocio) {
		return true;
	}

	public Socios devuelveSocio(int idSocio) {
		return null;
	}

	public void introducirArticuloPrestamo(int idPrestamo, String isbn) {

	}

	public boolean prestamoExiste(int idPrestamo) {
		return true;
	}

	public Prestamos devuelvePrestamo(int idPrestamo) {
		return null;
	}

	public boolean articuloExiste(String isbn) {
		return true;
	}

	public Articulos devuelveArticulo(String isbn) {
		return null;
	}

	public void listarPrestamos() {

	}

	public void listarSocios() {

	}

	public void guardarDatos() {
		
	}

	public void cargarDatos() {

	}
}