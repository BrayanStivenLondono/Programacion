package ejercicio04;

public class Profesor {
	private String nombre;
	private String apellido;
	private int edad;
	private String ciclo;
	
	//consctor con parametros
	public Profesor(String nombre, String apellido, int edad, String ciclo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciclo = ciclo;
	}
	//sin parametros
	public Profesor() {
		
	}
	//setter y getter
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	//toString
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ciclo=" + ciclo + "]";
	}
	
	public void mostrarDatosProfesor (Profesor profe) {
		System.out.println("Datos profesor");
		System.out.println(profe.toString());
	}
}
