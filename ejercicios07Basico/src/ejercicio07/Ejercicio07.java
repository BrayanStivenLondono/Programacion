package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = {1,2,3,4,5,6,7,8,9,10};
		
		//calcular minimo
		
		int minimo = miVector[0]; //0=1; empieza con la primera
		int maximo = miVector[0];
		
		for (int i=0; i<miVector.length; i++)  {
			if (miVector[i]<minimo) {
				minimo = miVector[i];
			}
			if (miVector[i]>maximo) {
				maximo = miVector[i];
			}
		}
		
		//mostrar
		System.out.println("El minimo es "+minimo);
		System.out.println("El maximo es "+maximo);
		input.close();
	}

}
