package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = {1,2,3,4,5,6,7,8,9,10};
		
		//calcular minimo
		
		int minimo = miVector[0];
		for (int i=0; i<miVector.length; i++)  {
			if (miVector[i]<minimo) {
				minimo = miVector[i];
			}
		}
		
		//mostrar
		System.out.println("El minimo es "+minimo);
		input.close();
	}

}
