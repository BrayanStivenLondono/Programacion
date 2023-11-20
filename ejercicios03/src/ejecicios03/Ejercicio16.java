package ejecicios03;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce la hora en formato h:m:s");
		String horaCompleta = input.nextLine();
		
		//extraer el tipos entero las horas, minutos, segundos
		int primerosPuntos = horaCompleta.indexOf(":");	
		int segundosPuntos = horaCompleta.lastIndexOf(":");
		
		// dividir
		String horasString = horaCompleta.substring(0, primerosPuntos);
		String minutosString = horaCompleta.substring(segundosPuntos + 1, segundosPuntos);
		String segundosString = horaCompleta.substring(segundosPuntos + 1);

		// pasar a int
		int horasEntero = Integer.parseInt(horasString);
		int minutosEntero = Integer.parseInt(minutosString);
		int segundosEntero = Integer.parseInt(segundosString);
		
		//Comprobaciones
		boolean horaValida = horasEntero >= 0 && horasEntero <= 23;
		boolean minutoValido = minutosEntero >=0 && minutosEntero <=59;
		boolean segundoValido = segundosEntero >=0 && segundosEntero <=59;
		
		//comprobar valores
		if (horaValida && minutoValido && segundoValido) {
			System.out.println("El formato de hora es correcto");
		} else {
			System.out.println("El formato de hoea no es correcto");
		}
		
		System.out.println("Introduce una fecha en formato d/m/a");
		String fechaCompleta = input.nextLine();
		
		int primerBarra = fechaCompleta.indexOf('/');
		int segundaBarra = fechaCompleta.lastIndexOf('/');
		
		// dividir y pasar a Int a la vez
		int dia = Integer.parseInt(fechaCompleta.substring(0, primerBarra));
		int mes = Integer.parseInt(fechaCompleta.substring(primerBarra + 1, segundaBarra));
		int ano = Integer.parseInt(fechaCompleta.substring(segundaBarra + 1));
		
		// crear comprobacion
		boolean mesValido = mes>=0 && mes<=12;
		boolean anoValido = ano >=0;
		boolean diaValido = false;
		
		// comprobar
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
				&& dia> 0 && dia<= 31) {
			diaValido = true;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia>=0 && dia<=30) {
		
		} else if (mes == 2 && dia>0 && dia<=28 ) {
			
		} else  if (mes == 2 && dia>0 && dia<=29 && ano%4==0) {
			
		}
		if (diaValido && mesValido && anoValido) {
			System.out.println("Formato de fecha correcto");
		} else { 
			System.out.println("Formato de fecha no correcto");
		}

		
		input.close();

	}

 }
