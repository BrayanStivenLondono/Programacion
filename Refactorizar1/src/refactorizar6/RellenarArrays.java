/*
 * */ //cambio el nombre del paquete a refactorizar6
package refactorizar6;

import java.util.Scanner;

//cambio el nombre de la clase a RellenarArrays mas descriptivo y con inicial mayuscula por palabra
public class RellenarArrays {

	//hago una constante con el tamano del vector, debido a que se usa constantemente
	private static final int TAMANO_ARRAYS = 2;

	public static void main(String[] args){	
		Scanner input = new Scanner(System.in);
		
		//cambio el nombre del array a arrayDeEnteros1 mas descriptivo
		int[] arrayDeEnteros1 = new int[TAMANO_ARRAYS];
		
		//cambio el nombre del array a arrayDeEnteros2 mas descriptivo
		int[] arrayDeEnteros2 = new int[TAMANO_ARRAYS];  
		
		//elimino el syso innecesario por que los datos ya se piden dentro del for
		
		
		for(int i = 0; i < arrayDeEnteros1.length; i++) {
			System.out.println("Introduce el entero "+(i+1)+" del primer array"); //complemento el syso con "Introduce el primer entero del primer array" y agrego el (i+1) para saber cual numero se pide
			arrayDeEnteros1[i] = input.nextInt();
			
		}
		//elimino el syso innecesario por que los datos ya se piden dentro del for
		
		for(int i = 0; i < arrayDeEnteros2.length; i++){
			System.out.println("Introduce el entero "+(i+1)+" del segundo array");  /* complemento el syso con "Introduce el segundo entero del segundo array", 
			                                                     agrego un salto de linea (\n) y agrego el (i+1) para saber cual numero se pide */
			arrayDeEnteros2[i] = input.nextInt();
		}
		//cambio el nombre del array a sumaDeArrayDeEnteros mas descriptivo
		int[] sumaDeArrayDeEnteros = new int[TAMANO_ARRAYS]; 
		//Sumo las celdas de los dos arrays
		
		for (int i = 0; i < sumaDeArrayDeEnteros.length; i++) {
			sumaDeArrayDeEnteros[i] = arrayDeEnteros1[i] + arrayDeEnteros2[i];
		}
		
		for (int i = 0; i < arrayDeEnteros2.length; i++) {
			System.out.print(sumaDeArrayDeEnteros[i] + " ");
		}
		
		input.close();
	}
}