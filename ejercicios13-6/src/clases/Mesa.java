package clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Mesa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private double cuenta;
	private int numero;
	private ArrayList<Persona> personas;
	
	public Mesa() {
		
	}

	public Mesa(double cuenta, int numero) {
		this.cuenta = cuenta;
		this.numero = numero;
		this.personas = new ArrayList<Persona>();
	}

	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Mesa [cuenta=" + cuenta + ", numero=" + numero + ", personas=" + personas + "]";
	}
	
}
