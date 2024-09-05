package ejercicios05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame un numero de inicio");
		int inicio = input.nextInt();
		
		System.out.println("Dame otro numero de fin");
		int fin = input.nextInt();
		
		System.out.println("Dame el salto");
		int salto = input.nextInt();
		
		if (salto>0) {
			if (inicio>fin) 
				for (int i=inicio; i<=fin; i=i-salto) {
					System.out.println("");
			}
		}
		
		input.close();
	}

}
