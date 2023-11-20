package ejercicios05;

import java.util.Scanner;

public class Ejercicio04 {
	static final String MENSAJE = "Fin del programa";

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Dame un numero");
		int mayor = input.nextInt();
		
		System.out.println("Dame un otro menor al anterior");
		int menor = input.nextInt();


		System.out.println("Bucle 1");
		for (int i = mayor; i>=menor; i--) {
			System.out.println(i);	
		}
		System.out.println("Bucle 1");
		for (int i = mayor; i>=menor; i--) {
			System.out.print(i+" ");	
		
		}
		System.out.println("MENSAJE");
		
	
		
		
		
		input.close();

	}

}
