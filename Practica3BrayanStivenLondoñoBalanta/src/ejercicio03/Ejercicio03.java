package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		double [][] matriz = new double [3][4];
		
		Ejercicio03.pedirNotas(matriz);
		
		
		input.close();

	}
	static double [][] pedirNotas (double [][] matriz) {
		for (int i=0; i<4; i++) {
			System.out.println("Introduce las nota del primer alumno "+(i+1));
			matriz[0][i]  = input.nextDouble();
			System.out.println("Introduce las nota del segundo alumno "+(i+1));
			matriz[1][i] = input.nextDouble();
			System.out.println("Introduce las nota del tercer alumno "+(i+1));
			matriz[2][i] = input.nextDouble();
		}
		return matriz;
		
	}
	static void mostrarNotas (double [][] matriz) {
		for (int i=0; i<4; i++) {
			System.out.println("Notas de los alumnos");
			System.out.println("Alumno 1: "+matriz[0][i]+" ");
			System.out.println("Alumno 2: "+matriz[1][i]+" ");
			System.out.println("Alumno 3: "+matriz[2][i]+" ");
		}
	}
	static void mostrarPromedioAlumnos (double [][] matriz) {
		double media =0;
		double suma =0;
		for (int i=0; i<4; i++) {
			suma = suma+matriz[0][i]+matriz[1][i]+matriz[2][i];
			media = suma/matriz.length;
			System.out.println("\nPromedio de notas por alumno");
			System.out.println("Alumno 1: "+suma/matriz.length+" ");
			System.out.println("Alumno 2: "+suma/matriz.length+" ");
			System.out.println("Alumno 3: "+suma/matriz.length+" ");
		}
	}
	static void mostrarPromedioAsignaturas (double [][] matriz) {
		
	}
}
