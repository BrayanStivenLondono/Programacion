package mas;

import java.util.Scanner;

public class Mas01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Estructura FOR.
		// for > necesita principio y final
		// for (variable que se usa en el bucle con su valor inicial;final;incremento)
		// la variable que se usa en el bucle, se comienza siempre por i
		  // for (inicialización; condición; actualización) {
		  // Código que se ejecutará en cada iteración
		
		// Tablas de multiplicar      inicio. condic. actual. 
	    // for (int i=1; i<=10; i++) {
			// System.out.println(numero+"x"+i+"="+numero*i);
			
		// Todas las tablas
		for (int i=0; i<=10; i++) {
			System.out.println("Tablas de multiplicar del "+i);
			for (int j=0; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		input.close();
		

	}

 }
