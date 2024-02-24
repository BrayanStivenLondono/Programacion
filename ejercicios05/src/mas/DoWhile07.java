package mas;

import java.util.Scanner;

public class DoWhile07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// PIDO CARACTER y dice su numero en la tabla ascii
		char caracter;
        int codigoAscii;

        do {
            System.out.print("Ingresa un caracter ('q' para salir) ");
            String cadena = input.nextLine();

            // Verificar si el usuario quiere salir
            if (cadena.equalsIgnoreCase("q")) {
                System.out.println("Saliendo del programa");
                break;
            }
            caracter = cadena.charAt(0);
            codigoAscii = (int) caracter;
            System.out.println("El código ASCII de "+caracter+" es "+codigoAscii);

        } while (true);

		input.close();
	}

}
