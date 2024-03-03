package programa;

import java.util.Scanner;
import clases.GestorMonumentos;
import programa.MenuOperaciones;

public class ProgramaMonumento {
	static Scanner input = new Scanner (System.in);
	static Scanner input2 = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		GestorMonumentos gestor = new GestorMonumentos (3,3);
		MenuOperaciones menu = new MenuOperaciones();
		MenuOperaciones.altasIntroducidasDirectamente(gestor);
	
		int opcion =0;
		do {
			System.out.println("\n=========== Menú =============");
			System.out.println("|1. - Alta                     |");
			System.out.println("|2. - Buscar                   |");
			System.out.println("|3. - Eliminar                 |");
			System.out.println("|4. - Listar                   |");
			System.out.println("|5. - Cambiar                  |");
			System.out.println("|6. - Listar Por Atributo      |");
			System.out.println("|7. - Salir                    |");
			System.out.println("|______________________________|");
			System.out.print("Elige una opción: ");
			opcion = input2.nextInt();
			
			switch (opcion) {
			case 1:
				menu.opcionesAlta(gestor);
				break;
			case 2:
				menu.opcionesBuscar(gestor);
				break;
			case 3:
				menu.opcionesEliminar(gestor);
				break;
			case 4:
				menu.opcionesListar(gestor);
				break;
			case 5:
				menu.opcionesCambiar(gestor);
				break;
			case 6:
				menu.opcionesListarPorAtributo(gestor);
				break;
			case 7:
				System.out.println("\nFin del programa. Adios.");
				break;
			default:
					System.out.println("\nOpcion incorrecta. Elige otra vez");
				break;
				}
			} while (opcion!=7);
		
		input.close();
	}
}
