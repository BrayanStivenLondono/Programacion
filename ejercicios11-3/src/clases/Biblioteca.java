package clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final int DIAS_PRESTAMO = 15;

	private ArrayList<Articulos> articulos;
	private ArrayList<Socios> socios;
	private ArrayList<Prestamos> prestamos;

	public Biblioteca() {
		articulos = new ArrayList<Articulos>();
		socios = new ArrayList<Socios>();
		prestamos = new ArrayList<Prestamos>();

	}

	public void altaSocio(String nombre) {
		// agrega automaticamente
		socios.add(new Socios(socios.size() + 1, nombre, LocalDate.now()));
	}

	public void altaArticulo(String isbn, String titulo, String editorial, String autor) {
		articulos.add(new Libros(isbn, titulo, editorial, autor));
		Collections.sort(articulos);// lo ordena
	}

	public void altaRevista(String isbn, String titulo, String editorial, boolean disponible) {
		articulos.add(new Revistas(isbn, titulo, editorial, disponible));
		Collections.sort(articulos);
	}

	public void crearPrestamoSocio(int idSocio) {
		if (socioExiste(idSocio)) {
			prestamos.add(new Prestamos(prestamos.size() + 1, LocalDate.now(), LocalDate.now().plusDays(DIAS_PRESTAMO),
					devuelveSocio(idSocio)));
		} else {
			System.out.println("Socio no existe");
		}
	}

	public void introducirArticuloPrestamo(int idPrestamo, String isbn) {
		if (prestamoExiste(idPrestamo)) {
			if (articuloExiste(isbn) && !devuelvePrestamo(idPrestamo).comprobarArticulo(isbn)) {
				devuelvePrestamo(idPrestamo).listaArticulos.add(devuelveArticulo(isbn));
			} else {
				System.out.println("El articulo no existe");
			}
		} else {
			System.out.println("El prestamo no existe");
		}
	}

	public void mostrarPrestamosSocio(int idSocio) {
		for (Prestamos prestamo : prestamos) {
			if (prestamo.getSocio().equals(devuelveSocio(idSocio))) {
				System.out.println(prestamo);
			}
		}
	}

	public boolean socioExiste(int idSocio) {
		for (Socios socio : socios) {
			if (socio.getIdSocio() == idSocio) {
				return true;
			}
		}
		return false;
	}

	public Socios devuelveSocio(int idSocio) {
		for (Socios socio : socios) {
			if (socio.getIdSocio() == idSocio) {
				return socio;
			}
		}
		return null;
	}

	public boolean prestamoExiste(int idPrestamo) {
		for (Prestamos prestamo : prestamos) {
			if (prestamo.getIdPrestamo() == idPrestamo) {
				return true;
			}
		}
		return false;
	}

	public Prestamos devuelvePrestamo(int idPrestamo) {
		for (Prestamos prestamo : prestamos) {
			if (prestamo.getIdPrestamo() == idPrestamo) {
				return prestamo;
			}
		}
		return null;
	}

	public boolean articuloExiste(String isbn) {
		for (Articulos articulo : articulos) {
			if (articulo.getSbn().equalsIgnoreCase(isbn)) {
				return true;
			}
		}
		return false;
	}

	public Articulos devuelveArticulo(String isbn) {
		for (Articulos articulo : articulos) {
			if (articulo.getSbn().equalsIgnoreCase(isbn)) {
				return articulo;
			}
		}
		return null;
	}

	public void listarArticulos() {
		for (Articulos articulos : articulos) {
			System.out.println(articulos);
		}
	}

	public void listarPrestamos() {
		for (Prestamos prestamo : prestamos) {
			System.out.println(prestamo);
		}
	}

	public void listarSocios() {
		for (Socios socio : socios) {
			System.out.println(socio);
		}
	}

	public void guardarDatos() {//
		try {
			@SuppressWarnings("resource")
			ObjectOutputStream escritor = new ObjectOutputStream(
					new FileOutputStream(new File("src/datos.dat")));
			escritor.writeObject(articulos);//guarda todo el array
			escritor.writeObject(socios);
			escritor.writeObject(prestamos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public void cargarDatos() {
		try {
			ObjectInputStream lector = new ObjectInputStream(
					new FileInputStream("src/datos.dat"));
			socios = (ArrayList<Socios>) lector.readObject();
			articulos = (ArrayList<Articulos>) lector.readObject();
			prestamos = (ArrayList<Prestamos>) lector.readObject();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}