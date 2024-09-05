package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner input = new Scanner (System.in);
	static Scanner input1 = new Scanner (System.in);

	public static void main(String[] args) {
		final int TAMAÑO =5;
		
		String[] nombres = new String [TAMAÑO];
		double[] notas = new double [TAMAÑO];
		
		Ejercicio10.rellenarArray(notas, nombres);
		
		String[] resultado = Ejercicio10.añadeResultado(notas);
		
		Ejercicio10.mostrarArray(nombres, notas, resultado);
		
		input.close();
		input1.close();
	}
	public static void rellenarArray (double[] notas, String[] nombres) {
		double nota;
		for (int i=0; i<notas.length; i++) {
			System.out.println("Nombre alumno"); 
			nombres[i] = input.nextLine();
			
			do {
				System.out.println("Dame la nota del alumno");
				nota = input1.nextDouble();
			
			} while (nota<=0 || nota>=10);
			notas[i] = nota;
		}
	}
	public static void mostrarArray (String[] nombres, double[] notas,String[] resultado) {
		for (int i=0; i<nombres.length; i++) {
			System.out.println("El alumno "+nombres[i]+" tiene "
					+ "una nota de "+notas[i]+" y su calificacion es "+resultado[i]);
			
		}
	}
	public static String[] añadeResultado (double[] notas) {
		String[] resultado = new String [notas.length];
		
		for (int i=0; i<notas.length; i++) {
			switch ((int) notas[i]) {
			case 1:
			case 2:
			case 3:
			case 4:
				resultado[i] = "Suspenso";
			break;
			case 5:
			case 6:
				resultado[i] = "Bien";
			break;
			case 7:
			case 8:
				resultado[i] = "Notable";
			break;
			case 9:
			case 10:
				resultado[i] = "Sobresaliente";
			break;
			}
		}
		return resultado;
	}
}
