package mas;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// es multiplo de 5
		System.out.println("Introduce un numero");
		int numero = input.nextInt();
		boolean esMultiplo = false;
		
		for (int i=0; i<numero; i++) {
			if (numero%5==0) {
				esMultiplo = true;
	
			}
		
		}
		if (numero<=0) {
			System.out.println("El numero es negativo");
			
			} else {
				System.out.println("El numero es positivo");
			}

		if (esMultiplo) {
			System.out.println("Es multiplo");
		} else {
			System.out.println("No es multiplo");
		}
		
		
		input.close();		
	}

}
