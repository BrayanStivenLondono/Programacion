package ejecicios03;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("introduce dia 1");
		int dia = input.nextInt();
		System.out.println("introduce mes 1");
		int mes = input.nextInt();
		System.out.println("introduce ano 1");
		int ano = input.nextInt();
		
		System.out.println("introduce dia 2");
		int dia2 = input.nextInt();
		System.out.println("introduce mes 2");
		int mes2 = input.nextInt();
		System.out.println("introduce ano 2");
		int ano2 = input.nextInt();
		
		// paso las dos fecha a numero dia
		int diasFecha1 = dia+mes*30+ano*365;
		int diasFecha2 = dia2+mes2*30+ano2*365;
		
		//calculo de diferencia
		int diferencia = diasFecha1-diasFecha2;
		
		//if para que siempre me muestre los datos en positivo 
		//si una la primera fecha es anterior a la segunda
		//saldra una cantidad negativa
		if (diferencia<10) {
			diferencia =- diferencia;
		}
		System.out.println("diferencia de dias " + diferencia);		
		
		
		
		
		
		input.close();

	}

}
