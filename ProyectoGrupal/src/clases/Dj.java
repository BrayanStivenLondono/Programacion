package clases;

public class Dj extends Personal{

	private float sueldo;
	private String tipoMusica;
	
	public Dj() {
		
	}
	
	public Dj(String nombre, String dni, float sueldo, String tipoMusica) {
		super(nombre, dni);
		this.sueldo = sueldo;
		this.tipoMusica = tipoMusica;
	}


	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
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
		return "Dj [sueldo=" + sueldo + ", tipoMusica=" + tipoMusica + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personal arg0) {
		return this.getDni().compareTo(arg0.getDni());
	}
	
	
}