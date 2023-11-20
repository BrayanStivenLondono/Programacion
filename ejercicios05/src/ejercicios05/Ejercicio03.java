package ejercicios05;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero");
		int numeroLeido = input.nextInt();
		
		int contador = numeroLeido;
		
		do {
			System.out.print(contador+" ");
			contador--;
			
		} while (contador>0);
		// 5 4 3 2 1 0
	

		do {
			System.out.println(contador);
			contador--;
			
		} while (contador>0);
		//5
		//4
		//3
		
		
		input.close();
	}

}
