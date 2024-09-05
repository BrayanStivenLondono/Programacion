package clases;

public class Camarero extends Personal{

	private String genero;
	private int antiguedad;
	
	public Camarero() {
		
	}
	
	public Camarero(String nombre, String dni, String genero, int antiguedad) {
		super(nombre, dni);
		this.genero = genero;
		this.antiguedad = antiguedad;
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	@Override
	public String toString() {
		return "Camarero [genero=" + genero + ", antiguedad=" + antiguedad + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Personal o) {
		return this.getDni().compareTo(getDni());
	}

}