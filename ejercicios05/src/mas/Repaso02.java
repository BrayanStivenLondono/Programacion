package mas;

import java.util.Scanner;

public class Repaso02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("Introduce la cantidad de numero a pedir");
		int cantidadNumero = input.nextInt();
		
		int suma = 0;
		
		for (int i=0; i<cantidadNumero; i++) {
			System.out.println("Introduce un numero");
			int numero = input.nextInt();
			
			if (numero%2==0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			suma = suma+numero;
		}
		System.out.println("La suma de lo numeros es: "+suma);
		//-----------------------------------------------------------------------
		System.out.println("Dame un numero positivo");
		int numero = input.nextInt();
		System.out.println("Sus divisores son ");
		
		for (int i=1; i<=numero; i++) {
			if (numero%i==0) {
				System.out.print(i+" ");	
			}
		}
		input.close();
	}

}
