package ejercicios05;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double nota;
		double sumaNotas=0;
		int cantidadNotas=0;
		
		//para calcular la media, necesito la cantidad de notas
		//sumar el total de notas
		//y dividir siempre que la cantidad de notas no sea 0
		
		do {
			System.out.println("Introduce una nota de alumno (0 para parar)");
			nota=input.nextDouble();	
			
			if (nota>=0) {
				sumaNotas=sumaNotas+nota;
				cantidadNotas++;
				
			}
		} while (nota<=0);
		
		if (cantidadNotas!=0) {
			System.out.println("La media es "+(sumaNotas/cantidadNotas));
		}
		

		input.close();

	}

}
