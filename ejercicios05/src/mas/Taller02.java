package mas;

import java.util.Scanner;

public class Taller02 {
	static final double DESCUENTO_QUINCENA = 0.10;
	static final double DESCUENTO_MES = 0.15;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("1 - Escapada");
		System.out.println("2 – Semana");
		System.out.println("3 - Quincena");
		System.out.println("4 – Mes");
		System.out.println("Indica que viaje quieres comprar");
		int opcion = input.nextInt();
		
		String viaje = "";
		int precio =0;
		
		switch (opcion) {
		case 1:
			viaje = "escapada";
			precio = 240;
		break;
		case 2:
			viaje = "semana";
			precio = 420;	
		break;
		case 3:
			viaje = "quincena";
			precio = 900;
		break;
		case 4:
			viaje = "mes";
			precio = 1800;	
		break;
		default:
			System.out.println("Opcion incorrecta");
		}
		if (viaje.equals("escapada")) {
			System.out.println("Estancia en Madeira: "+viaje);
			System.out.println("El precio inicial del viaje es: "+precio);
			System.out.println("El descuento es 0");
			System.out.println("El precio final del viaje es: "+precio);
		} else if (viaje.equals("semana")) {
			System.out.println("Estacia en Madeira "+viaje);
			System.out.println("El precio inicial del viaje es: "+precio);
			System.out.println("El descueto es 0");
			System.out.println("El precio final del viajes es:"+precio);
		} else if (viaje.equals("quincena")) {
			System.out.println("Estancia en Madeira "+viaje);
			System.out.println("El precio inicial del viaje es: "+precio);
			System.out.println("El descuento es: "+precio*DESCUENTO_QUINCENA);
			System.out.println("El precio final del viajes es: "+(precio-precio*DESCUENTO_QUINCENA));
		} else if (viaje.equals("mes")) {
			System.out.println("Estancia en Madeira: "+viaje);
			System.out.println("El precio incial del viaje es: "+precio);
			System.out.println("El descuento es: "+precio*DESCUENTO_MES);
			System.out.println("El precio final del viajes es: "+(precio-precio*DESCUENTO_MES));
		}
		
		input.close();

	}

}
