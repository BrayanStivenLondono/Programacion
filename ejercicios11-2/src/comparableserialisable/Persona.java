package comparableserialisable;

import java.io.Serializable;

//interfas
public class Persona implements Comparable<Persona>, Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private int edad;
	private int altura;

	public Persona(String nombre, int edad, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}

	// implemento para indicar como se van a comparar las personas
	// le voy a comparar por edad y por altura

	public int compareTo(Persona persona, String cadena) {
		int resultado = 0;
		if (cadena.equalsIgnoreCase("Edad")) {
			if (this.edad < persona.edad) {
				resultado = 1;
			} else if (this.edad > persona.edad) {
				resultado = -1;
			} else {
				resultado = 0;
			}
		}
		if (cadena.equalsIgnoreCase("Altura")) {
			if (this.altura < persona.altura) {
				resultado = 1;
			} else if (this.altura > persona.altura) {
				resultado = -1;
			} else {
				resultado = 0;
			}
		}
		return resultado;
	}

	public int compareTo(Persona o) {
		return 0;
	}

}
