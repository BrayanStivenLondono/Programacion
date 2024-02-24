package repasoNav;

import java.util.Scanner;

public class Eje00 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String cadena = "";
		
		int caracter =0;
		int numero =0;
		int delimitad0r =0;
		
		do {
			System.out.println("\nIntroduce una caracter");
			cadena = input.nextLine();
			
			for (int i=0; i<cadena.length(); i++) {
				if (cadena.charAt(i)>='A' && cadena.charAt(i)<='Z') {
					System.out.println("Mayuscula");
				} else if (cadena.charAt(i)>='a' && cadena.charAt(i)<='z') {
					System.out.println("Minuscula");
				} else if (cadena.charAt(i)>='0' && cadena.charAt(i)<='9') {
					System.out.println("Numero");
				} else if (cadena.charAt(i)=='(' || cadena.charAt(i)==')') {
					System.out.println("Delimitador");

				}
			}
			
 		} while (!cadena.equals("fin"));
		
		input.close();
	}

}
