package ejercicio06;

public class Profesor {
	private String nombre;
	private String apellidos;
	private int edad;
	private String ciclo;
	
	public Profesor(String nombre, String apellidos, int edad, String ciclo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.ciclo = ciclo;
	} 
	public Profesor() {
		
	}
	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", ciclo=" + ciclo + "]";
	}
	public void mostrarDatosProfesor (Profesor profesor) {
		System.out.println("Los profesores son: ");
		System.out.println(profesor);
	}

}
