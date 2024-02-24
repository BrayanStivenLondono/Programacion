package ejercicio02;

import java.util.Scanner;

public class Principal {
	
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		Alumno obAlumno1 = new Alumno ();
		Alumno obAlumno2 = new Alumno ();
		Alumno obAlumno3 = new Alumno ("Juan","Lopez",6.7);
		Alumno obAlumno4 = new Alumno ("David","Gomez",8.7);
		
		
		rellenarAlumno(obAlumno1);//set
		rellenarAlumno(obAlumno2);
		
		visualizarAlumno(obAlumno3);//get
		visualizarAlumno(obAlumno4);
		
		System.out.println("\nAlumno1");
		System.out.println(obAlumno1);
		System.out.println("Alumno2");
		System.out.println(obAlumno2);
		
		input.close();
	}
	public static void rellenarAlumno (Alumno objetoAlumno) {
		System.out.println("Dame nombre");
		String nombre = input.nextLine();
		System.out.println("Dame apellido");
		String apellidos = input.nextLine();
		System.out.println("Dame la nota Media");
		double notaMedia = input.nextDouble();
		input.nextLine();
	
		objetoAlumno.setNombre(nombre);
		objetoAlumno.setApellido(apellidos);
		objetoAlumno.setNotaMedia(notaMedia);
	
	}
	public static void visualizarAlumno (Alumno objetoAlumno) {
		System.out.println("Nombre: "+objetoAlumno.getNombre());
		System.out.println("Apellido: "+objetoAlumno.getApellido());
		System.out.println("Nota Media: "+objetoAlumno.getNotaMedia());
		
	}
	

}
