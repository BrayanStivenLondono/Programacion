package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {
	private String titulo;
	private double precio;
	private ArrayList<Actor> actores;//listado de actores
	
	Scanner input = new Scanner (System.in);

	public Pelicula() {
		this.titulo = "";
		this.precio = 0.0;
		this.actores = new ArrayList<Actor>();
	}
	
	public Pelicula(String titulo, double precio, ArrayList<Actor> actores) {
		this.titulo = titulo;
		this.precio = precio;
		this.actores = actores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Actor> getActores() {
		return actores;
	}

	public void setActores(ArrayList<Actor> actores) {
		this.actores = actores;
	}
	
	//RELLENAR PELICULA
	public void rellenarPelicula() {
		double precio = -1;
		String nombreActor;
		
		System.out.println("Titulo de Pelicula: ");
		this.setTitulo(input.nextLine());
		
		System.out.println("Precio de pelicula: ");
		while (precio<0) {
			try {
				precio = input.nextDouble();
				this.setPrecio(precio);
				input.nextLine();
				
			} catch (Exception e) {//si es negativo me lo dice y me lo vuelve a pedir
				System.out.println("Error en la introduccion del precio");
				this.setPrecio(input.nextDouble());
				input.nextLine();
			}
		}
		
		//--------------------------------------------------------------------
		//CREO UN ACTOR EN PELICULA
		while (true) {//(true) funciona hasta que pongas un (*)
			Actor actor = new Actor ();//creo un actor
			
			System.out.println("Dame el nombre del actor (* para salir)");
			//lectura y asignacion en dos pasos
			nombreActor = input.nextLine();
			actor.setNombre(nombreActor);//asigno nombre y salgo
			
			if (actor.getNombre().equalsIgnoreCase("*")) {
				break;//salgo del while (hace la funcion de false)
			} 
			
			System.out.println("Es protagonista? (true/false)");
			//lectura y asignacion en un pasos 
			actor.setProtagonista(input.nextBoolean());//
			input.nextLine();
			System.out.println("_____________________________________");
			
			actores.add(actor);
			/*
			 * Lectura y asignar en dos pasos
			 * syso
			 * nombre = input.next();
			 * actor.setNombre(nombre)
			 * ------------------------------------------
			 * Lectura y signar en un paso
			 * syso
			 * actor.setNombre(input.next());
			 */
		}
	}
}
