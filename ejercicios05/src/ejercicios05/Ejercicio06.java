package ejercicios05;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Mostrar el número de cifras de un número introducido por teclado.
		Scanner input = new Scanner (System.in);
		System.out.println("Dame Un Numero");
		int numero = input.nextInt();
		
		int contador=0;
		// dividio mientras no sea 0
		// cuento las veces que soy capaz de devidir entre 10
		
		while (numero>0) {
			System.out.println("numero");
			numero=numero/10; // 3000 300 30 3
			System.out.println("contador ");
			contador++;       //   1   2   3 4  (cifra)
			
		}
		System.out.println("El numero de cifras es " + contador);
		
		
		input.close();

	}

}
