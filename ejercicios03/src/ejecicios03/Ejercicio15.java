package ejecicios03;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce una hora en formato horas:minutos:segundos");
		String horaCompleta = input.nextLine();
		
		// 12:34:56 -> esta es mi cadena
		// 12 34 56 -> tengo que separar usando los :
		// obtener las posiciones de los : -> indexOf
		
		int posicionPrimerosDosPuntos = horaCompleta.indexOf(":"); // primero
		int posicionSegundosDosPuntos = horaCompleta.lastIndexOf(":"); // segundo
		
		// obtener las subcadenas con cada parte de la hora
		// hora, minutos, segundos -> subString
		
		String horasCadena = horaCompleta.substring(0, posicionPrimerosDosPuntos);
		String minutosCadena = horaCompleta.substring(posicionPrimerosDosPuntos + 1, posicionSegundosDosPuntos);
		String segundosCadena = horaCompleta.substring(posicionSegundosDosPuntos + 1);
		
		// convierto a int
		
		int horas = Integer.parseInt(horasCadena);
		int minutos = Integer.parseInt(minutosCadena);
		int segundos = Integer.parseInt(segundosCadena);
		// if con > < .....
		if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
			System.out.println("hora correcta");
		} else {
			System.out.println("hora incorrecta");
		}

		System.out.println("Dame la fecha en formato dia/mes/ano");
		String fechaCompleta = input.nextLine();
		// obtener posicion
		int primeraBarra = fechaCompleta.indexOf("/");
		int segundaBarra = fechaCompleta.lastIndexOf("/");
		// subcadena 
		String cadenaDia = fechaCompleta.substring(0,primeraBarra);
		String cadenaMes = fechaCompleta.substring(primeraBarra + 1, segundaBarra);
		String cadenaAno = fechaCompleta.substring(segundaBarra + 1);
		// pasar a int
		int dia = Integer.parseInt(cadenaDia);
		int mes = Integer.parseInt(cadenaMes);
		int ano = Integer.parseInt(cadenaAno);
		// if con >< ......
		if (dia >=0 && dia <=24) {
			if (mes >=1 && mes <=12) {
				if (ano >=1) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("ano incorrecto");
				}
			} else {
				System.out.println("mes incorrecto");
			}
		} else {
			System.out.println("dia incorrecto");
		}
		

		input.close();

	}

}
