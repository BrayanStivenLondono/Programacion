package mas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Do-while se usa cuando queremos que se ejecute al menos unavez
		
		System.out.println("Introduce un numero");
		int numeroLeido = input.nextInt();
		int contador = numeroLeido;
		
		do {
			System.out.print(contador);
			contador--; //++ bucle infinito
			
		} while (contador>0);
		// 5
		// 4
		// 3
		//--------------------------------------------------------------------
		int numero; // se para hasta cuando ingresa el numero positivo
		do {
			System.out.println("Ingresa un numero positivo");
			numero = input.nextInt();
			
			if (numero<0) {
				System.out.println("El numero es negatico");
			}
		} while (numero<=0); //aparece error, (solo hay que hacer el input/entrnate)
	
		System.out.println("Has introducido un numero positivo");
		
		
		input.close();
	}

}
