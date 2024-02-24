package refactorizar5; //cambio el nombre del paquete al nombre correcto

import java.util.Scanner; //importo el Scanner 

public class Ejerc {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in); //cambio el nombre del Scanner a input y importa el Scanner en la parte superior
		
		int gramos = seleccionaGramo(input); //cambio el nombre de la variable de a gramos
		
		if(gramos >= 0) {
			
			int opcionUnidadAConvertir = selecionaTipoUnidad(input);//cambio el nombre de la viable de elecciones del menu a uno mas descriptivo
			
			input.close();

			switch (opcionUnidadAConvertir) {
			case 1:
				double kilogramos = gramos / 1000.0; //cambio el double del double a kilogramos mas descriptivo
				System.out.println(kilogramos + " kg");
				break;
			case 2:
				double hectogramos = gramos / 100.0;
				System.out.println(hectogramos + " hectogramos");
				break;
			case 3:
				double decagramos = gramos / 10.0;
				System.out.println(decagramos + " decagramos");
				break;
			case 4:
				double decigramos = gramos * 10;
				System.out.println(decigramos + " decigramos");
				break;
			case 5:
				double centigramos = gramos * 100;
				System.out.println(centigramos + " centigramos");
				break;
			case 6:
				double miligramos = gramos * 1000;
				System.out.println(miligramos + " miligramos");
				break;
			default:
				System.out.println("Opcion no contemplada");
				break;
			}
			
		} else {
			System.out.println("Los gramos no pueden ser negativos");
		}	
	}

	private static int seleccionaGramo(Scanner input) {
		System.out.println("Introduce una cantidad de gramos");
		int gramos = input.nextInt();
		return gramos;
	}

	private static int selecionaTipoUnidad(Scanner input) {
		System.out.println("1: Kilogramos");
		System.out.println("2: Hectogramos");
		System.out.println("3: Decagramos");
		System.out.println("4: decigramos");
		System.out.println("5: centigramos");
		System.out.println("6: miligramos");
		System.out.println("¿A qué unidad quieres convertirlos?");
		int opcionUnidadAConvertir = input.nextInt();
		return opcionUnidadAConvertir;
	}
}