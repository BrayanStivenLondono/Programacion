package ejercicio01;

import java.util.Scanner;

public class Principal {
	static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		Profesor obProfe1 = new Profesor ();
		Profesor obProfe2 = new Profesor ();
		Profesor obProfe3 = new Profesor ();
		Profesor obProfe4 = new Profesor ();
		Profesor obProfe5 = new Profesor ("Juan","Perez","DAW");
		
		rellenarProfesor (obProfe1);//pido datos/SET
		rellenarProfesor (obProfe2);
		rellenarProfesor (obProfe3);
		rellenarProfesor (obProfe4);
		
		System.out.println("Profe1");
		System.out.println(obProfe1);
		System.out.println("Profe2");
		System.out.println(obProfe2);
		System.out.println("Profe3");
		System.out.println(obProfe3);
		System.out.println("Profe4");
		System.out.println(obProfe4);
		System.out.println("Profe5");
		System.out.println(obProfe5);
		mostrarProfesor(obProfe5); //rellado directamente arriba

		input.close();
	}
	public static void rellenarProfesor (Profesor objetoProfesor) {//set
		System.out.println("Dame el nombre");
		String nombre = input.nextLine();
		objetoProfesor.setNombre(nombre);
		
		System.out.println("Dame los apellidos");
		String apellidos = input.nextLine();
		objetoProfesor.setApellidos(apellidos);
		
		System.out.println("Dime el ciclo");
		String ciclo = input.nextLine();
		objetoProfesor.setCiclo(ciclo);
		
	}
	public static void mostrarProfesor (Profesor objetoProfesor) {//get
		System.out.println("El nombre es "+objetoProfesor.getNombre());
		System.out.println("Los apellidos son "+objetoProfesor.getApellidos());
		System.out.println("El ciclo es "+objetoProfesor.getCiclo());
	}

}
