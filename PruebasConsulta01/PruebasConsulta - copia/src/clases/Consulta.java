package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Consulta {
	
	private ArrayList<Receta> listaRecetas;
	private ArrayList<Paciente> listaPacientes;
	

	public Consulta() {
		listaRecetas = new ArrayList<Receta>();
		listaPacientes = new ArrayList<Paciente>();
	}
	
	public ArrayList<Receta> getListaRecetas() {
		return listaRecetas;
	}

	public void setListaRecetas(ArrayList<Receta> listaRecetas) {
		this.listaRecetas = listaRecetas;
	}

	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	
	public void altaPaciente(String codPaciente, String nombre) {
		if (!existePaciente(codPaciente)) {
			Paciente pac = new Paciente(codPaciente, nombre);
			pac.setFechaAlta(LocalDate.now());
			listaPacientes.add(pac);
		}else {
			System.out.println("El paciente ya existe");
		}
	}
	
	public boolean existePaciente(String codPaciente) {
		for (Paciente pac : listaPacientes) {
			if (pac != null && pac.getCodPaciente().equals(codPaciente)) {
				return true;
			}
		}
		return false;
	}
	
	public void listarPacientes() {
		for (Paciente pac : listaPacientes) {
			if (pac != null) {
				System.out.println(pac);
			}
		}
	}
	
	public Paciente buscarPaciente(String codPaciente) {
		for (Paciente pac : listaPacientes) {
			if (pac != null && pac.getCodPaciente().equals(codPaciente)) {
				return pac;
			}
		}
		return null;
	}
	
	public void altaReceta(String codReceta, String medicamento) {
		Receta rec = new Receta(codReceta, medicamento);
		listaRecetas.add(rec);

	}
	
	public void asignarPacienteReceta(String codPaciente, String codReceta) {		
		if (buscarPaciente(codPaciente) != null && buscarReceta(codReceta) != null) {
			Paciente pac = buscarPaciente(codPaciente);
			Receta rec = buscarReceta(codReceta);
			rec.setPaciente(pac);
		}
	}
	
	public Receta buscarReceta(String codReceta) {
		for (Receta rec : listaRecetas) {
			if (rec != null && rec.getCodReceta().equals(codReceta)) {
				return rec;
			}
		}
		return null;
	}
		
	public void listarRecetas() {
		for (Receta rec : listaRecetas) {
				System.out.println(rec);
		}
	}
	
	

	
}



