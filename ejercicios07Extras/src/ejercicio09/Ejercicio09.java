package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		final int DIVISOR= 23; //Constante
		System.out.println("Dame el numero del DNI");
		int dni = input.nextInt();
		
		int res = dni%DIVISOR;//dni%23
		char letra = Ejercicio09.letraNIF(res);
		
		System.out.println("Tu DNI es: "+dni+letra);

		input.close();
	}
	public static char letraNIF (int res) {
		char[] letraNIF = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 
				'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		return letraNIF[res];
	}

}
