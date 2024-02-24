package metodos;

import java.util.Scanner;

public class Ejercicio02Fac {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opcion =0;
		int opcion2 =0;
		
		String [] nombre = {"Africa", "Agata", "Alien"};
		String [] fecha = {"20/03/94", "13/12/65", "20/07/69"};
			
		do {			
			System.out.println("\nElige una opcion");
			System.out.println("1 - Mostrar dia cumpleaños");
			System.out.println("2 - Mostrar acronimo");	
			System.out.println("3 - Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1:
				Ejercicio02Fac.mostrarDiaCumple(nombre, fecha);
			break;
			
			case 2:
			System.out.println("Elige una opcion");
			System.out.println("1 - Ave");
			System.out.println("2 - Ovni");
			System.out.println("3 - Renfe");
			opcion2 = input.nextInt();
			switch (opcion2) {
			case 1:
				Ejercicio02Fac.mostrarAcronimo(opcion2);
			break;
			case 2:
				Ejercicio02Fac.mostrarAcronimo(opcion2);			
			break;
			case 3:
				Ejercicio02Fac.mostrarAcronimo(opcion2);
			break;
			}
			break;
			case 3:
				System.out.println("Fin del programa");
			break;
			}
		} while (opcion!=3);
		input.close();
	}
	static void mostrarAcronimo (int numero) {
		if (numero==1) {
			System.out.println("Ave: Alta Velociadad Española"); 
		} else if (numero==2) {
			System.out.println("Ovni: Objeto Volador No Identificado");
		} else if (numero==3) {
			System.out.println("Renfe: Red Nacional de Rerrocariles españoles");
		}
	}
	static void mostrarDiaCumple (String [] nombres, String [] fechas) {
		for (int i=0; i<nombres.length; i++) {
			String nombre = nombres[i];
			String fecha = fechas[i];
			
			String dia = fecha.substring(0,2);
			String mes = fecha.substring(3,5);
			
			System.out.println("El dia de cumpleaños de "+nombre+" es el "+dia+" del "+mes);
		}
	
	}
	
}
