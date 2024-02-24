package ejercicio05;

import java.util.Scanner;

public class Principal {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		//pedimos datos
		System.out.println("Coche");
		System.out.println("Dame la marca");
		String marca = input.nextLine();
		System.out.println("Dame el modelo");
		String modelo = input.nextLine();
		System.out.println("Dame la autonomia");
		int autonomia = input.nextInt();
		System.out.println("Dame el kilimetraje");
		float kilometraje = input.nextFloat();
		
		//con esos datos llamamoa al constuctor con parametros
		Vehiculo coche = new Vehiculo (marca, modelo, autonomia, kilometraje);
		
		//mostramos
		System.out.println("Marca: "+coche.getMarca());
		System.out.println("Modelo: "+coche.getModelo());
		System.out.println("Autonomia: "+coche.getAutonomia());
		System.out.println("Kilometraje: "+coche.getKilometraje());
		
		//mostramos esSeguro
		System.out.println("Es Seguro? "+coche.esSeguro(coche.getKilometraje(), coche.getAutonomia()));
	
		input.close();
	}

}
