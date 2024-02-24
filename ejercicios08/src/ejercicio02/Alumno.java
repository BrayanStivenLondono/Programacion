package ejercicio02;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private double notaMedia;
	
	public Alumno () {
		
	}
	
	public Alumno(String nombre, String apellido, double notaMedia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaMedia = notaMedia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", notaMedia=" + notaMedia + "]";
	}
	
}
