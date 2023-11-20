package mas;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub

		int numero =0;
		int contadorNumero =0;
		int mayor = 0;
		int menor = 999999999;
		
		do {
			System.out.println("Introduce numeros (0 para acabar)");
			numero = input.nextInt();
			contadorNumero++;
			
			if (numero!=0 && numero>mayor) { // MAYOR (+)
				mayor = numero;
			}
			if (numero!=0 && numero<menor) { // MENOR (-)
				menor = numero;
			}
		} while (numero!=0);
		System.out.println("La cantidad de numero es "+(contadorNumero-1));
		System.out.println("El mayor es "+mayor);
		System.out.println("El menor es "+menor);
		
		input.close();
	}

}
