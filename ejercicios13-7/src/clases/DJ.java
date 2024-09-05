package clases;

public class DJ extends Personal {
	private double sueldo;
	private String tipoMusica;
	
	public DJ() {
		super();

	}
	
	public DJ(String dni, String nombre, double sueldo, String tipoMusica) {
		super(dni, nombre);
		this.sueldo = sueldo;
		this.tipoMusica = tipoMusica;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTipoMusica() {
		return tipoMusica;
	}

	public void setTipoMusica(String tipoMusica) {
		this.tipoMusica = tipoMusica;
	}
	
	@Override
	public String toString() {
		return "DJ [sueldo=" + sueldo + ", tipoMusica=" + tipoMusica + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personal o) {
		return getDni().compareTo(o.getDni());
	}
	
}
