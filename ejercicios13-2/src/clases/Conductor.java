package clases;

import java.io.Serializable;

public class Conductor extends Personal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String carnet;
	
	public Conductor () {
		super();
	}

	public Conductor(String dni, String nombre, String carnet) {
		super(dni, nombre);
		this.carnet = carnet;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	@Override
	public String toString() {
		return "Conductor [carnet=" + carnet + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personal o) {
		return getDni().compareTo(o.getDni());
	}
	
}
