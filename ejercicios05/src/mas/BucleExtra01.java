package mas;

import java.util.Scanner;

public class BucleExtra01 {

	public static void main(String[] args) { // ej 3
		Scanner input = new Scanner (System.in);
		// Una persona adquirió un producto para pagar en 20 meses. 
		// El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente.

		System.out.println("Introduce la primera cuota a pagar");
		double cuota = input.nextDouble();
		System.out.println("Introduce el numero de meses de financiacion");
		int mes = input.nextInt();
		
		double total=0;
		for (int i=0; i<=mes; i++) {
			
			System.out.println("Cuota "+i+": "+cuota);
			total = total+cuota;
			cuota = cuota*2;
		}
		System.out.println("Total pagado por el producto: "+(int)total);
		input.close();
	}

}
