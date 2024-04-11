package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorTrabajos {
	private ArrayList<Trabajo> listaTrabajos;
	private ArrayList<Responsable> listaResposables;
	
	public GestorTrabajos () {
		listaTrabajos = new ArrayList<Trabajo>();
		listaResposables = new ArrayList<Responsable>();
	}
	
	public void altaResponsable (String dni, String nombre) {
		if (!existeResponsable(dni)) {//compruebo que no existe con un metodo
			Responsable responsable = new Responsable (dni,nombre);
			responsable.setFechaContratacion(LocalDate.now());
			listaResposables.add(responsable);
		}
	}
	
	public void altaTrabajo (String nombre, String cliente, double presupuesto, String fechaConcepcion) {
		Trabajo trabajo = new Trabajo (nombre, cliente, presupuesto);
		trabajo.setFechaConcepcion(LocalDate.parse(fechaConcepcion));
		//trabajo.setResponsableTrabajo(responsableTrabajo);
		listaTrabajos.add(trabajo);
		
	}
	
	public void listarTrabajosAnno (int annio) {//NUEVO
		for (Trabajo trabajo : listaTrabajos) {
			if (trabajo.getFechaConcepcion().getYear()==annio) {
				System.out.println(trabajo);
			}
		}
	}
	
	public void eliminarTrabajo (String nombre) {//Borra con Iterator
		//creo un objeto Iterator para recorrer los trabajos
		Iterator<Trabajo> iterador = listaTrabajos.iterator();
		//lo recorro con el while
		while (iterador.hasNext()) {
			Trabajo trabajo = iterador.next();
			//compruebo el nombre
			if (trabajo.getNombre().equalsIgnoreCase(nombre)) {
				//lo borro
				iterador.remove();
			}
		}
	}
	//
	public void listarTrabajosDeResponsable (String dni) {//NUEVO
		for (Trabajo trabajo : listaTrabajos) {
			if (trabajo.getResponsableTrabajo()!=null && trabajo.getResponsableTrabajo().getDni().equalsIgnoreCase(dni)) {
				System.out.println(trabajo);
			}
		}
	}
	
	public void asignarResponsable (String dni, String nombreTrabajo) {
		if (buscarResponsable(dni)!=null && buscarTrabajo(nombreTrabajo)!=null) {//NUEVO
			Responsable responsable = buscarResponsable(dni);
			Trabajo trabajo = buscarTrabajo(nombreTrabajo);
			trabajo.setResponsableTrabajo(responsable);
		}
	}
	
	public void listarResponsables() {
		for (Responsable responsable : listaResposables) {
			if (responsable!=null) {
				System.out.println(responsable);
			}
		}
	}
	
	public Trabajo buscarTrabajo (String nombreTrabajo) {
		for (Trabajo trabajo : listaTrabajos) {
			if (trabajo!=null && trabajo.getNombre().equalsIgnoreCase(nombreTrabajo)) {
				return trabajo;
			}
		}
		return null;
	}
	
	public Responsable buscarResponsable (String dni) {
		for (Responsable responsable : listaResposables) {
			if (responsable!=null && responsable.getDni().equalsIgnoreCase(dni)) {
				return responsable;
			}
		}
		return null;
	}

	public boolean existeResponsable (String dniAVerificar) {
		for (Responsable responsable : listaResposables) {
			//conpruebo que sea nulo y que su dni existe
			if ((responsable!=null) && (responsable.getDni().equalsIgnoreCase(dniAVerificar))) {
				return true;
			}
		}
		return false;
	}
	
	//ere
	
	public void ere () {//elimino al responsable sin trabajo
		Iterator<Responsable> iteradorResponsable = listaResposables.iterator();
		while(iteradorResponsable.hasNext()) {
			Responsable responsableActual = iteradorResponsable.next();
			boolean estaEnTrabajo = false;
			for (Trabajo trabajo : listaTrabajos) {
				if (trabajo.getResponsableTrabajo()!=null && 
						trabajo.getResponsableTrabajo().getDni().equals(responsableActual.getDni())) {
					estaEnTrabajo = true;
					}
				}
			if (!estaEnTrabajo) {//si no tiene trabajo > lo borro
				iteradorResponsable.remove();
			}
		}
	}
	
	//asignarResponsableExperto
		
	public void asignarResponsableExperto (String nombreTrabajo) {
		Trabajo trabajo = buscarTrabajo(nombreTrabajo);
		if (trabajo!=null) {
			trabajo.setResponsableTrabajo(buscarResponableExperto());
		}
		
	}
	//buscarResponableExperto
	
	public Responsable buscarResponableExperto () {
		LocalDate fechaAntigua = null;
		for (int i = 0; i < listaResposables.size(); i++) {
			Responsable responsableActual = listaResposables.get(i);
			if (responsableActual!=null && i==0) {//coge el primero
				fechaAntigua = responsableActual.getFechaContratacion();//le asigna al primero las mas antigua
			} else {
				if (responsableActual!=null && responsableActual.getFechaContratacion().isBefore(fechaAntigua)) {
					fechaAntigua = responsableActual.getFechaContratacion(); //            <
				}
			}
		}
		for (Responsable jefe : listaResposables) {
			if (jefe!=null && jefe.getFechaContratacion().equals(fechaAntigua)) {
				return jefe;
			}
		}
		return null;
	}
}
