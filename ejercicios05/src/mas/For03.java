package mas;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// Programa para sumar
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero");
	//	int suma = input.nextInt();
		
		for (int i=1; i<=10; i++) {
			//System.out.println(suma + "+" + i +"=" + (suma+i));
		}
		//-------------------------------------------------------------------
		// El abecedario con INT
		for (int i=65; i<91; i++) { //TABLA ASCCI (desde el caracter 65 al 91
			System.out.print((char)i);
			
			if (i=='N') {
				System.out.println("�"); 
		}
		// El abecedario con CHAR (MAS FACIL) // buscar como pedir un caracter y me diga su numero de la tabla ASCCI
		for (char j='A'; j<='Z'; j++ ) {// si pongo INT saco los numero de casa letra en la tabla
			System.out.println(j);
			
			if (j=='N') {
				System.out.println('�');
			}
		}
		
		}
		
		input.close();

	}

}