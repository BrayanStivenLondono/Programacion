package mas;

import java.util.Scanner;

public class Taller00 {
	static final double DESCUENTO_QUINCENA = 0.10;
	static final double DESCUENTO_MES = 0.15;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion = 0;

		do {
			System.out.println("********************************");
			System.out.println("1 - Coste viaje Madeira");
			System.out.println("2 – Visitas civitatis");
			System.out.println("3 - Contador Likes");
			System.out.println("4 – Seguidores Instagram");
			System.out.println("5 – Salir");
			System.out.println("*********************************");
			System.out.println("Introduzca el número de opción:");

			opcion = input.nextInt();
			input.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("1 - Escapada");
				System.out.println("2 – Semana");
				System.out.println("3 - Quincena");
				System.out.println("4 – Mes");
				System.out.println("Indica que viaje quieres comprar");
				int opcion1 = input.nextInt();
				String viaje = "";
				double precio = 0;
				
				switch (opcion1) {
				case 1:
					viaje = "Escapada";
					precio = 240;
					break;
				case 2:
					viaje = "Semana";
					precio = 420;
					break;
				case 3:
					viaje = "Quincena";
					precio = 900;
					break;
				case 4:
					viaje = "Mes";
					precio = 1800;
					break;
				default:
					System.out.println("Opción incorrecta");
				}
				if (viaje.equals("Escapada")) {
					System.out.println("Estancia en Madeira " + viaje);
					System.out.println("El precio inicial del viaje es " + precio + "€");
					System.out.println("El descuento es 0");
					System.out.println("El precio final del viaje es " + precio + "€");
				} else if (viaje.equals("Semana")) {
					System.out.println("Estancia en Madeira " + viaje);
					System.out.println("El precio inicial del viaje es " + precio + "€");
					System.out.println("El descuento es 0");
					System.out.println("El precio final del viaje es " + precio + "€");
				} else if (viaje.equals("Quincena")) {
					System.out.println("Estancia en Madeira " + viaje);
					System.out.println("El precio inicial del viaje es " + precio + "€");
					System.out.println("El descuento es " + (precio * DESCUENTO_QUINCENA));
					System.out.println("El precio final del viaje es " + (precio - precio * DESCUENTO_QUINCENA) + "€");
				} else if (viaje.equals("Mes")) {
					System.out.println("Estancia en Madeira " + viaje);
					System.out.println("El precio inicial del viaje es " + precio + "€");
					System.out.println("El descuento es " + (precio * DESCUENTO_MES));
					System.out.println("El precio final del viaje es " + (precio - precio * DESCUENTO_MES) + "€");
				}
				break;
			case 2:
				//visita1
				System.out.println("Introduce el NOMBRE de la visita");
				String visita1=input.nextLine();
				System.out.println("Introduce el nombre del GUIA");
				String guia1=input.nextLine();
				System.out.println("Introduce el precio FREE TOUR que le quieres dar a la visita");
				double precio1=input.nextDouble();
				input.nextLine(); //BUFFER
				
				//visita2
				System.out.println("Introduce el NOMBRE de la visita");
				String visita2=input.nextLine();
				System.out.println("Introduce el nombre del GUIA");
				String guia2=input.nextLine();
				System.out.println("Introduce el precio FREE TOUR que le quieres dar a la visita");
				double precio2=input.nextDouble();
				input.nextLine();
				
				//visita3
				System.out.println("Introduce el NOMBRE de la visita");
				String visita3=input.nextLine();
				System.out.println("Introduce el nombre del GUIA");
				String guia3=input.nextLine();
				System.out.println("Introduce el precio FREE TOUR que le quieres dar a la visita");
				double precio3=input.nextDouble();
				input.nextLine();
				
				System.out.println("Las visitas ordenadas por precio son");
				String completo1= visita1+", "+guia1+", "+precio1;
				String completo2= visita2+", "+guia2+", "+precio2;
				String completo3= visita3+", "+guia3+", "+precio3;
				
				if (precio1>precio2 && precio2>precio3) {
					System.out.println(completo1);
					System.out.println(completo2);
					System.out.println(completo3);
				} else if (precio2>precio1 && precio1>precio3) {
					System.out.println(completo2);
					System.out.println(completo1);
					System.out.println(completo3);
				} else if (precio2>precio3 && precio3>precio1) {
					System.out.println(completo2);
					System.out.println(completo3);
					System.out.println(completo1);
				} else if (precio3>precio1 && precio1>precio2) {
					System.out.println(completo3);
					System.out.println(completo1);
					System.out.println(completo2);
				} else if (precio3>precio2 && precio2>precio1) {
					System.out.println(completo3);
					System.out.println(completo2);
					System.out.println(completo1);
				}
						
				break;
			case 3:
				System.out.println("Evalua los siguientes comentarios respondiendo like si te ha gustado");
				System.out.println("Maravillosa visita");
				String texto=input.nextLine();
				int contadorLikes=0;
				if (texto.equalsIgnoreCase("like")) {
					contadorLikes++;
				}
				System.out.println("Divertida y espectacular visita");
				texto=input.nextLine();
				if (texto.equalsIgnoreCase("like")) {
					contadorLikes++;
				}
				System.out.println("Esperaba otra cosa");
				texto=input.nextLine();
				if (texto.equalsIgnoreCase("like")) {
					contadorLikes++;
				}
				System.out.println("La recomiendo");
				texto=input.nextLine();
				if (texto.equalsIgnoreCase("like")) {
					contadorLikes++;
				}
				System.out.println("");
				System.out.println("Número de likes "+contadorLikes);
				break;
			case 4:
				System.out.println("Introduce el numero de seguidores");
				int seguidores=input.nextInt();
				int seguidoresActual=seguidores;
				int cantidad;
				do {
					System.out.println("Actualiza los seguidores: sube seguidores (positivo) " + "baja seguidores (negativo)");
					cantidad=input.nextInt();
					
					seguidoresActual += cantidad;
					
					System.out.println("Tienes "+(seguidoresActual)+ " seguidores");
					
				} while (seguidoresActual>0);
				System.out.println("Te has quedado sin seguidores");
				break;
			case 5:
				System.out.println("Programa terminado");
				break;
			default:
				System.out.println("La opción no es correcta");
			}

		} while (opcion != 5);
		input.close();
	}

}
