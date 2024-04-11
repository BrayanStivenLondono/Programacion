package clases;

public class Actor {
	private String nombre;
	private boolean protagonista;
	
	//constrcutores
	public Actor() {
		this.nombre = "";
		this.protagonista = false;
	}
	
	public Actor(String nombre, boolean protagonista) {
		this.nombre = nombre;
		this.protagonista = protagonista;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isProtagonista() {
		return protagonista;
	}

	public void setProtagonista(boolean protagonista) {
		this.protagonista = protagonista;
	}
}

