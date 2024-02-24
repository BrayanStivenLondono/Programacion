package vector;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) { 
		Scanner input = new Scanner (System.in);
		
		int [] numeros = {1,2,3,4,5};
		int [] numeros2 = {7,2,4,9,1};
		
		System.out.println("Original");
		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
	
		System.out.println("\ninverso 1");
		Ejercicio01.invertirModo1(numeros);

		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();//-----------------------------------
		System.out.println("\ninverso 2");
		Ejercicio01.invertirModo2(numeros);

		for (int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		System.out.println("\nOrdenar");
		Ejercicio01.ordenar(numeros2);
		for (int i=0; i<numeros2.length; i++) {
			System.out.print(numeros2[i]+" ");
		}
	
		input.close();
	}
	static void invertirModo1 (int [] array) {//invierte el orden || con char ordena numero de 1 a mayor

		for (int i=0; i<array.length-1; i++) { //ORDENAR (IGUAL)
			for (int j=i+1; j<array.length; j++) {
				if (array[j]>array[i]);
				 int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
		}
    }
	static int[] invertirModo2 (int[] numero) {//corta IMP
		int[] vector = new int [numero.length];
		
		int indiceVector =0;
		for (int i=numero.length-1; i>=0; i--) {
			vector[indiceVector++] = numero[i];
		}
		return vector;
	}
	static void ordenar (int[] numero) {
		for (int i=0; i<numero.length-1; i++) {
			for (int j=i+1; j<numero.length; j++) {
				if (numero[j]<numero[i]) {
					  int aux = numero[i];
					numero[i] = numero[j];
					numero[j] = aux;
				}
			}			
		}
	}
}
