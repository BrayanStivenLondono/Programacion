package mas;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//CONVERTIDOR DE DICIMAL A TODOS
		// decimal > bin   (2)
		// decimal > octal (8)
		// decimal > hexa (16)
		
		System.out.println("Introduce un numero decimal para pasarlo a binario");
		int numero = input.nextInt();
		
		String resultado ="";
		
		while (numero>=1) {
			resultado = (numero%8) + resultado; 
			
			numero = numero/8;	   
		}
		System.out.println("El resultado es: "+resultado);
		
		input.close();

	}

}
