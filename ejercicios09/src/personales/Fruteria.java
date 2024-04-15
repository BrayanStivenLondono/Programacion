package personales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Fruteria {
	private ArrayList<Fruta> listaFrutas;
	private ArrayList<Proveedor> listaProveedores;

	//CONSTRUCTOR
	public Fruteria() {
		listaFrutas = new ArrayList<Fruta>();
		listaProveedores = new ArrayList<Proveedor>();
	}
	
	public void altaFruta (int codigo, String nombre, String color, String fechaLlegada) {
		Fruta fruta = new Fruta (codigo, nombre);
		fruta.setColor(color);
		fruta.setFechaLlegada(LocalDate.parse(fechaLlegada));
		listaFrutas.add(fruta);
	}
	
	public void altaProveedor (String nombre, String ciudad) {
		if (!existeProveedor(nombre)) {
			Proveedor proveedor = new Proveedor (nombre, ciudad);
			listaProveedores.add(proveedor);
		} 
	}
	
	public boolean existeProveedor (String nombre) {
		for (Proveedor i : listaProveedores) {
			if (i!=null && i.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}
	
	public void listarProveedores () {
		for (Proveedor i : listaProveedores) {
			if (i!=null) {
				System.out.println(i);
			} 
		}
	}
	
	public void listarFrutas () {
		for (Fruta i : listaFrutas) {
			if (i!=null) {
				System.out.println(i);
			}
		}
	}
	
	public Proveedor buscarProveedor (String nombre) {
		for (Proveedor i : listaProveedores) {
			if (i!=null && i.getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return null;
	}
	
	public Fruta buscarFruta (String nombre) {
		for (Fruta i : listaFrutas) {
			if (i!=null && i.getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return null;
	}
	
	public void buscarProveedorPorAnno (int anno) {
		for (Fruta i : listaFrutas) {
			if (i!=null && i.getFechaLlegada().getYear()==anno) {
				System.out.println(i);
			}
		}
	}
	public void eliminarFruta (String nombre) {
		Iterator<Fruta> iterador = listaFrutas.iterator();
		while (iterador.hasNext()) {
			Fruta elemento = iterador.next();
			if (elemento.getNombre().equalsIgnoreCase(nombre)) {
				iterador.remove();
			}
		}
	}
	
	public void asignarProveedor (String nombreFruta, String nombreProveedor) {
		if (            buscarFruta(nombreFruta)!=null && 
				buscarProveedor(nombreProveedor)!=null) {
			Fruta    fruta      = buscarFruta (nombreFruta);
			Proveedor proveedor = buscarProveedor (nombreProveedor);
			fruta.setProveedorFruta(proveedor);
		}
	}
	
	public void listarFrutaPorProveedor (String nombre) {
		for (Fruta i : listaFrutas) {
			if (i.getProveedorFruta()!=null && i.getProveedorFruta().getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(i);
			}
		}
	}
	
	public void cambiarNombreFruta (String nombre, String nuevoNombre) {
		for (Fruta fruta : listaFrutas) {
			if (fruta!=null && fruta.getNombre().equalsIgnoreCase(nombre)) {
				fruta.setNombre(nuevoNombre);
			}
		}
	}
	
	public void estadisticasFrutas () {
		int cantidadFrutas = 0;
		for (Fruta frutas : listaFrutas) {
			if (frutas!=null) {
				cantidadFrutas++;
			}
		}
		System.out.println("Cantidad de Frutas: "+cantidadFrutas);
	}
}
