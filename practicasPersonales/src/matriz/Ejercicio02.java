package matriz;

import java.util.Scanner;

public class Ejercicio02 {

	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		 double[][] matriz = new double[3][4]; // Tres alumnos y cuatro asignaturas
	        System.out.println("__________________________________");
			System.out.println("Notas alumnos y asignaturas");
	        System.out.println("__________________________________");
	        matriz = pedirNotas(matriz);
	        System.out.println("__________________________________");
	        mostrarNotas(matriz);
	        System.out.println("__________________________________");
	        mostrarPromedioAlumnos(matriz);
	        System.out.println("__________________________________");
	        mostrarPromedioAsignaturas(matriz);
	        System.out.println("__________________________________");
	        
	        input.close();
	    }

	    static double[][] pedirNotas(double[][] notas) {
	        for (int i=0; i<notas.length; i++) { // Recorre los alumnos
	            System.out.println("Introduce las notas del Alumno "+(i+1));
	            for (int j=0; j<notas[i].length; j++) { // Recorre las asignaturas
	                System.out.print("Asignatura "+(j+1));
	                notas[i][j] = input.nextDouble();
	            }
	        }
	        return notas;
	    }

	    static void mostrarNotas(double[][] notas) {
	        System.out.println("Notas de los alumnos ");
	        for (int i=0; i<notas.length; i++) {
	            System.out.print("Alumno: "+(i+1));
	            for (int j=0; j<notas[i].length; j++) {
	                System.out.print(notas[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }

	    static void mostrarPromedioAlumnos(double[][] notas) {
	    	double suma =0;
	        System.out.println("Promedio de notas por alumno:");
	        for (int i=0; i<notas.length; i++) {
	            for (int j=0; j<notas[i].length; j++) {//int i-notas[i] notas por alumnos
	                suma += notas[i][j];
	            }
	            double promedio = suma/notas[i].length;
	            System.out.println("Alumno "+(i+1)+": "+promedio);
	        }
	    }

	    static void mostrarPromedioAsignaturas(double[][] notas) {
            double suma = 0;
	        System.out.println("Promedio de notas por asignatura:");
	        for (int j=0; j<notas[0].length; j++) {//int j-notas[0] notas por asignatura
	            for (int i=0; i<notas.length; i++) {
	                suma += notas[i][j];
	            }
	            double promedio = suma/notas.length;
	            System.out.println("Asignatura "+(j+1)+": "+promedio);
	        }
	  }
}
