package mas;

import java.util.Scanner;

public class Taller01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Evalua los siguientes comentarios");
		
		System.out.println("Maravillosa visita");
		String comentario = input.nextLine();
		
		int contadorLike = 0;
		
		if (comentario.equalsIgnoreCase("like")) {
			contadorLike++;
		}
		System.out.println("Divertida y espectacula visita");
		comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contadorLike++;
		}
		System.out.println("Esperaba otra cosa");
		comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contadorLike++;
		}
		
		System.out.println("La recomiendo");
		comentario = input.nextLine();
		if (comentario.equalsIgnoreCase("like")) {
			contadorLike++;
		}
		System.out.println("");
		System.out.println("La suma de los likes es: "+contadorLike);
		//---------------------------------------------------------------------------
	
		input.close();
	}

}
