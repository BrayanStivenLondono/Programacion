package ejeciciosprevios;

public class Persona {
	private int idPersona;
	private String nombre;
	private double altura;
	
	public Persona (int idPersona, String nombre, double altura) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.altura = altura;
	}
	//setter y getter
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", altura=" + altura + "]";
	}
	
}
