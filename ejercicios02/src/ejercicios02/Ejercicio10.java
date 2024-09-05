package ejercicios02;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// saca numero de la suerte con una fecha
		System.out.println("Dame un dia");
		int dia = input.nextInt();
		System.out.println("Dame un mes");
		int mes = input.nextInt();
		System.out.println("Dame un ano");
		int anno = input.nextInt();
		
		int suma = dia+mes+anno;
		int sumaTotal=0;
		// saco el valor de cifra por separado
		// fecha 12/07/1980=1999 > 1+9+9+9=28
		
		// Primera forma
		int primera = (suma/1000);
		int segunda = (suma%10);
		int tercera = (suma/100)%10;
		int cuarta =  (suma%100)/10;
		int total = primera+segunda+tercera+cuarta;

		System.out.println("El numero de la suerte es " + total);
		
		
		// Segunda forma
		sumaTotal = sumaTotal+(suma/1000); //1 > suma/1000 > primera cifra
		sumaTotal = sumaTotal+(suma%10); //1+9 > suma/10   > segunda cifra
		sumaTotal = sumaTotal+((suma/100)%10); // 1+9+9 > suma/100)%10 > tercera cifra
		sumaTotal = sumaTotal+(suma); //1+9+9+9 > suma%100)10
		System.out.println(sumaTotal);

		input.close();

	}

}
