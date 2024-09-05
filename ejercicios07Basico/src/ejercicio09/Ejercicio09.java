package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = new int [3]; 
		System.out.println("Introduce los valores");
		for (int i=0; i<miVector.length; i++) {
			miVector [i] = input.nextInt();
		}
		
		//calcular minimo
		int suma = 0;
		int minimo = miVector[0]; //0=1; empieza con la primera
		int maximo = miVector[0];
		
		for (int i=0; i<miVector.length; i++)  {
			if (miVector[i]<minimo) {
				minimo = miVector[i];
			}
			if (miVector[i]>maximo) {
				maximo = miVector[i];
			}
			suma = suma+miVector[i];
			
		}
		
		//mostrar
		System.out.println("El minimo es "+minimo);
		System.out.println("El maximo es "+maximo);
		System.out.println("La suma es "+suma);
		
		input.close();
	}

}
