package ejercicio03;

public class Coche extends Vehiculo {
	private double km;

	public Coche(String matricula, String marca, int plazas, double km) {
		super(matricula, marca, plazas);
		this.km = km;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Coche [km=" + km + ", toString()=" 
	     + super.toString() + "]";
	}
	
	public void trucarCuentakm () {
		this.km = 0;
	}
}
