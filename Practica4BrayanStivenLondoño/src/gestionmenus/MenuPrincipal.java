package gestionmenus;

import java.util.Scanner;
import clases.GestorMonumentos;
import programa.ProgramaMonumento;

public class MenuPrincipal {
	public static void realizarOperaciones () {
		Scanner input = new Scanner (System.in);
		
		int opcion =0;
		do {
            System.out.println("\n============== Men� ================");
            System.out.println("1.- Operaciones con monumento");
            System.out.println("2.- Operaciones con arquitecto");
            System.out.println("3.- Salir");
            System.out.print("Seleccione una opci�n: ");
            opcion = input.nextInt();

    		GestorMonumentos gestor = new GestorMonumentos (4,3);
    		
    		switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("Saliendo del programa. �Hasta luego!");
                break;
            default:
                System.out.println("Opci�n no v�lida. Intente de nuevo.");
                break;
           }	
		} while (opcion!=3);
	}
}


