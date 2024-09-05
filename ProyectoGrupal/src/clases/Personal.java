package clases;

public abstract class  Personal implements Comparable<Personal>{
	
	private String nombre;
	private String dni;
	
	public Personal() {
		
	}
	
	public Personal(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

    // Sobrescribiendo el método toString() para una mejor representación
    @Override
    public String toString() {
        return "Personal [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
