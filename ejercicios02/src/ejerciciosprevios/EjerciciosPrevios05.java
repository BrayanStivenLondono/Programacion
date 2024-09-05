package ejerciciosprevios;

import java.util.Scanner;

public class EjerciciosPrevios05 {

	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		System.out.println("Dame una fecha (dia/mes/aņo)");
		String cadena=input.nextLine();
		
		//comprobar si realmente tiene formato de fecha
		//fecha correcta (15/12/1995) (01/02/2005)
		//fecha incorrecta (15:12;1995)
		//obtener la posicion de las / -> 2 y 5
		
		boolean compruebaBarra = cadena.charAt(2)=='/' && cadena.charAt(5)=='/';
		System.out.println(compruebaBarra ? "formato fecha correcto" : "formato fecha incorrecto");
		
		//comprobar si realmente el dia y el mes tiene un numero correcto
		//dia entre 1 y 31
		//mes entre 1 y 12
		String dia = cadena.substring(0, 2);
		String mes = cadena.substring(3, 5);
		
		//lo paso a numero
		int numDia = Integer.parseInt(dia);
		int numMes = Integer.parseInt(mes);
		
		//compruebo
		boolean comprueboDia = numDia>=1 && numDia<=31;
		System.out.println(comprueboDia? "dia correcto":"dia incorrecto");
		boolean comprueboMes = numMes>=1 && numMes<=12;
		System.out.println(comprueboMes? "mes correcto":"mes incorrecto");
		
		
		input.close();

	}

}
