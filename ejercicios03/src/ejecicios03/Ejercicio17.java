package ejecicios03;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("introduce dia 1");
		int dia1 = input.nextInt();
		System.out.println("introduce mes 1");
		int mes1 = input.nextInt();
		System.out.println("introduce ano 1");
		int ano1 = input.nextInt();
		
		System.out.println("introduce dia 2");
		int dia2 = input.nextInt();
		System.out.println("introduce mes 2");
		int mes2 = input.nextInt();
		System.out.println("introduce ano 2");
		int ano2 = input.nextInt();
		
		int diasFecha1 = dia1+mes1*30 + ano1*365;
		int diasFecha2 = dia2+mes2*30 + ano2*365;
		
		int diferencia = diasFecha1-diasFecha2;
		
		if (diferencia<10) {
			diferencia = -diferencia;
		}
		System.out.println("diferencia de dias " + diferencia);		

		input.close();

	}

}
