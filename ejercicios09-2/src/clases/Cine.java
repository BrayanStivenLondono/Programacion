package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
	public static Scanner input = new Scanner (System.in);
	private String nombre;
	private ArrayList<Pelicula> peliculas;
	
	public Cine() {
		this.nombre = "";
		this.peliculas = new ArrayList<Pelicula>();
	}
	
	public Cine(String nombre, ArrayList<Pelicula> peliculas) {
		this.nombre = nombre;
		this.peliculas = peliculas;
	}

	//setter y getter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	
	//GENERAR CINE (RELLENAR CINE)
	public void generarCine () {
		String seleccion;
		String nombreCine;
		
		System.out.println("Dame el nombre del cine: ");
		nombreCine = input.nextLine();
		//LLAMO LA PELICULA
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		
		while (true) {//hace eso mientra sea igual a no
			Pelicula pelicula = new Pelicula();//creo una pelicula, llamo su metodo y la agrego (add)
			pelicula.rellenarPelicula();
			peliculas.add(pelicula);
			
			System.out.println("Mas Peliculas ? (si/no)");
			seleccion = input.nextLine();
			if (seleccion.equalsIgnoreCase("no")) {
				break;//salgo del while
			} 
		}
		this.setNombre(nombreCine);
		this.setPeliculas(peliculas);
	}
	
	public void visualizarCine() {
		int contadorPeliculas = 0;
		int contadorProtagonistas = 0;
		System.out.println();
		System.out.println("\nNombre del cine: "+this.nombre);
		for (Pelicula pelicula : peliculas) {
			System.out.println("Cantidad Peliculas: "+contadorPeliculas);
			System.out.println("________________________________");
			System.out.println("Titulo: "+pelicula.getTitulo());
			System.out.println("Precio: "+pelicula.getPrecio());
			
			System.out.println("\nListado de actores");
			System.out.println("________________________________");
			for (Actor actor : pelicula.getActores()) {
				System.out.println("Nombre: "+actor.getNombre());
				System.out.println("Es protagonista? "+actor.isProtagonista());
				if (actor.isProtagonista()==true) {
					contadorProtagonistas+=1;
				}
			}
			if (contadorProtagonistas > 2) {
				System.out.println("Genero familiar");
			} else {
				System.out.println("Genero romantico");
			}
			contadorPeliculas++;
		}
	}
	
	public void modificarPelicula () {
		
		System.out.println("Nombre de Pelicula a modificar");
		String tituloPelicula = input.nextLine();
		System.out.println("Nombre de Actor a modificar");
		String nombreActor = input.nextLine();
	
		for (Pelicula pelicula : this.getPeliculas()) {
			if (pelicula.getTitulo().equalsIgnoreCase(tituloPelicula)) {
				for (Actor actor : pelicula.getActores()) {
					if (nombreActor.equalsIgnoreCase(actor.getNombre())) {
						
						System.out.println("Dame el nuevo nombre");
						actor.setNombre(input.nextLine());
						System.out.println("Es protagonista? (true/false)");
						actor.setProtagonista(input.nextBoolean());
					}
				}
			}
		}
	}
	
	public void ordenarDescPeliculas () {//para ordenar arraylist siempre compareTo
		ArrayList<Pelicula> peliculas = this.getPeliculas();
		Pelicula peli = new Pelicula ();//peli = variable auxiliar
		for (int i = 0; i<peliculas.size()-1; i++) {
			for (int j = 0; j < peliculas.size()-1-i; j++) {//o j = 1-i
				//cuando < 0 es porque es ascendente (a-z)
				//por lo que necesito cambiar el orden de las peliculas
				if (peliculas.get(j).getTitulo()   //campara esto
		 .compareTo(peliculas.get(j+1).getTitulo()) < 0) { //con esto
					peli = peliculas.get(j);
					peliculas.set(j, peliculas.get(j+1));
					peliculas.set(j+1, peli);
				}
			}
		}
	}
}
