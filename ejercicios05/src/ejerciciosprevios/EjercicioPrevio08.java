package ejerciciosprevios;

import java.util.Scanner;

public class EjercicioPrevio08 {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
		
		// ACOMULADOR (MUY-IMPORTANTE)
        //------------------------------
        // SUMA = 0         
        // MULTIPLICAION = 1
        // RESTA = 1
        // DIVISION = 1

		
		int resultado = 0;
		// inicializar suma a 0, multiplicaciones a 1
		//       ini  ter  como
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un numero");
			int numero = input.nextInt();
			resultado=resultado+numero; // ACOMULADOR (IMPORTANTE) (guarda el resultado y lo multiplica por el siguiente
			System.out.println("el resultado es " + resultado);
			
			
		}


	
		input.close();
		

	
	}

}
