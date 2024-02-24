package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion =0;
		
		do {
			System.out.println("\n*********************************");
			System.out.println("1 - Coste viaje Madeira");
			System.out.println("2 – Visitas civitatis");
			System.out.println("3 - Contador Likes");
			System.out.println("4 - Seguidores instagram");
			System.out.println("*********************************");
			System.out.println("Introduzca el número de opción");

			opcion = input.nextInt();
			input.nextLine();
			
			switch (opcion) {
			case 1:
				
				break;
			case 2:
				System.out.println("Introduce una IP en formato XXX.XXX.XXX.XXX");
				String ip = input.nextLine();
				
				for (int i=0; i<=2; i++) {
					System.out.print(ip.charAt(i));
				}
				System.out.println(" ");
				for (int i=4; i<=6; i++) {
					System.out.print(ip.charAt(i));
				}
				System.out.println(" ");
				for (int i=8; i<=10; i++) {
					System.out.print(ip.charAt(i));
				}
				System.out.println(" ");
				for (int i=12; i<=14; i++) {
					System.out.print(ip.charAt(i));
				}
				System.out.println(" ");

			break;
			case 3:
				System.out.println("Evalua lo sisguientes comentarios");
				int total =0;
				
				System.out.println("Maravillosa visita");
				String comentario = input.nextLine();
				if (comentario.equalsIgnoreCase("like")) {
					total++;
				}
				System.out.println("Maravillosa visita 2");
				comentario = input.nextLine();
				if (comentario.equalsIgnoreCase("like")) {
					total++;
				}
				System.out.println("La suma de los likes es: "+total);
			break;
			case 4:
				System.out.println("Introduce el numero de seguidores");
				int seguidores = input.nextInt();
				int seguidoresActual = seguidores;
				int cantidad =0;
				do {
					System.out.println("Actualiza");
					cantidad = input.nextInt();
					
					seguidoresActual += cantidad;
					
					System.out.println("Tienes "+seguidoresActual+ " seguidores");
					
				} while (seguidoresActual>0);
				System.out.println("Te has quedado sin seguidores");
			break;
			case 5:
				System.out.println("Salir");

				break;
			}
		}while (opcion!=5);
		System.out.println("Fin del programa");
		
		input.close();

	}

}
