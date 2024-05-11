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

public class Inversion implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Compras> compras;
	private ArrayList<Monedas> monedas;
	private ArrayList<Clientes> clientes;
	
	public Inversion() {
		compras = new ArrayList<Compras>();
		monedas = new ArrayList<Monedas>();
		clientes = new ArrayList<Clientes>();
	}
	
	public void altaCliente(String nombre) {
		clientes.add(new Clientes(
				clientes.size()+1, 
				nombre, 
				LocalDate.now()));
	}
	
	public void altaMoneda(String nombreMoneda, double cambio, boolean online) {
		monedas.add(new Divisas(nombreMoneda, cambio, online));
		Collections.sort(monedas);
	}
	
	public void altaMoneda(String nombreMoneda, double cambio, String banco) {
		monedas.add(new CriptoMonedas(nombreMoneda, cambio, banco));
		Collections.sort(monedas);
	}
	
	public void crearCompraCliente(int codigoCliente) {
		if (existeCliente(codigoCliente)) {
			compras.add(new Compras(
					clientes.size()+1, 
					LocalDate.now()  , 
					buscarCliente(codigoCliente)));
		}
	}
	
	public void introducirMonedasCompra(int codigoCompra, String nombreMoneda) {
		if (exiteCompra(codigoCompra) && existeMoneda(nombreMoneda)) {//que existan
			if (!buscarCompra(codigoCompra).comprobarMoneda(nombreMoneda)) {//que no haya repetida
				buscarCompra(codigoCompra).listaMonedas.add(buscarMoneda(nombreMoneda));
			} else {
				System.out.println("La moneda no existe");
			}
		} else {
			System.out.println("La compra no existe");
		}
	}
	
	public void mostrarComprasCliente(int codigoCliente) {
		for (Compras compra : compras) {
			if (compra.getCliente().equals(buscarCliente(codigoCliente))) {
				System.out.println(compra);
			}
		}
	}
	
	public Clientes buscarCliente(int codigoCliente) {
		for (Clientes cliente : clientes) {
			if (cliente.getCodigoCliente()==codigoCliente) {
				return cliente;
			}
		}
		return null;
	}
	
	public Compras buscarCompra(int codigoCompra) {
		for (Compras compra : compras) {
			if (compra.getCodigoCompra()==codigoCompra) {
				return compra;
			}
		}
		return null;
	}
	
	public Monedas buscarMoneda(String nombreMoneda) {
		for (Monedas moneda : monedas) {
			if (moneda.getNombreMoneda().equalsIgnoreCase(nombreMoneda)) {
				return moneda;
			}
		}
		return null;
	}
	
	public boolean existeCliente(int codigoCliente) {
		for (Clientes cliente : clientes) {
			if (cliente.getCodigoCliente()==codigoCliente) {
				return true;
			}
		}
		return false;
	}
	
	public boolean existeMoneda(String nombreMoneda) {
		for (Monedas moneda : monedas) {
			if (moneda.getNombreMoneda().equals(nombreMoneda)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean exiteCompra(int codigoCompra) {
		for (Compras compra : compras) {
			if (compra.getCodigoCompra()==codigoCompra) {
				return true;
			}
		}
		return false;
	}
	
	public void listarCompras() {
		for (Compras compra : compras) {
			System.out.println(compra);
		}
	}
	
	public void listarCliente() {
		for (Clientes cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
	public void listarMonedas() {
		for (Monedas moneda : monedas) {
			System.out.println(moneda);
		}
	}
	
	@SuppressWarnings("resource")
	public void guardarDatos() {
		try {
			ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(new File ("src/datos.dat")));
			escritor.writeObject(clientes);
			escritor.writeObject(compras);
			escritor.writeObject(monedas);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	public void cargarDatos() {
		try {
			ObjectInputStream lector = new ObjectInputStream(new FileInputStream("src/datos.dat"));
			 clientes = (ArrayList<Clientes>) lector.readObject();
			 System.out.println("Clientes");
			 System.out.println(clientes);
			 monedas = (ArrayList<Monedas>) lector.readObject();
			 System.out.println("Monedas");
			 System.out.println(monedas);
			 compras = (ArrayList<Compras>) lector.readObject();
			 System.out.println("Compras");
			 System.out.println(compras);
			 //PARA MOSTRARLOS EN LINEAS SEPARADAS
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
