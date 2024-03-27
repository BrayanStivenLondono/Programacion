package programa;

import java.util.Scanner;

import altayestilo.AltasYEstilos;
import clases.Visita;
import programa.MetodosDePeticionDatos;

public class MenuOpciones {
	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	public static void main(String[] args) {

		Visita gestor = new Visita(9, 9);
		MetodosDePeticionDatos menu = new MetodosDePeticionDatos();
		AltasYEstilos.altasIntroducidasDirectamente(gestor);

		int opcionOperacion = 0;
		do {
			System.out.println("\n============ Menú ============");
			System.out.println("|1. - Alta                    |");
			System.out.println("|2. - Buscar                  |");
			System.out.println("|3. - Eliminar                |");
			System.out.println("|4. - Listar                  |");
			System.out.println("|5. - Cambiar                 |");
			System.out.println("|6. - Listar Por Atributo     |");
			System.out.println("|7. - Ver Estadisticas        |");
			System.out.println("|8. - Salir                   |");
			System.out.println("|_____________________________|");
			System.out.print("Elige una opción: ");
			opcionOperacion = input2.nextInt();
			System.out.println();

			switch (opcionOperacion) {
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
				menu.estadisticas(gestor);
				break;
			case 8:
				System.out.println("\nFin del programa, Adios.");
				break;
			default:
				System.out.println("\nOpción incorrecta. Elige otra vez");
				break;
			}
		} while (opcionOperacion != 8);
		input2.close();
	}
}
