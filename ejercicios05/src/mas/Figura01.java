package mas;

import java.util.Scanner;

public class Figura01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// PIRAMIDE                       | PIRAMIDE INVERTIDA (altura2)----   Cuadrado hueco
		// int i=1; i<= altura;   i++     | int i=1; i<= altura;         i++ |  int i=1; i<=cuadro; i++
		// int j=1; j<= altura-i; j++     | int j=1; j<= i-1;            j++ |  int j=1; j<=cuadro; j++
		// int k=1; k<= 2*i-1;    k++     | int k=1; k<= 2*(altura-i)+1; k++ |  if (i==1 || i==cuadro || j==1 || j==cuadro)
		//-------------------------------------------------------------------
		System.out.println("Introduce la altura de la piramide");
		int altura = input.nextInt();
		
		for (int i=1; i<=altura; i++) {
			for (int j=1; j<=altura-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//-------------------------------------------------------------------------
		System.out.println("Introduce la altura del piramide invertida");
		int altura2 = input.nextInt();
		
		for (int i=1; i<=altura2; i++) {
			for (int j=1; j<=i-1; j++) {
				System.out.print(" ");	
			}
			for (int k=1; k<=2*(altura2-i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//---------------------------------------------------------------------------
		System.out.println("Introduce el tamaño del cuadrado"); // CUADRADO HUECO
		int cuadro = input.nextInt();
		for (int i=1; i<=cuadro; i++) {
			for (int j=1; j<=cuadro; j++) {
				if (i==1 || i==cuadro || j==1 || j==cuadro) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		input.close();
	}

}
