package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Vehiculo[] listaCoches = new Vehiculo [2];
		
		for (int i=0; i<listaCoches.length; i++) {
			System.out.println("Introduce el marca");
			String marca = input.nextLine();
			System.out.println("Introduce la tipo");
			String tipo = input.nextLine();
			System.out.println("Introduce el consumo");
			float consumo = input.nextFloat();
			System.out.println("Introduce el numRuedas");
			int numRuedas = input.nextInt();
			input.nextLine();
			
			listaCoches[i] = new Vehiculo (marca, tipo, consumo, numRuedas);//llamo clase
			
		}
		for (int i=0; i<listaCoches.length; i++) {
			Vehiculo.mostrarDatosVehiculo(listaCoches[i]);
			System.out.println(listaCoches[i].getVehiculoCreados());
		}
		input.close();
	}
}
