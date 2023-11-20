package ejerciciosprevios;

import java.util.Scanner;

public class EjerciciosPrevios04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// dada una cadena que contenga una fecha
		// formato de la cadena (dia/mes/año)
		
		System.out.println("Dame una fecha (dia/mes/año)");
		String cadena = input.nextLine();
		
		// comprobar si realmente tiene formato de fecha
		// fecha correcta (12/27/2002)
		// fecha incorrecta
		
		boolean formato = cadena.charAt(2)=='/' && cadena.charAt(5)=='/';
		System.out.println(formato ? "formato fecha correcto" : "formato fecha incorrecto");
	
		// comprobar si realmente el dia y el mes tiene el numero correcto
		// dia entre 1 y 31
		// mes entre 1 y 12
		
		String dia = cadena.substring(0, 2);
		String mes = cadena.substring(3, 5);

		//Lo paso a numero
        int numDia = Integer.parseInt(dia);
        int numMes = Integer.parseInt(mes);
        
        //comprobar
        boolean comprobarDia = numDia >=1 && numDia <=31;
        System.out.println(comprobarDia? "dia correcto" : "dia incorrecto");
        boolean comprobarMes = numMes >=1 && numMes <=12;
        System.out.println(comprobarMes? "mes correcto" : "mes incorrecto");



		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();

	}

}
