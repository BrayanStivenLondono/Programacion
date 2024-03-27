package ejeciciosprevios;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPrevio05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String nombre;
		double altura;
		
		ArrayList<Persona> personita = new ArrayList<Persona>();
		
		System.out.println("Numero de personas a introducir");
		int cantidadPersonas = input.nextInt();
		
		for (int i = 1; i <= cantidadPersonas; i++) {//el uno para el primer id
			System.out.println("Dame el nombre");
			nombre = input.nextLine();
			input.nextLine();
			System.out.println("Dame la altura");
			altura = input.nextDouble();
			personita.add(new Persona(i,nombre,altura));
		}
		System.out.println("Muestro el ArrayList");
		System.out.println(personita);
		
		input.close();
	}
}
