package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Profesor[] vectorProfe = new Profesor [1];
		
		for (int i = 0; i < vectorProfe.length; i++) {
			System.out.println("Dame el nombre");
			String nombre = input.nextLine();
			System.out.println("Dame el apellido");
			String apellidos = input.nextLine();
			System.out.println("Dame la edad");
			int edad = input.nextInt();
			System.out.println("Dame el ciclo");
			String ciclo = input.nextLine();
			input.nextLine();
			
			vectorProfe[i] = new Profesor (nombre, apellidos, edad, ciclo);
		}
		input.close();
		for (int i = 0; i < vectorProfe.length; i++) {
			vectorProfe[i].mostrarDatosProfesor(vectorProfe[i]);
		}
	}
}
