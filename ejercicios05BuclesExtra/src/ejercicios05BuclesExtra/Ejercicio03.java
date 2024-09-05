package ejercicios05BuclesExtra;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion=0;
	
		do {
			System.out.println("\nMenus de opciones");
			System.out.println("1. Volumen de una esfera");
			System.out.println("2. Numero de tres cifras con cifras por separado");
			System.out.println("3. Letras minusculas");
			System.out.println("4. Pares entre dos numeros");
			System.out.println("5. Salir");
			opcion = input.nextInt();
			switch (opcion) {
			case 1: // volumen de esfera
				System.out.println("Volumen de esfera");
				System.out.println("Introduce el radio");
				double radio = input.nextDouble();
				System.out.println("Su Volumen de esfera "+radio+ " = "+(4.0/3)*Math.PI*Math.pow(radio, 3));
				break;
			case 2: // separa numero de tres cifras
				System.out.println("tres cifras separadas");
				System.out.println("Introduce un numero de tres cifras");
				int cifras = input.nextInt();
				System.out.println("primera cifra "+(cifras/100));
				System.out.println("segunda cifra "+(cifras/10)%10);
				System.out.println("tercera cifra "+(cifras%10));
				break;
			case 3: // comprobar dos letras minusculas
				input.nextLine();
				System.out.println("comprobar minusculas");
				System.out.println("Introduce un primer caracter");
				char caracter1 = input.nextLine().charAt(0);
				System.out.println("Introduce otro caracter");
				char caracter2 = input.nextLine() .charAt(0);
				
				if (caracter1>='a' && caracter1<='z') {
					if (caracter2 >='a' && caracter2<='z') {
						System.out.println("los dos caracteres son miniscula");	
					} else {
			             // //si entra aqui es porque el primer if es cierto pero el segundo no
						System.out.println("El primero es minuscula, el segundo no");
					}
				} else if (caracter2 >='a' && caracter2 <='z') {
					System.out.println("El segundo es minuscula, el primero no");
				} else {
					System.out.println("ninguno es minuscula");
				}

				break;
			case 4: // numeros pares que hay entre un numero y otro
				System.out.println("Pares entre dos numeros");
				System.out.println("Introduce un numero");
				int numero1 = input.nextInt();
				System.out.println("Introduce otro numero que sea mayor al primero");
				int numero2 = input.nextInt();
				
				if (numero1>=numero2) {
					System.out.println("El segundo numero debe ser mayor que el primero");
				} else {
					System.out.println("Numeros pares entre "+numero1+" y "+numero2);
					for (int i=numero1; i<numero2; i++) {
						if (i%2==0) {
							System.out.println(i);
						}
					}
				}
				break;
			case 5:
				System.out.println("Fin del programa");
				break;
			}

		} while (opcion!=5); // si escoge 5 fin del bucle

		
		input.close();
	}

}