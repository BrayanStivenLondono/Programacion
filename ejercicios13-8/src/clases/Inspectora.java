package clases;

public class Inspectora extends Protagonista {
	
	static final double CANTIDAD_INCAUTACIONES = 2;
	static final double DINERO_POR_INCAUTACION = 2000;
	
	private int anyosCargo;
	
	public Inspectora() {
		super();
	}
	
	public Inspectora(String nombre, String nombreSerie, int anyosCargo) {
		super(nombre, nombreSerie);
		this.anyosCargo = anyosCargo;
		
	}
	
	public int getAnyosCargo() {
		return anyosCargo;
	}

	public void setAnyosCargo(int anyosCargo) {
		this.anyosCargo = anyosCargo;
	}

	
	
	@Override
	public String toString() {
		return "Inspectora [anyosCargo=" + anyosCargo + 
				", Dinero Incautado=" + calcularDinero() 
				+", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Protagonista o) {
		return getNombreSerie().compareTo(o.getNombreSerie());
	}

	@Override
	protected double calcularDinero() {
		return CANTIDAD_INCAUTACIONES*DINERO_POR_INCAUTACION;
	}
	
}
