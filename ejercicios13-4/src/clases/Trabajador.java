package clases;

public class Trabajador extends Personal {

	private static final long serialVersionUID = 3915527913264256570L;
	public final static double INCENTIVO = 100;
<<<<<<< HEAD
	
=======
>>>>>>> 0e45588ade652ad7ddec7063ecc6cbcfe20178a8
	private String categoria;

	public Trabajador(String dni, String nombre, String categoria) {
		super(dni, nombre);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setDepartamento(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public int compareTo(Personal o) {
		return getDni().compareTo(o.getDni());
	}
	
	@Override
	public double calcularSalario() {
		return SALARIO_BASE+INCENTIVO;
	}

	@Override
	public String toString() {
		return super.toString() + " "+categoria;
	}
}
