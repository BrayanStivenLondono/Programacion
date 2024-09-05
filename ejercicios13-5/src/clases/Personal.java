package clases;

public abstract class Personal implements Comparable<Personal> {

	private String nombre;
	private String dni;
	private int sueldo;
	private int codigo;
	private int anyosEsperiencia;
	
	public Personal() {
		
	}
	
	public Personal(String nombre, String dni, int sueldo, int codigo, int anyosEsperiencia) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.codigo = codigo;
		this.anyosEsperiencia = anyosEsperiencia;
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

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnyosEsperiencia() {
		return anyosEsperiencia;
	}

	public void setAnyosEsperiencia(int anyosEsperiencia) {
		this.anyosEsperiencia = anyosEsperiencia;
	}

	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", dni=" + dni + ", sueldo=" + sueldo + ", codigo=" + codigo
				+ ", anyosEsperiencia=" + anyosEsperiencia + "]";
	}

}
