package ejecicios03;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dame tu peso (kg)");
		float peso = input.nextFloat();
		
		System.out.println("Dame tu altura (m)");
		float altura = input.nextFloat();
		
		float imc = peso/(altura*altura);

		if (imc<16) {
			System.out.println("Criterio de ingreso en hospital");	
		} 
		else if (imc<17) {
			System.out.println("infrapeso");
		}
		else if (imc<18) {
			System.out.println("bajo peso");
		}
		else if (imc<25) {
			System.out.println("peso normal (saludable)");
		}
		else if (imc<30) {
			System.out.println("sobrepeso(obesidad grado I)");
		}
		else if (imc<35) {
			System.out.println("sobrepeso crónico (obesidad de grado II)");
		}
		else if (imc<40) {
			System.out.println("obesidad premórbida (obesidad de grado III)");
		}
		else {
			System.out.println("obesidad mórbida (obesidad de grado IV)");

		}
		
		
		
		
		input.close();

	}

}
