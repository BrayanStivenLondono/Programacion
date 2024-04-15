package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Botiquin {
	private String nombre;
	private String ubicacion;
	private ArrayList<Producto> producto;
	
	Scanner input = new Scanner (System.in);
	
	public Botiquin() {
		this.nombre = "";
		this.ubicacion = "";
		this.producto = new ArrayList<Producto>();
	}
	
	public Botiquin(String nombre, String ubicacion, ArrayList<Producto> producto) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.producto = producto;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Producto> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}
	
	public void rellenarBotiquin () {
		System.out.println("Nombre Botiquin");
		this.nombre = input.nextLine();
		System.out.println("Ubicacion del Botiquin");
		this.ubicacion = input.nextLine();
		
		System.out.println("____________________________");
		String respuesta = "";
		while (true) {
			System.out.println("Introducir otro producto? (*)");
			respuesta = input.nextLine();
			
			if (respuesta.equalsIgnoreCase("*")) {
				break;
			} else {
				Producto producto = new Producto ();
				producto.rellenar();
				this.producto.add(producto);//arraylist
			}
		}
	}
	public void visualizar () {
		System.out.println("Boquiquin: "+this.nombre);
		System.out.println("Ubicacion: "+this.ubicacion);
		System.out.println("\nLista de productos");
		for (Producto pro : producto) {
			pro.visualizar();
			System.out.println(pro);
		}
	}
	public void modificar () {
		System.out.println("Cual producto cambias?");
		String nombreBuscar = input.nextLine();
		System.out.println("Nuevo nombre");
		String nuevoNombre = input.nextLine();
		
		for (Producto i : producto) {
			if (i.getNombre().equalsIgnoreCase(nombreBuscar)) {
				i.setNombre(nuevoNombre);
				System.out.println("Nuevo nombre es "+i.getNombre());
			}
		}
	}
	public double mediaPrecio () {
		double mediaPrecio = 0;
		for (Producto producto : producto) {
			mediaPrecio += producto.getPrecio();
		}
		return mediaPrecio/producto.size();
	}
	public double totalPrecio () {
		double totalPrecio = 0;
		for (Producto producto : producto) {
			totalPrecio += producto.getPrecio();
		}
		return totalPrecio;
	}
 }
