package mas;

import java.util.Scanner;

public class Mas02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// for anidado o un for dentro de otro for
		// (0,0) (0,0)...........
		
		System.out.println("Dame el tama�o de un lado");
		int lado = input.nextInt();

		for (int i=0; i<lado; i++) { 
			for (int j=0; j<lado; j++) {
				System.out.print("("+i+","+j+")");
			}
			
			System.out.println();
		}
		input.close();

		}

	}