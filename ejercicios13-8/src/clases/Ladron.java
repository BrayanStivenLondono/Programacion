package clases;

public class Ladron extends Protagonista {

	static final double CANTIDAD_ROBOS = 4;
	static final double GANACIA_POR_ROBO = 5000;
	
	private String rol;
	private boolean antecedente;
		
	public Ladron() {
		super();
	}

	public Ladron(String nombre, String nombreSerie, String rol, boolean antecedente) {
		super(nombre, nombreSerie);
		this.rol = rol;
		this.antecedente = antecedente;
	}

	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isAntecedente() {
		return antecedente;
	}

	public void setAntecedente(boolean antecedente) {
		this.antecedente = antecedente;
	}

	@Override
	public String toString() {
		return "Ladron [rol=" + rol + ", antecedente=" + antecedente + 
				", Dinero Robado=" + calcularDinero() +", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Protagonista o) {
		return getNombreSerie().compareTo(o.getNombreSerie());
	}

	@Override
	protected double calcularDinero() {
		return CANTIDAD_ROBOS*GANACIA_POR_ROBO;
	}
	
}
