package mas;

import java.util.Scanner;

public class Mas01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		for (int i=0; i<=10; i++) {
			System.out.println("Tablas de multiplicar del "+i);
			for (int j=0; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		input.close();
		

	}

 }
