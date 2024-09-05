package mas;

import java.util.Scanner;

public class BucleExtra06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		
		System.out.println("Dame el numero de alumnos");
		int numeroAlumnos = input.nextInt();
		
		if (numeroAlumnos>=100) {
			System.out.println("El pago a la agencia es de "+numeroAlumnos*65+
					" euros y cada alumno debe pagar 65 euros");
		} else if (numeroAlumnos<100 &&numeroAlumnos>=50) {
			System.out.println("El pago a la agencia es de "+numeroAlumnos*70+
					" euros y cada alumno debe pagar 70 euros");
		}else if (numeroAlumnos<50 &&numeroAlumnos>=30) {
			System.out.println("El pago a la agencia es de "+numeroAlumnos*95+
					" euros y cada alumno debe pagar 95 euros");
		}else {
			System.out.println("El coste del autobús es de 4000 euros y cada "
					+"alumno debe pagar "+(4000/numeroAlumnos)+ " euros");
		}
		
		input.close();
	}

}
