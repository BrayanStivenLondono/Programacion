package mas;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// DIBUJO DE UN RECTANGULO
		System.out.println("Introduce el alto");
		int alto = input.nextInt();
		
		System.out.println("Introduce el ancho");
		int ancho = input.nextInt();
		
		for (int i=0; i<alto; i++) {     // i<alto
			for (int j=0; j<ancho; j++) {// j<ancho
				System.out.print(("* ").replace('*', 'X'));
			}
			System.out.println(); // IMPORTANTE (Si pone para que salga uno encima de otro)
		} //                                                                           i<alto        
          //                                                      Diferencia           j<ancho
		//-----------------------------------------------------------------------------------
		// DIBUJO ESCALERA                                                             i<=altura
		//                                                                             j<=i
		System.out.println("Introduce la altura de la escalera"); // solo se pide altura
		int altura = input.nextInt();
				
		for (int i=1; i<=altura; i++)  {// i<=altura
			for (int j=1; j<=i; j++) {  // j<=i
				System.out.print(j);
			}
			System.out.println(); // IMP-para que salga encima del otro
		}
		// 1
		// 12
		// 123
		

		input.close();
	}

}
