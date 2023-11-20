package mas;

import java.util.Scanner;

public class Mas05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("1- Comprobar numero");
		System.out.println("2- Comprobar paréntesis y corchetes");
		System.out.println("3- Salir");
		
		int opcion = input.nextInt();
		
		if (opcion>= 1 && opcion<=2) {
			switch (opcion) {
			
			case 1:
				System.out.println("Introduce un numero entero");
				int entero = input.nextInt();
				
				if (entero<0) {
					System.out.println("El numero es negativo");
					
				} else if (entero%5==0) {
					System.out.println("Es multiplo de 5");
				} else {
					System.out.println("No es multiplo de 5");
				}
				break;
		        
			case 2: 
		        input.nextLine(); // buffer
		        System.out.println("Introduce una cadena");
		        String cadena = input.nextLine();
		        
		        if (cadena.length()!=1) {
		        	System.out.println("Has introducido mas de un caracter");
		        } else {
		        	int caracter = (int) cadena.charAt(0); //int (pido numero de caracter, CASTEO) char (de caracter a cual, A-Z)
		        	if (caracter==40 || caracter==41 || caracter==91 || caracter==93) { // pido caracter ASCII
		        		System.out.println("El caracter introducidos es delimitador");
		        	} else {
		        		System.out.println("No pertenece a los caracteres solicitados");
		        	}
		        }
		        break;
		
			}
		} else {
			System.out.println("Has elegido salir, programa terminado");
		  }
			
			input.close();

	}

}
