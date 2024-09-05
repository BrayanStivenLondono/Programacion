package clases2;

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
import clases.Clientes;


public class Supermercado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Productos> productos;
	private ArrayList<Clientes> clientes;
	private ArrayList<Ventas> ventas;
	
	public Supermercado() {
		productos = new ArrayList<Productos>();
		clientes = new ArrayList<Clientes>();
		ventas = new ArrayList<Ventas>();
	}
	
	public void altaCliente(String nombreCliente) {
		clientes.add(new Clientes(
				clientes.size()+1, 
				nombreCliente, 
				LocalDate.now()));
	}
	
	public void altaProducto(String nombreProducto, double precio, String tipoOferta) {
		productos.add(new ProductosOferta(nombreProducto, precio, tipoOferta));
		Collections.sort(productos);
	}
	
	public void crearVentaCliente(int codigoCliente) {
		
	}
	
	public void introducirProductosVenta(int codigoVenta, String nombreProducto) {
		if (existeVenta(codigoVenta) && (existeProducto(nombreProducto))) {
			if (!buscarVenta(codigoVenta).comprobarProductos(nombreProducto)) {
				buscarVenta(codigoVenta).listaProductos.add(buscarProducto(nombreProducto));
			}
		}
	}
	
	public void mostarVentasCliente(int codigoCliente) {
		for (Ventas venta : ventas) {
<<<<<<< HEAD
			if (venta.getCliente().getCodigoCliente()==codigoCliente) {
=======
			if (venta.getCliente().equals(buscarCliente(codigoCliente))) {
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
				System.out.println(venta);
			}
		}
	}
	
	/*public void mostrarVentasCliente(int codigoCliente) {
		for (Ventas venta : ventas) {
			if (venta.getCliente().equals(buscarCliente(codigoCliente))) {
				System.out.println(venta);
			}
		}
	}*/
	
	
	public Clientes buscarCliente(int codigoCliente) {
		for (Clientes cliente : clientes) {
			if (cliente.getCodigoCliente()==codigoCliente) {
				return cliente;
			}
		}
		return null;
	}
	
	public Productos buscarProducto(String nombreProducto) {
		for (Productos producto : productos) {
			if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
				return producto;
			}
		}
		return null;
	}
	
	public Ventas buscarVenta(int codigoVenta) {
		for (Ventas venta : ventas) {
			if (venta.getCodigoVenta()==codigoVenta) {
				return venta;
			}
		}
		return null;
	}
	
	public boolean existeProducto(String nombreProducto) {
		for (Productos producto : productos) {
			if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existeCliente(int codigoCliente) {
		for (Clientes cliente : clientes) {
			if (cliente.getCodigoCliente()==(codigoCliente)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existeVenta(int codigoVenta) {
		for (Ventas venta : ventas) {
			if (venta.getCodigoVenta()==codigoVenta) {
				return true;
			}
		}
		return false;
	}
	
	public void listarVentas() {
		for (Ventas venta : ventas) {
			System.out.println(venta);
		}
	}
	
	public void listarClientes() {
		for (Clientes cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
	public void listarProductos() {
		for (Productos producto : productos) {
			System.out.println(producto);
		}
	}
	
	public void guardarDatos() {
		try {
			@SuppressWarnings("resource")
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(new File("src/datos.dat")));
			escritor.writeObject(clientes);
			escritor.writeObject(ventas);
			escritor.writeObject(productos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public void cargarDatos() {
		try {
			ObjectInputStream lector = new ObjectInputStream(new  FileInputStream("src/datos.dat"));
			ventas = (ArrayList<Ventas>) lector.readObject();
			clientes = (ArrayList<Clientes>) lector.readObject();
			productos = (ArrayList<Productos>) lector.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
