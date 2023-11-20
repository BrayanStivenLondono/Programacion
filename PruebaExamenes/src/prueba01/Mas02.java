package prueba01;

import java.util.Scanner;

public class Mas02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// int     id > caracter entrante
		// if      opcion (id-minimo-maximo)
		    // switch  (opcion)
		    // case 1 (syso, primitivo, if-syso, else-syso, break)
		    // case 2 (syso, primitivo, if-syso, else-syso, break)
		    // case 3 (input, syso, break)
	      // else (syso)
		
		System.out.println("1. Comprobar numero");
		System.out.println("2. Comprobar caracter");
		System.out.println("3. Salir");

		int opcion = input.nextInt();
		
		if (opcion>=0 && opcion<=2)
			
			switch (opcion) {
			
			case 1:
				System.out.println("Introduce un numero");
				int numero = input.nextInt();
				
				if (numero<=0) {
					System.out.println("El numero es negativo");
				
				} else {
					System.out.println((numero%5==0)? "Es multiplo de 5 " : "No es multiplo de 5 "); 			
				} // antes de break dejar una llave
				break;
			case 2:
			    input.nextLine();
				System.out.println("Introduce una cadena");
				String cadena = input.nextLine();
				
				if (cadena.length() !=1) {
					System.out.println("Has introducido mas de un caracter");
					
				} else {
					int caracterAscii = (int) cadena.charAt(0);
					if ((caracterAscii >=65 && caracterAscii <=90) || caracterAscii>=97 && caracterAscii<=122); {
						System.out.println("Es una letra");
					} else if (caracterAscii >= 48 && caracterAscii <= 57) { 
				    	System.out.println("Es un numero");
				    } else {
				    	System.out.println("Es un signo");
					}
				break;
				
				} else {
			System.out.println("Has elegido salir, programa terminado");
		}
			
		input.close();

	}

}
