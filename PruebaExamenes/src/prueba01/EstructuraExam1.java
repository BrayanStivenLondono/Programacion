package prueba01;

import java.util.Scanner;

public class EstructuraExam1 {
	static final int LIMITE_VELOCIDAD = 120; // Constante

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("1. area");
		System.out.println("2. volumen");
		System.out.println("3. salir");
		
		// int     id > caracter entrante
		// if      opcion (id-minimo-maximo)
		    // switch  (opcion)
		    // case 1 (syso, primitivo/string, if-syso, else-syso, break)
		    // case 2 (syso, primitivo/string, if-syso, else-syso, break)
		    // case 3 (input, syso, break)
		// else (syso)
		
		// pedir caracter ASCII
		char letra2 = 'b'; // b=66 /a=65
        char letra3 = 66;  // 66=b /65=a
		
		
		// menu
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		int opcion = input.nextInt(); 
		
		if (opcion >=1 && opcion<=3) {
			
			switch (opcion) {
			case 1:
				System.out.println(""); // Introduce
				double radio = input.nextDouble();
				
				if (radio<0) { 
					System.out.println(""); //Negativo
				} else {
					System.out.println(); //"El es " + (//operacion));
				}
				break; // Fin caso 1
				
			case 2:
				System.out.println(""); 
				radio = input.nextDouble();
				
				if (radio < 0) {
					System.out.println("");
				} else {
					System.out.println("");
				}				
				break; // Fin caso 2
				
			case 3 :
				input.close();
				System.out.println(""); // Fin PROGRAMA
				break; // Fin caso 3 
				
				} // FIN switch
			
		  } else {
			System.out.println(""); // opcion no valida o existente
				
			} // FIN del if
		
		input.close();

	}

 }
