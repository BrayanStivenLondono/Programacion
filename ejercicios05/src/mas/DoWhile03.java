package mas;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// calculador de notas || no funciona
		
		double notas =0;
		double sumaNotas =0; //acomulador (acomula las notas)
		int cantidadNotas =0; //contador (cuenta las notas)
		
		do {
			System.out.println("Introduce la nota (0 para acabar)");
			notas = input.nextDouble();
			
			if (notas>=0) {
				sumaNotas = sumaNotas+notas; //acomulador
				cantidadNotas++; //contador
			}
		} while (notas>=0);
		if (cantidadNotas!=0) {//          suma todas las notas / cantidad notas
			System.out.println("La media es "+(sumaNotas/cantidadNotas));// LA MEDIA
		}

		
		
		input.close();
	}

}
