package clases;

public class JefeSeccion extends Personal {

	private static final long serialVersionUID = -3287096738226583558L;
	public final static double INCENTIVO = 300;
	private String seccion;
	private int suplemento;

	public JefeSeccion(String dni, String nombre, String seccion, int suplemento) {
		super(dni, nombre);
		this.seccion = seccion;
		this.suplemento=suplemento;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public int getSuplemento() {
		return suplemento;
	}

	public void setSuplemento(int suplemento) {
		this.suplemento = suplemento;
	}

	@Override
	public int compareTo(Personal arg0) {
		return getDni().compareTo(arg0.getDni());
	}
	
	@Override
	public double calcularSalario() {
		return SALARIO_BASE+INCENTIVO;
	}

	@Override
	public String toString() {
		return super.toString() + " "+seccion + " "+suplemento;
	}

}
