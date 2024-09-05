package clases;

public class Atraccion implements Comparable<Atraccion>{
	private String nombre;
	private String tipo;
	private int edad;
	private String estado;
	private String fabricante;
	
	public Atraccion() {
		
	}
	
	public Atraccion(String nombre, String tipo, int edad, String estado, String fabricante) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.estado = estado;
		this.fabricante = fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + ", estado=" + estado
				+ ", fabricante=" + fabricante + "]";
	}

	@Override
	public int compareTo(Atraccion o) {
		return getNombre().compareTo(o.getNombre());
	}
	
	
	
}
