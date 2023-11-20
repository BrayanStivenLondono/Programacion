package ejercicios05;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// genero un numero deciaml entre 0 y 100
		double aleatorio=Math.random()*101;
		
		
		// lo convierto a int
		int enteroAleatrorio= (int)aleatorio;
		
		// muestro los numeros de ese aleatorio
		// hasta el -100 de 7 en 7
		
		for (int i=enteroAleatrorio;i>=-100; i=i-7) {
			System.out.println(i);
			
		}
		
		input.close();

	}

}
