package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int [] miVector = {1,2,3,4,5,6,7,8,9,10};
		
		//calcular minimo
		
		int suma =0;
		for (int i=0; i<miVector.length; i++)  {
			suma += miVector[i];
		}
		
		//mostrar
		System.out.println("La suma es "+suma);
		input.close();
	}

}
