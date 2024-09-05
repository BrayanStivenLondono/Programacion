package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<Empleado> lista = new ArrayList<>();
		//                                      aqui
		//atajo: caundo creas un arrylist, java no te obliga
		//si el arraylist es de Empleado, no hay que ponerlo dos veces
		int opcion = 0;
		do {
			System.out.println("\nElige el tipo de empleado");
			System.out.println("1. Empleado");
			System.out.println("2. Director");
			System.out.println("3. Operario");
			System.out.println("4. Tecnico");
			System.out.println("5. Oficial");
			System.out.println("6. Salir");
			System.out.print("Elige: ");
			opcion = input.nextInt();
			
			input.nextLine();
			
			String nombre = null;
			if (opcion!=6) {
				System.out.println("\nIntroduce un nombre");
				nombre = input.nextLine();
			}
			switch (opcion) {
			case 1:
				lista.add(new Empleado (nombre));
				break;
				//o Empleado  empleado = new Empleado (nombre)
				//lista.add(empleado) (es lo mismo)
			case 2://los mismo
				Director  director = new Director (nombre);
				lista.add(director); 
				break;
			case 3:
				lista.add(new Operario (nombre));
				break;
			case 4:
				lista.add(new Tecnico (nombre));
				break;
			case 5:
				lista.add(new Oficial (nombre));
				break;
			case 6:
				System.out.println("Salir");
				break;
			}
		} while (opcion!=6);
		
		System.out.println("\nListamos");//muestro empleado porque es la clase padre (tiene todo)
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
		
		input.close();
	}
}
