package prueba01;

import java.util.Scanner;

public class Mas {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numero = input.nextInt();
	
		// if      opcion (id-minimo-maximo)
		    // switch  (opcion)
		    // case 1 (syso, primitivo, if-syso, else-syso, break)
		    // case 2 (syso, primitivo, if-syso, else-syso, break)
		    // case 3 (input, syso, break)
	      // else (syso)
		
		if (numero>=0) { // tambien numero<=3
			System.out.println("1. Area del circuito");
			System.out.println("2. Volumen de la esfera");
			System.out.println("3. Salir");
			
			int opcion = input.nextInt();

			
			switch (opcion) {
			case 1:
				System.out.println("");
				double area = (Math.PI*numero*numero);
				System.out.println("El area de circuito de " + numero + " es " + area);
				break;
			   
			case 2:
				double volumen = (4*Math.PI*numero*numero*numero)/3;
				System.out.println("El volumen de esfera de " + numero + " es " + volumen);
				break;
			
			default:
				System.out.println("Fin del programa");
				break;
			   }
			} else { 
				System.out.println("El numero es negativo, no contable ");
				
			
				
			}
		
		input.close();

	}

}
