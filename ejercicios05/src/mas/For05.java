package mas;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// ACOMULADORES (MUY-IMPORTANTE) (num = num+algo) - CONTADOR (num++;) || (contador--) es igual que .(contador=contador-1 - contador-=1)
		//                                                  CONTADOR              contador++                 contador=contador+1 - contador+=1
        //------------------------------
        // SUMA = 0 (empieza)         
        // MULTIPLICAION = 1
        // RESTA = 1
        // DIVISION = 1

		int resultado = 0;
		// inicializar suma a 0, multiplicaciones a 1
		//       ini  ter  como
		for (int i=0; i<5; i++) {//ingresa 5 numero y luego lo suma
			System.out.println("Introduce un numero");
			int numero = input.nextInt();
			
			resultado += numero; // ACOMULADOR (IMPORTANTE) (guarda el resultado y lo multiplica por el siguiente
			System.out.println("el resultado es " +resultado);
				
		}
		
		input.close();

	}

}
