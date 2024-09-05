package parcial1;

import java.util.Scanner;

public class Split {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		String[] cad = Split.pedirCad();
		
		Split.mostrarCad(cad);
		
		input.close();
	}
	public static String[] pedirCad () {
		String[] cadena = new String [3];
		for (int i=0; i<cadena.length; i++) {
			System.out.println("Introduce la cadena "+(i));
			cadena[i] = input.nextLine();
		}
		return cadena;
	}
	public static void mostrarCad (String[] cad) {
		System.out.println("Elige una cadena");
		int elegida = input.nextInt();
		System.out.println("\nElegiste: "+cad[elegida]);
		
		int espacios =0;
		for (int i=0; i<cad[elegida].length(); i++) {
			if (cad[elegida].charAt(i)==' ') {
				espacios++;
			}
		}
		System.out.println("Cantidad espacios "+espacios);
		for (int i=0; i<espacios+1; i++) {
			String[] cadFinal = cad[elegida].split(" ");
			System.out.println(cadFinal[i]+" ");
		}
	}	
}
