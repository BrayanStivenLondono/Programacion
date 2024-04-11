package personales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Fruteria2 {
	private ArrayList<Fruta> frutas;
	private ArrayList<Proveedor> proveedores;
	
	public Fruteria2 () {
		frutas = new ArrayList<Fruta>();
		proveedores = new ArrayList<Proveedor>();
	}
	
	public void altaProveedor (String nombre, String ciudad) {
		if (!existeProveedor(nombre)) {
			Proveedor proveedor = new Proveedor (nombre, ciudad);
			proveedores.add(proveedor);
		}
	}
	public void altaFruta (int codigo, String nombre, String color, String fechaLlegada) {
		Fruta fruta = new Fruta (codigo, nombre);
		fruta.setColor(color);
		fruta.setFechaLlegada(LocalDate.parse(fechaLlegada));
		frutas.add(fruta);
	}
	public boolean existeProveedor (String nombreProveedor) {
		for (Proveedor proveedor : proveedores) {
			if (proveedor!=null && proveedor.getNombre().equalsIgnoreCase(nombreProveedor)) {
				return true;
			}
		}
		return false;
	}
	public Fruta buscarFruta (String nombre) {
		for (Fruta fruta : frutas) {
			if (fruta!=null && fruta.getNombre().equalsIgnoreCase(nombre)) {
				return fruta;
			}
		}
		return null;
	}
	public Proveedor buscarProveedor (String nombre) {
		for (Proveedor proveedor : proveedores) {
			if (proveedor!=null && proveedor.getNombre().equalsIgnoreCase(nombre)) {
				return proveedor;
			}
		}
		return null;
	}
	public void eliminarFruta (String nombre) {
		Iterator<Fruta> iterador = frutas.iterator();
		while (iterador.hasNext()) {
			Fruta elemento = iterador.next();
			if (elemento.getNombre().equalsIgnoreCase(nombre)) {
				iterador.remove();
			}
		}
	}
	
	public void asignarProveedorAFruta (String nombreFruta, String nombreProveedor) {
		if (buscarFruta(nombreFruta)!=null && buscarProveedor(nombreProveedor)!=null) {
			Fruta fruta = buscarFruta (nombreFruta);
			Proveedor proveedor = buscarProveedor (nombreProveedor);
			fruta.setProveedorFruta(proveedor);
		}
	}
}
