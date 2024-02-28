package programa;

import java.util.Scanner;

import clases.Visita;

public class GestorMonumentos {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		Visita monumento = new Visita (4);
		System.out.println("Creo una instancia de visita");
		
		int opcion =0;
		do {
			System.out.println("\nElige una opcion");
			System.out.println("1 - Alta monumentos");
			System.out.println("2 - Mostar monumentos");
			System.out.println("3 - Buscar monumento por su nombre");
			System.out.println("4 - Eliminar un monumento");
			System.out.println("5 - Salir del programa");
			opcion = input.nextInt();
			
		switch (opcion) {
		case 1:
			AltaMonumento(monumento);
			MostarMonumentos(monumento);
			break;
		case 2:
			MostarMonumentos(monumento);
			break;
		case 3:
			BuscarMonumento(monumento);
			MostarMonumentos(monumento);
			break;
		case 4:
			EliminarMonumento(monumento);
			MostarMonumentos(monumento);
			break;
		case 5:
			System.out.println("El programa ha finalizado, Adios");
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
	} while (opcion!=5);
	
	}

	private static void MostarMonumentos(Visita monumento) {
		monumento.listarMonumento();
		
	}
	private static void EliminarMonumento(Visita monumento) {
		System.out.println("\n4 - Elimino un monumento");
		System.out.println("Dame el nombre");
		String nombre = input.nextLine();
		monumento.eliminatMonumento("\n"+nombre);
		
	}
	private static void BuscarMonumento(Visita monumento) {
		System.out.println("\n3 - Busco un monumeto por su nombre");
		monumento.buscarMonumento("La Sagrada Familia");
		
	}
	private static void AltaMonumento(Visita monumento) {
		System.out.println("\n2 - Doy de alta 4 monumetos");
		monumento.altaMonumento("El partenón", "Gracia");
		monumento.altaMonumento("El Coliseo Romano", "Italia");
		monumento.altaMonumento("Estatua de la Libertad", "EEUU");
		monumento.altaMonumento("La Sagrada Familia", "España");
	}
}
