package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Colegio {
	
	private ArrayList<Asignatura> listaAsignaturas;
	private ArrayList<Profesor> listaProfesores;
	

	public Colegio() {
		listaAsignaturas = new ArrayList<Asignatura>();
		listaProfesores = new ArrayList<Profesor>();
	}
	
	public ArrayList<Asignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}

	public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}

	public ArrayList<Profesor> getListaProfesores() {
		return listaProfesores;
	}

	public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}
	
	public void altaProfesor(String codProfesor, String nombre) {
		if (!existeProfesor(codProfesor)) {
			Profesor prof = new Profesor(codProfesor, nombre);
			prof.setFechaAlta(LocalDate.now());
			listaProfesores.add(prof);
		}else {
			System.out.println("El profesor ya existe");
		}
	}
	
	public boolean existeProfesor(String codProfesor) {
		for (Profesor prof : listaProfesores) {
			if (prof != null && prof.getCodProfesor().equals(codProfesor)) {
				return true;
			}
		}
		return false;
	}
	
	public void listarProfesores() {
		for (Profesor prof : listaProfesores) {
			if (prof != null) {
				System.out.println(prof);
			}
		}
	}
	
	public Profesor buscarProfesor(String codProfesor) {
		for (Profesor prof : listaProfesores) {
			if (prof != null && prof.getCodProfesor().equals(codProfesor)) {
				return prof;
			}
		}
		return null;
	}
	
	public void altaAsignatura(String codAsignatura, String nombreAsignatura) {
		Asignatura asig = new Asignatura(codAsignatura, nombreAsignatura);
		listaAsignaturas.add(asig);

	}
	
	public void asignarProfesorAsignatura(String codProfesor, String codAsignatura) {		
		if (buscarProfesor(codProfesor) != null && buscarAsignatura(codAsignatura) != null) {
			Profesor prof = buscarProfesor(codProfesor);
			Asignatura asig = buscarAsignatura(codAsignatura);
			asig.setProfesor(prof);
		}
	}
	
	public Asignatura buscarAsignatura(String codAsignatura) {
		for (Asignatura asig : listaAsignaturas) {
			if (asig != null && asig.getCodAsignatura().equals(codAsignatura)) {
				return asig;
			}
		}
		return null;
	}
		
	public void listarAsignaturas() {
		for (Asignatura asig : listaAsignaturas) {
				System.out.println(asig);
		}
	}
	
	

	
}



