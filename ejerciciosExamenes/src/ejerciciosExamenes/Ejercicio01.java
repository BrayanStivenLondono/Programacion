package ejerciciosExamenes;

import java.util.Scanner;

public class Ejercicio01 {
	static final double PUNTOS_EXTRA_VALORAT = 100;
	static final double PUNTOS_EXTRA_LOL = 115;
	static final double PUNTOS_EXTRA_OVER = 110;

	public static void main(String[] args) {  // if, sw, syso, pri, else, if, break
		Scanner input = new Scanner (System.in);
		
		// Programa que pide los puntos que tiene un jugador en tres videojuegos /  Valorant / LO /   OverWatch
		
		// Tras una promoción especial, el jugador tiene de forma gratuita PUNTOS EXTRA para cada uno
		// de los videojuegos. Una vez solicitados los puntos de cada videojuego, el programa mostrará
		// los puntos del jugador acumulando sus puntos y los puntos extra.
		
		System.out.println("Tu puntaje en Valorat");
		double puntaje1 = input.nextDouble();
		
		System.out.println("Tu puntaje en Lol");
		double puntaje2 = input.nextDouble();
		
		System.out.println("Tu puntaje en Over");
		double puntaje3 = input.nextDouble();
		
	
		System.out.println("Tu puntaje en Valorat es "+ puntaje1);
		System.out.println("Tu puntaje en Valorat más los extras es "+ (puntaje1+PUNTOS_EXTRA_VALORAT));
		
		System.out.println("Tu puntaje en Lol es "+ puntaje2);
		System.out.println("Tu puntaje en Lol más los extras es "+ (puntaje2+PUNTOS_EXTRA_LOL));
		
		System.out.println("Tu puntaje en Over es "+ puntaje3);
		System.out.println("Tu puntaje en Over más los extras es "+ (puntaje3+PUNTOS_EXTRA_OVER));


		input.close();
		
	

	}

}
