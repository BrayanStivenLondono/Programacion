package ejercicio03;

import java.util.Scanner;

public class Asignatura {
	
	static Scanner input = new Scanner (System.in);
	//atributos
	private int codigo;
	private String nombre;
	private int curso;
	
	//constructor sin parametros
	public Asignatura() {
		this.codigo = 0;
		this.nombre = "";
		this.curso = 0;
	}

	//setter y getter
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	//rellenar asignatura void y con this y lectura de datos
	public void rellenarAlumno () {

		System.out.println("Dame el codigo");
		codigo = input.nextInt();
		
		System.out.println("Dame el nombre");
		nombre = input.nextLine();
		input.nextLine();
		System.out.println("Dame el curso");
		curso = input.nextInt();
		
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setCurso(curso);
		
		input.nextLine();//SIEMPRE /BUFFER
				
	}
	//visualizar asignatura
	public void visualizarAlumno (Asignatura asig) {//recibe la clase
		System.out.println("El Codigo: "+codigo);
		System.out.println("El nombre: "+nombre);
		System.out.println("El curso: "+curso);
	}
}
