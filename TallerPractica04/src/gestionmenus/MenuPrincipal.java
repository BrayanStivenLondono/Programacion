package gestionmenus;

import java.util.Scanner;
import clases.Visita;

public class MenuPrincipal {
	public static void realizarOperaciones () {
		Scanner input = new Scanner (System.in);
		
		Visita opciones = new Visita (0, 0);
		
		int opcionAListar =0;
		do {
            System.out.println("¿con que desea listar?");
            System.out.println("1 - pais ");
            System.out.println("2 - material");
            System.out.println("3 - dispobilidad");
            System.out.print("Seleccione una opción: ");
            opcionAListar = input.nextInt();
            
    		switch (opcionAListar) {
            case 1:
            	String paisAListar;
				opciones.listarMonumentoPorUbicacion(paisAListar);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opción no válida.");
                break;
           }	
		} while (opcionAListar!=3);
	}
}


