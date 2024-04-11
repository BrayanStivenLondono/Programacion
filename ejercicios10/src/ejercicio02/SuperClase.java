package ejercicio02;

import java.time.LocalTime;

public class SuperClase {
	private String nombre;

	
	public SuperClase(String nombre) {
		this.nombre = nombre;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "SuperClase [nombre=" + nombre + "]";
	}
	
	//final = no se podra modificar este metodo abajo
	public final void mostrarHora () { 
		System.out.println(LocalTime.now());
	}

}
