/*
 * clase para refactorizar
 * 
 *se debe comentar todas las refactorizaciones realizadas
 *mediante comentarios de una linea o de bloque
 *
 *
 **/
package refactorizar;

//eliminado import innecesario
//especificadp un import *


import java.util.Scanner;

//cambiamos el nombre de clase UpperCameCase (inicialMayus) y descriptivo
public class EjemploRefactorizacion {
	//cambie el nombre de la constate a mayus y mas descriptivo
	final static String MENSAJE_BIENVENIDA = "Bienvenido al programa";
	
	public static void main(String[] args) {//nunca cambiar
		//separadas a declaracion por linea (a=7; b=16;)
		//movidas declaraciones a donde se usan
		//juntado declaracion e inicializacion
		
		//cambiado nombre de cadena1 y cadena1
		
		//cambiamos nombre del scanner a uno descriptivo
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println(MENSAJE_BIENVENIDA);
		System.out.println("Introduce tu dni");
		String dni = entradaTeclado.nextLine();
		System.out.println("Introduce tu nombre");
		String nombreUsuario = entradaTeclado.nextLine();
		//
		int a=7; 
		int b=16;
		
		int c = 25;
		//dimos espacios a las operaciones y corchete, y ajustamos la llave
		if ((a > b) || ((c % 5) != 0) && (((c * 3) - 1)> (b / c))) {
			System.out.println("Se cumple la condición");
		}
		c = a + (b * c) + (b / a);
		//cambiamos a signacion en bloque
		String[] diasSemana = { 
				"Lunes", 
				"Martes", 
				"Miercoles", 
				"Jueves", 
				"Viernes", 
				"Sabado" ,
				"Domingo"};
		
		mostrarDiaSemana(diasSemana);
	}
	//cambiamos parametro, posicion, corchete y nombre descriptivo
	static void mostrarDiaSemana(String[] diaSemana) {
		for (int i=0; i<diaSemana.length; i++) {
			System.out.println("El dia de la semana en el que te encuentras "
					+ "["+(i+1)+"-7] es el dia: "+diaSemana[i]);
		}
	}	
}
