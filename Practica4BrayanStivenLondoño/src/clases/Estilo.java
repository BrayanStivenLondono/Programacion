package clases;

public class Estilo {
	private String nombreEstilo;
	private String anyoOrigen;
	
	public Estilo(String nombreEstilo) {
		this.nombreEstilo = nombreEstilo;
	}
	//setter y getter
	public String getNombreEstilo() {
		return nombreEstilo;
	}
	public void setNombreEstilo(String nombreEstilo) {
		this.nombreEstilo = nombreEstilo;
	}
	public String getAnyoOrigen() {
		return anyoOrigen;
	}
	public void setAnyoOrigen(String anyoOrigen) {
		this.anyoOrigen = anyoOrigen;
	}
	
	public String toString() {
		return "\nEstilo: " + nombreEstilo 
			  +"\nAnyoEstilo: " + anyoOrigen;
	}
	
}
