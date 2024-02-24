package metodos;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opcion =0;
			
		do {			
			System.out.println("\nElige una opcion");
			System.out.println("1 - Mostrar dia cumpleaños");
			System.out.println("2 - Mostrar acronimo");	
			System.out.println("3 - Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				Ejercicio02.mostrarDiaCumple();
			break;
			case 2:
				Ejercicio02.mostrarAcronimo();
			break;
			default:
				System.out.println("Salir");
			}
		} while (opcion!=3);
		input.close();
	}
	static void mostrarAcronimo () {
		int opcion =0;
		do {
			System.out.println("Elige una opcion");
			System.out.println("1 - Ave");
			System.out.println("2 - Ovni");
			System.out.println("3 - Renfe");
			opcion = input.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Ave: Alta velociada española");
		break;
		case 2:
			System.out.println("Ovni: Objeto volador no identificado");
		break;
		case 3:
			System.out.println("Renfe: Red nacional de ferrocarales españoles");
		break;
		case 4:
			System.out.println("Fin");
		break;
		}

		} while (opcion!=4);
	}
	static void mostrarDiaCumple () {
			String [] nombre = {"Africa", "Agata", "Alien"};
			String [] fecha = {"20/03/94", "13/12/65", "20/07/69"};
			
			for (int i=0; i<nombre.length; i++)  {
				System.out.println("El dia de cumpleaños de "+nombre[i]+" es el "+fecha[i].substring(0,2)+" del "+fecha[i].substring(3,5));
		}
	
	}
	
}
