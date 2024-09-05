package clases;

public class Cliente {
	private int codigo;
	private String nombre;
	private String dni;
	private int edad;
	private String email;
	private String telefono;
	
	public Cliente() {
		
	}
	
	public Cliente(int codigo, String nombre, String dni, int edad, String email, String telefono) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.email = email;
		this.telefono = telefono;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", email="
				+ email + ", telefono=" + telefono + "]";
	}
	
}
