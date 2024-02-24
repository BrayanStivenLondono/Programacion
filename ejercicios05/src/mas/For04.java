package mas;

import java.util.Scanner;

public class For04 {
	static final String MENSAJE = "Fin del programa";
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// revisar ej: 20, 19, 5
		
		// Pedir numeroes reales y sumarlos

		double suma=0; // double es real
		
		for (int i=0; i<10; i++) {
			System.out.println("Dame un numero");
			double numero = input.nextDouble();
			
			// almacena el resultado
			// suma el dato y acomuala
			suma += numero; // ACOMULADOR> le doy un valor
		}
		System.out.println("La suma es "+suma);
		System.out.println(MENSAJE);
		
		input.close();
	}

}
