package mas;

import java.util.Scanner;

public class Figura02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("Introduce el tamaño del cuadrado");
		int tamaño = input.nextInt();
		
		for (int i=0; i<tamaño; i++) {
			System.out.print(" ");

			for (int j=0; j<tamaño; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//--------------------------------------------------------------------------
		System.out.println("Introduce el alto");
		int alto = input.nextInt();
		System.out.println("Introduce el ancho");
		int ancho = input.nextInt();
		
		for (int i=1; i<=alto; i++) { //primero el alto
			System.out.print(" ");
			for (int j=1; j<=ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//---------------------------------------------------------------------------
		System.out.println("Introduce la altura de la escalera");
		int altura = input.nextInt();
		
		for (int i=1; i<=altura; i++) {
			System.out.print(" ");
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//---------------------------------------------------------------------------
		System.out.println("Introduce la altura de la piramide");
		int altura2 = input.nextInt();
		
		for (int i=1; i<=altura2; i++) {
			for (int j=1; j<=altura2-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//----------------------------------------------------------------------------
		System.out.println("Introduce el alto");
		int alto2 = input.nextInt();
		System.out.println("Introduce el ancho");
		int ancho2 = input.nextInt();
		
		for (int i=0; i<alto2; i++) {
			for (int j=0; j<ancho2; j++) {
				if (i==0 || i==alto2 || j==0 || j==ancho2) {
					System.out.print(" * ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		input.close();

	}

}
