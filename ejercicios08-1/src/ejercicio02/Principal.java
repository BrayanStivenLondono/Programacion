package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Coche 1");
		System.out.println("Introduce el marca");
		String marca = input.nextLine();
		System.out.println("Introduce la tipo");
		String tipo = input.nextLine();
		System.out.println("Introduce el consumo");
		float consumo = input.nextFloat();
		System.out.println("Introduce el numRuedas");
		int numRuedas = input.nextInt();
		input.nextLine(); //buffer
		//coche 1 y damos parametros
		Vehiculo coche1 = new Vehiculo (marca, tipo, consumo, numRuedas);
		
		//coche 2 (con dos parametros)
		System.out.println("\nCoche 2");
		System.out.println("Dame la marca");
		marca = input.nextLine();
		System.out.println("Dame el tipo");
		tipo = input.nextLine();
		//parametros de coche2
		Vehiculo coche2 = new Vehiculo (marca, tipo);
		
		//3
		Vehiculo coche3 = new Vehiculo (marca, tipo, consumo, numRuedas);
		System.out.println("Coche 3");
		System.out.println("Introduce el marca");
		marca = input.nextLine();
		coche3.setTipo(tipo);
		System.out.println("Introduce la tipo");
		tipo = input.nextLine();
		coche3.setMarca(marca);
		System.out.println("Introduce el consumo");
		consumo = input.nextFloat();
		coche3.setConsumo(consumo);
		System.out.println("Introduce el numRuedas");
		numRuedas = input.nextInt();
		coche3.setNumRuedas(numRuedas);
		
		mostrarDatosVehiculo(coche1);
		mostrarDatosVehiculo(coche2);
		mostrarDatosVehiculo(coche3);
		
	}
	public static void mostrarDatosVehiculo (Vehiculo coches) {
		System.out.println("\nMarca: "+coches.getMarca());
		System.out.println("Tipo: "+coches.getTipo());
		System.out.println("Consumo: "+coches.getConsumo());
		System.out.println("Numero ruedas: "+coches.getNumRuedas());
		System.out.println("Funciona "+coches.isFunciona());
		System.out.println("Km: "+coches.getKmTotales());
	}

}
