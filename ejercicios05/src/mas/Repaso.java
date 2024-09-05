package mas;

import java.util.Scanner;

public class Repaso {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce la cantidad de ventas");
		int cantidadVentas = input.nextInt();
		
		int suma =0;
		
		for (int i=0; i<cantidadVentas; i++) {
			System.out.println("Introduce el importe de la venta");
			int ventas = input.nextInt();
			
			suma = suma+ventas;
			
		}
		System.out.println("Cantidad de ventas: "+cantidadVentas);
		System.out.println("Suma de las ventas: "+suma+"€");
		System.out.println("IVA: "+suma*0.21+"€");
		System.out.println("Total ventas con el IVA: "+suma*1.21+"€");
	//--------------------------------------------------------------------
		System.out.println("Introduce el número de veces que introducirás números");
		int veces = input.nextInt();
		
		double suma2 =0;
		
		for (int i=0; i<veces; i++) {
			System.out.println("Introduce un numero");
			int numero = input.nextInt();
			
			if (numero%5==0) {
				System.out.println("Es multiplo de 5");
			} else {
				System.out.println("No es multiplo de 5");
			}
			suma2 += numero;
		}
		System.out.println("La suma de todos los numeros es: "+suma2);
	    input.close();
	}

}
