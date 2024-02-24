package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {//[SALIO EN PRACTICA]
		Scanner input = new Scanner (System.in);
		
		int [] numeros = new int [5];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Ingresa el numero "+(i+1));
			numeros [i] = input.nextInt();
		}
		Ejercicio05.mostrarEstadistica(numeros);
		System.out.println(numeros);
		input.close();
	}
	static void mostrarEstadistica (int [] numeros) {
		
		int mayor =0;
		int menor =0;
		int contadorPositivos =0;
		int contadorNegativos =0;
		int sumaNegativos =0;
		int sumaPositivos =0;


		for (int i=0; i<numeros.length; i++) {
			if (i==0) {
				mayor = numeros[i];
				menor = numeros[i];
		} else if (numeros[i]>mayor) {
			mayor = numeros[i];
		} else if (numeros[i]<menor) {
			menor = numeros[i];
		}
		//media negativos y positivos
		if (numeros[i]>=0) {
			contadorPositivos++;
			sumaPositivos  += numeros[i];
		} else {
			contadorNegativos++;
			sumaNegativos += numeros[i];
	     	}
		
		}
		System.out.println("El mayor es "+mayor);
		System.out.println("El menor es "+menor);
		System.out.println("Media positivos "+(double)sumaPositivos/contadorPositivos);
		System.out.println("Media negativos "+(double)sumaNegativos/contadorNegativos);
		System.out.println("Media total "+(double)sumaPositivos/contadorPositivos);
		//falta el ultimo
	}

}
