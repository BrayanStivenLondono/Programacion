package ejerciciosprevios;

public class EjercicioPrevio03 {

	public static void main(String[] args) {
		// i++ va de uno en uno
		// i=i+2 > aumenta de 2 en 2
		// i=i+3 > aumenta de 3 en 3
		
		//i++ va de uno en uno
		System.out.println("Bucle 1");
		for (int i= 0; i<10; i++) {
			System.out.print(i+" ");
	    }
	    // si cambio el incremento, puedo modificar como aumenta o disminuyye
		// i=i+2 > aumenta de 2 en 2
		System.out.println();
		System.out.println("Bucle 2");
		for (int i = 0; i < 10; i=i+2) {
			System.out.print(i+" ");	
			
		}
		// i=i+3 > aumenta de 3 en 3
		System.out.println();
		System.out.println("bucle 3");
		for (int i=12; i>=0; i=i-3) {
			System.out.print(i+" ");	

		}
			
	
	}

 }
