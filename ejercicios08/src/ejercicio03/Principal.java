package ejercicio03;

import java.util.Scanner;

public class Principal {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		//crear dos asignatura
		
		Asignatura Asig1 = new Asignatura ();
		Asig1.rellenarAlumno();//creo, relleno
		
		Asignatura Asig2 = new Asignatura ();
		Asig2.rellenarAlumno();

		//mostrar sus datos
		System.out.println("Alumno-1");
		Asig1.visualizarAlumno(Asig1);//y muestro
		System.out.println("Alumno-2");
		Asig2.visualizarAlumno(Asig2);

		input.close();
	}
}
