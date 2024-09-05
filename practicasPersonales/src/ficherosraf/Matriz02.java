package ficherosraf;

import java.util.Scanner;

public class Matriz02 {
	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {//nombre, apellido, edad X4
		String[][] matriz = new String [3][2];
		             //cosa que pregunta // su cantidad
		
		pedirDatos(matriz);
		mostrarDatos(matriz);
		estudianteMayor(matriz);
		
		input.close();	
		
	}
	//LO PIDO TODO COMO STRING Y LUEGO PARSE LA EDAD
	static void pedirDatos (String [][] matriz) {
		for (int i=0; i<2; i++) {//la cantidad de veces
			System.out.println("Introduce el nombre: "+(i+1));//1
			matriz [0][i] = input.nextLine();
			System.out.println("Dame apellido: "+(i+1));//2
			matriz[1][i] = input.nextLine();
			System.out.println("Introduce su edad: "+(i+1));//3
			matriz [2][i] = input.nextLine();
		}
	
	}
	
	static void mostrarDatos (String[][] matriz) {
		for (int i=0; i<2; i++) {                   //nombre          apellido                  edad
			System.out.println("El/la estudiante "+matriz[0][i]+" "+matriz[1][i]+" "+ "tiene "+matriz[2][i]+" años");
		}
	}
	
	static void estudianteMayor (String[][] matriz) {
		int[] vector = new int [5];
		int mayor = vector[0];
		
		for (int i=0; i<2; i++) {//lo pido como String y lo paso a int
			vector[i] = Integer.parseInt(matriz[2][i]);//se cambio de tipo String a int para sacar el mayor
		}
		
		for (int i=0; i<4; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		System.out.println("La mayor edad la tiene "+mayor);
		}
}
