package clases;

public class Alumno {
	private String nombre;
	private String apellido;
	private double notaMedia;
	private boolean Aprobado;
	
	
	public Alumno(String nombre) {
		this.nombre = nombre;
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
	public boolean isAprobado() {
		return Aprobado;
	}
	public void setAprobado(boolean aprobado) {
		Aprobado = aprobado;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", notaMedia=" + notaMedia + ", Aprobado="
				+ Aprobado + "]";
	}
	
}
