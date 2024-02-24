package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		String[] superheroe = { "Superman", "Batman", "Spider-Man", "Wonder Woman", "The Flash", "Iron Man","CaptainAmerica", "Thor", "Hulk" };
		String[] archienemigo = { "Lex Luthor", "Joker", "Duende Verde", "Ares", "Reverse-Flash", "Mandarin","Red Skull","Loki", "Abominación" };
		double[] altura = { 1.91, 1.85, 1.78, 1.76, 1.80, 1.88, 1.70, 1.90, 2.44 };
		
		int opcion =0;

		do {
			System.out.println("Elige una opcion");
			System.out.println("1 - Mostrar datos superheroes");
			System.out.println("2 - Mostrar superheroe mas alto");
			System.out.println("Salir");
			opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				Ejercicio02.mostrarDatosSuperheroes(superheroe, archienemigo, altura);
			break;
			case 2:
				Ejercicio02.mostrarSuperheroeMasAlto(superheroe, altura);
			break;
			case 3:
				System.out.println("Fin del programa");
			break;
			default:
				System.out.println("Opcion incorrecta");
			break;			
			}
		} while (opcion!=3); 
		input.close();
	}
	static void mostrarDatosSuperheroes (String [] heroe, String [] enemigo, double [] altura) {
		for (int i=0; i<heroe.length; i++) {
			System.out.println("El superheroe "+heroe[i].toUpperCase()+" mide "+altura[i]+" y su archienemigo es "+enemigo[i].toUpperCase());
		}
	}
	static void mostrarSuperheroeMasAlto (String [] heroe, double [] altura) {
		double mayor =0;
		for (int i=0; i<altura.length; i++) {
			if (altura[i]>mayor) {
				mayor = altura[i];
			}
		}
		System.out.println("El superheroe mas alto es "+mayor);
	}

}
