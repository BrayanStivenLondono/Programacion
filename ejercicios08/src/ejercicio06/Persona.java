package ejercicio06;

import java.time.LocalDate;

public class Persona {
	//atributos
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;//import
	private boolean esHombre;
	private double altura;
	private double peso;
	
	//constrcutor con dos parametros. nombre y apellidos
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	//paseo > recibo un tipo de datos y lo transformo a otro
	//Integer.parseInt(variable);
	
	//otros con 4 parametros. nombre,apellidos, fechaNacimiento, esHombre
	public Persona(String nombre, String apellidos, String fechaNacimiento, boolean esHombre) {
		this(nombre,apellidos);//con this. llamo al constructor de esta clase
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento); //Se Parse, siempre
		this.esHombre = esHombre;
	}
	
	//constructor con todos lo parametros
	public Persona(String nombre, String apellidos, String fechaNacimiento, boolean esHombre, double altura,
			double peso) {
		this(nombre, apellidos, fechaNacimiento, esHombre);//ya no tengo que castear fechaNacimiento
		this.altura = altura;
		this.peso = peso;
	}
	
	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isEsHombre() {
		return esHombre;
	}
	public void setEsHombre(boolean esHombre) {
		this.esHombre = esHombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	//this.atribute: accede a un atributo de esta clase
	//this.metodo(): accede a un metodo de esta clase
	//this(): accede a un constructor de esta clase
	
}
