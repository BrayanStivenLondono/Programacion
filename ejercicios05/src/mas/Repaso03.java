package mas;

import java.util.Scanner;

public class Repaso03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		int numero;
		int totalPrimos = 0;
		int total=0;
		do {
			System.out.println("Introduzca un numero entero: ");
			numero = input.nextInt();
			boolean primo = true;
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					primo = false;
					break;
				}
			}
			if (numero >= 0) {
				total++;
				if (primo) {
					System.out.println("El numero es primo.");
					totalPrimos++;
				} else {
					System.out.println("El numero no es primo.");
				}
			}
		} while (numero >= 0);
		System.out.println("El total de numeros introducidos es: " + total);
		System.out.println("El total de numeros primos es: " + totalPrimos);
		System.out.println("El total de numeros no primos es: " + (total-totalPrimos));
		
		input.close();

	}

}
