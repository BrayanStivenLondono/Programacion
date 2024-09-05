package mas;

import java.util.Scanner;

public class BucleExtra05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int numero = input.nextInt();
		
		int sumaPares =0;
		
		for (int i=2; i<=numero; i+=2) {
			sumaPares += i;
		}
		System.out.println("La suma de los numeros pares hasta "+numero+ " es: "+sumaPares);
		
		input.close();
	}

}
