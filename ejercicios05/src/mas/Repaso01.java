package mas;

import java.util.Scanner;

public class Repaso01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion =0;
		
		do {
			System.out.println("\nMenu de opciones");
			System.out.println("1- Nota más baja");
			System.out.println("2- Matricula correcta");
			System.out.println("3- Tablas de multiplicar");
			System.out.println("4- Ractangulo");
			System.out.println("5- Salir");
			System.out.println("Elige un opción");
			opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Introduce la cantidad de notas pedir");
				int cantidadNotas = input.nextInt();
				
				double menor =0;
				double mayor =0;
				double media =0;
				
				for (int i =0; i<cantidadNotas; i++) {
					System.out.println("Introduce las notas");
					double nota = input.nextDouble();
					
					if (i==0) {
						menor = nota;
					} else if (nota<menor) {
						menor = nota;
					}
					if (nota>mayor) {
						mayor = nota;
					}
					media += nota; // MEDIA
				}
				System.out.println("La nota mas baja es: "+menor);
				System.out.println("La nota mas alta es: "+mayor);
				System.out.println("La nota media es: "+media/cantidadNotas);

			break;
			case 2:
				System.out.println("Introduce una matricula");
				String matricula = input.nextLine();
				
				boolean numero = false;
				boolean letra = false;
				
				String matriculaNumero = matricula.substring(0,2);
				System.out.println("Numero: "+matriculaNumero);
				String matriculaLetra = matricula.substring(2,7);
				System.out.println("Letra: "+matriculaLetra);
				
				for (int i=0; i<matriculaNumero.length(); i++) {
					if (matriculaNumero.charAt(i)>='0' && matriculaNumero.charAt(i)<='9') {
						numero = true;
					}
				}
				for (int i=0; i<matriculaLetra.length(); i++) {
					if (matriculaLetra.charAt(i)>='a' && matriculaLetra.charAt(i)<='z') {
						letra = true;
					}
				}
				if (numero && letra) {
					System.out.println("Matricula correcta");
				} else {
					System.out.println("Matricula incorrecta");
				}
			break;	
			case 3:
				System.out.println("Las tablas de multiplicar");
				
				for (int i=1; i<=10; i++) {
					System.out.println("\nLa tabla del "+i);
					for (int j=1; j<=10; j++) {
						System.out.println(i+" x "+j+ " = "+i*j);
					}
				}
			break;
			case 4:
				System.out.println("Introduce el alto");
				int alto = input.nextInt();
				System.out.println("Introduce el ancho");
				int ancho = input.nextInt();
				
				for (int i=0; i<alto; i++) {
					System.out.print(" ");
					for (int j=0; j<ancho; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			break;
			case 5:
				System.out.println("Salir");
			break;
			
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opcion!=5);
		System.out.println("Fin del programa");
		
		
		input.close();
	} 
	
}
