package ejercicio07;

import java.util.ArrayList;

//hereda lo de la ArrayLis persona
//tengo sus metodos y atributos
//por ejemplo add
//me permitira sobreescribir los metodos

public class ListaPersonas extends ArrayList<Persona>{
                           //heredo la clase donde esta el metodo que voy a sobreescribir
	//es un numero de serie que pone por defecto java
	private static final long serialVersionUID = 1L;
	
	
	//sobreescribimos metodo add (void)
	@Override
	public void add (int indice, Persona persona) {
		//si es igual a null no existe sino lo añade
		if (persona==null || persona!=null && !existeDni(persona.getDni())) {
			super.add(indice, persona);
		}
	}
	
	//sobreescribimos metodo add (boolean)
	@Override
	public boolean add (Persona persona) {
		//es nulo o no es nulo
		if (persona==null || persona!=null && !existeDni(persona.getDni())) {
			super.add(persona);
			return true;
		}
		return false;
	}
	
	//sobreescribimos metodo toString (StringBuilder)
	@Override
	public String toString() {
		//String que permite concatenar
		StringBuilder builder = new StringBuilder();
		for (Persona persona : this) {
			builder.append(persona+"\n");
		}
		return builder.toString();
	}
	
	
	//metodo que comprueba que existe el DNI
	//usamos this para hacer referencia al ArrayList
	public boolean existeDni (String dni) {
		for (Persona persona : this) {
			if (persona!=null 
				&& persona.getDni() != null 
				&& persona.getDni().equalsIgnoreCase(dni)) {
				return true;
			}
		}
		return false;
	}
}
