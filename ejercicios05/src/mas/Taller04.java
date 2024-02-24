package mas;

import java.util.Scanner;

public class Taller04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce una IP en formato XXX.XXX.XXX.XXX"); //empieza en 0
		String ip = input.nextLine();
		
		for (int i=0; i<=2; i++) {
			System.out.print(ip.charAt(i));
		}
		System.out.println("");
		for (int i=4; i<=6; i++) {
			System.out.print(ip.charAt(i));
		}
		System.out.println("");
		for (int i=8; i<=10; i++) {
			System.out.print(ip.charAt(i));
		}
		System.out.println("");
		for (int i=12; i<=14; i++) {
			System.out.print(ip.charAt(i));
		}
		System.out.println("");
		//-------------------------------------------------------------------
		System.out.println("Evalua los siguientes comentario");
		
		int contador =0;
		
		System.out.println("Maravillosa visita");
		String comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contador++;
		}
		System.out.println("Maravillosa visita 2");
		comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contador++;
		}
		System.out.println("Maravillosa visita 3");
		comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contador++;
		}
		System.out.println("Maravillosa visita 4");
		comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contador++;
		}
		System.out.println("\nEl total de likes es: "+contador);
		input.close();
	}

}
