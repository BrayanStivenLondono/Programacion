package mas;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Introduce numero y acaba hasta poner 0

		int numLeido=0;
		int contadorNumLeido =0;
		int total =0;
		
		do {
			System.out.println("Introduce un numero (0 para acabar)");
			numLeido = input.nextInt();
			
			contadorNumLeido++;
			total = total+numLeido;

		} while (numLeido!=0);
		System.out.println("El total de numeros leidos es "+(contadorNumLeido-1));
		System.out.println("La suma de los numeros es "+total);//-1 para no sumar el (0) 


		
		
		
		
		input.close();
	}

}
