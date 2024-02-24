package ejercicio08previo;

public class Astronauta {
	String nombre;
	int edad;
	String cargo;
	String nacionalidad;
	
	public Astronauta() {
		
		this.nombre = "Luis";
		this.edad = 45;
		this.cargo = "Capi";
		this.nacionalidad = "Española";
	}
	public Astronauta(String nombre, int edad, String cargo, String nacionalidad) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.cargo = cargo;
		this.nacionalidad = nacionalidad;
		
	}
	@Override
	public String toString() {
		return "Astronauta [nombre=" + nombre + ", edad=" + edad + ", cargo=" + cargo + ", nacionalidad=" + nacionalidad
				+ "]";
	}

}
