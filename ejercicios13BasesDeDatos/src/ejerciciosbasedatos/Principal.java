package ejerciciosbasedatos;

import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws SQLException {
		TrabajandoConDatos datos = new TrabajandoConDatos();
		Scanner input = new Scanner (System.in);
		System.out.println("Conectamos");
		datos.conectar();
		
		System.out.println();
		System.out.println("Mostrar datos");
		datos.seleccionar();
		
		System.out.println("Inserto dato");
		System.out.println("Nombre Juego: ");
		String nombre = input.nextLine();
		System.out.println("Plataforma: ");
		String plataforma = input.nextLine();
		System.out.println("Genero: ");
		String genero = input.nextLine();
		System.out.println("Precio: ");
		float precio = input.nextFloat();
		datos.insertar(nombre, plataforma, genero, precio);
		datos.seleccionar();
		
		input.nextLine();
		System.out.println();
		System.out.println("actulizo dato");
		System.out.println("Nombre: ");
		nombre = input.nextLine();
		System.out.println("Plataforma: ");
		plataforma = input.nextLine();
		System.out.println("Genero: ");
		genero = input.nextLine();
		System.out.println("Precio: ");
		precio = input.nextFloat();
		datos.actualizar(nombre, plataforma, genero, precio);
		datos.seleccionar();
		
		System.out.println();
		System.out.println("Borramos");
		System.out.println("Nombre: ");
		nombre = input.nextLine();
		datos.eliminar(nombre);
		datos.seleccionar();
		
		input.close();
	}

}
