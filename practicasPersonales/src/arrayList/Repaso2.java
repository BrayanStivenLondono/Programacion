package arrayList;

import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		int numero = 0;
		
		while (true) {
			System.out.println("Introduce un numero: ");
			numero = input.nextInt();
			
			try {
                numerosPositivos(numero);
                break; // Si el número es válido, salimos del bucle
            } catch (Exception e) {
                System.err.println("Error: "+e.getMessage());
            }
			
        }

        System.out.println("Número válido ingresado: "+numero);
        
    }
	
	public static void numerosPositivos (int numero) throws Exception {
		if (numero <=0 ) {
			Exception miExcepcion = new Exception("El numero debe ser positivo");
			throw miExcepcion;
		}
	}
}
